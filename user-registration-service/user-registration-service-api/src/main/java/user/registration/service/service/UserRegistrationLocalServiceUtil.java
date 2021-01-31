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

package user.registration.service.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for UserRegistration. This utility wraps
 * <code>user.registration.service.service.impl.UserRegistrationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UserRegistrationLocalService
 * @generated
 */
public class UserRegistrationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>user.registration.service.service.impl.UserRegistrationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static user.registration.service.model.UserRegistration
			addUserRegistration(
				long userRegistrationId, String name, String surname,
				java.util.Date birthdate, String email,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addUserRegistration(
			userRegistrationId, name, surname, birthdate, email,
			serviceContext);
	}

	/**
	 * Adds the user registration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userRegistration the user registration
	 * @return the user registration that was added
	 */
	public static user.registration.service.model.UserRegistration
		addUserRegistration(
			user.registration.service.model.UserRegistration userRegistration) {

		return getService().addUserRegistration(userRegistration);
	}

	/**
	 * Creates a new user registration with the primary key. Does not add the user registration to the database.
	 *
	 * @param userRegistrationId the primary key for the new user registration
	 * @return the new user registration
	 */
	public static user.registration.service.model.UserRegistration
		createUserRegistration(long userRegistrationId) {

		return getService().createUserRegistration(userRegistrationId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userRegistrationId the primary key of the user registration
	 * @return the user registration that was removed
	 * @throws PortalException if a user registration with the primary key could not be found
	 */
	public static user.registration.service.model.UserRegistration
			deleteUserRegistration(long userRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteUserRegistration(userRegistrationId);
	}

	/**
	 * Deletes the user registration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userRegistration the user registration
	 * @return the user registration that was removed
	 */
	public static user.registration.service.model.UserRegistration
		deleteUserRegistration(
			user.registration.service.model.UserRegistration userRegistration) {

		return getService().deleteUserRegistration(userRegistration);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.registration.service.model.impl.UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.registration.service.model.impl.UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static user.registration.service.model.UserRegistration
		fetchUserRegistration(long userRegistrationId) {

		return getService().fetchUserRegistration(userRegistrationId);
	}

	/**
	 * Returns the user registration matching the UUID and group.
	 *
	 * @param uuid the user registration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public static user.registration.service.model.UserRegistration
		fetchUserRegistrationByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchUserRegistrationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user registration with the primary key.
	 *
	 * @param userRegistrationId the primary key of the user registration
	 * @return the user registration
	 * @throws PortalException if a user registration with the primary key could not be found
	 */
	public static user.registration.service.model.UserRegistration
			getUserRegistration(long userRegistrationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUserRegistration(userRegistrationId);
	}

	/**
	 * Returns the user registration matching the UUID and group.
	 *
	 * @param uuid the user registration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user registration
	 * @throws PortalException if a matching user registration could not be found
	 */
	public static user.registration.service.model.UserRegistration
			getUserRegistrationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getUserRegistrationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the user registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.registration.service.model.impl.UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @return the range of user registrations
	 */
	public static java.util.List
		<user.registration.service.model.UserRegistration> getUserRegistrations(
			int start, int end) {

		return getService().getUserRegistrations(start, end);
	}

	/**
	 * Returns all the user registrations matching the UUID and company.
	 *
	 * @param uuid the UUID of the user registrations
	 * @param companyId the primary key of the company
	 * @return the matching user registrations, or an empty list if no matches were found
	 */
	public static java.util.List
		<user.registration.service.model.UserRegistration>
			getUserRegistrationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return getService().getUserRegistrationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of user registrations matching the UUID and company.
	 *
	 * @param uuid the UUID of the user registrations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching user registrations, or an empty list if no matches were found
	 */
	public static java.util.List
		<user.registration.service.model.UserRegistration>
			getUserRegistrationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<user.registration.service.model.UserRegistration>
						orderByComparator) {

		return getService().getUserRegistrationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user registrations.
	 *
	 * @return the number of user registrations
	 */
	public static int getUserRegistrationsCount() {
		return getService().getUserRegistrationsCount();
	}

	/**
	 * Updates the user registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userRegistration the user registration
	 * @return the user registration that was updated
	 */
	public static user.registration.service.model.UserRegistration
		updateUserRegistration(
			user.registration.service.model.UserRegistration userRegistration) {

		return getService().updateUserRegistration(userRegistration);
	}

	public static UserRegistrationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<UserRegistrationLocalService, UserRegistrationLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			UserRegistrationLocalService.class);

		ServiceTracker
			<UserRegistrationLocalService, UserRegistrationLocalService>
				serviceTracker =
					new ServiceTracker
						<UserRegistrationLocalService,
						 UserRegistrationLocalService>(
							 bundle.getBundleContext(),
							 UserRegistrationLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}