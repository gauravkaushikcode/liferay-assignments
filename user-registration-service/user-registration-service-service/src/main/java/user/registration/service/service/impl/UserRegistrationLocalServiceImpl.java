/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package user.registration.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

import user.registration.service.exception.UserRegistrationBirthdateException;
import user.registration.service.exception.UserRegistrationEmailException;
import user.registration.service.exception.UserRegistrationNameException;
import user.registration.service.exception.UserRegistrationSurnameException;
import user.registration.service.model.UserRegistration;
import user.registration.service.service.base.UserRegistrationLocalServiceBaseImpl;

/**
 * The implementation of the user registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>user.registration.service.service.UserRegistrationLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserRegistrationLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=user.registration.service.model.UserRegistration",
	service = AopService.class
)
public class UserRegistrationLocalServiceImpl
	extends UserRegistrationLocalServiceBaseImpl {

	@Override
	public UserRegistration addUserRegistration(long userRegistrationId, String name, String surname, Date birthdate,
			String email, ServiceContext serviceContext) throws PortalException {
		
		long groupId = serviceContext.getScopeGroupId();
		
		validate(name, surname, birthdate, email);

		UserRegistration userRegistration = userRegistrationPersistence.create(userRegistrationId);

		userRegistration.setUuid(serviceContext.getUuid());
		userRegistration.setGroupId(groupId);
		userRegistration.setExpandoBridgeAttributes(serviceContext);
		userRegistration.setName(name);
		userRegistration.setSurname(surname);
		userRegistration.setBirthdate(birthdate);
		userRegistration.setEmail(email);

		userRegistrationPersistence.update(userRegistration);

		// Calls to other Liferay frameworks go here

		return userRegistration;
	}
	protected void validate(String name, String surname, Date birthdate, String email)
			throws PortalException {

			if (Validator.isNull(name)) {
				throw new UserRegistrationNameException();
			}
			if (Validator.isNull(surname)) {
				throw new UserRegistrationSurnameException();
			}

			if (!Validator.isEmailAddress(email)) {
				throw new UserRegistrationEmailException();
			}

			if (Validator.isNull(birthdate)) {
				throw new UserRegistrationBirthdateException();
			}
		}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>user.registration.service.service.UserRegistrationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>user.registration.service.service.UserRegistrationLocalServiceUtil</code>.
	 */
}