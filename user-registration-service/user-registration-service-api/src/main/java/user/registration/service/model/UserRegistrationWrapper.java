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

package user.registration.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserRegistration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserRegistration
 * @generated
 */
public class UserRegistrationWrapper
	extends BaseModelWrapper<UserRegistration>
	implements ModelWrapper<UserRegistration>, UserRegistration {

	public UserRegistrationWrapper(UserRegistration userRegistration) {
		super(userRegistration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userRegistrationId", getUserRegistrationId());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("birthdate", getBirthdate());
		attributes.put("email", getEmail());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userRegistrationId = (Long)attributes.get("userRegistrationId");

		if (userRegistrationId != null) {
			setUserRegistrationId(userRegistrationId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		Date birthdate = (Date)attributes.get("birthdate");

		if (birthdate != null) {
			setBirthdate(birthdate);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	 * Returns the birthdate of this user registration.
	 *
	 * @return the birthdate of this user registration
	 */
	@Override
	public Date getBirthdate() {
		return model.getBirthdate();
	}

	/**
	 * Returns the company ID of this user registration.
	 *
	 * @return the company ID of this user registration
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this user registration.
	 *
	 * @return the create date of this user registration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this user registration.
	 *
	 * @return the email of this user registration
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the field1 of this user registration.
	 *
	 * @return the field1 of this user registration
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this user registration.
	 *
	 * @return the field2 of this user registration
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this user registration.
	 *
	 * @return the field3 of this user registration
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field4 of this user registration.
	 *
	 * @return the field4 of this user registration
	 */
	@Override
	public Date getField4() {
		return model.getField4();
	}

	/**
	 * Returns the field5 of this user registration.
	 *
	 * @return the field5 of this user registration
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the group ID of this user registration.
	 *
	 * @return the group ID of this user registration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this user registration.
	 *
	 * @return the modified date of this user registration
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this user registration.
	 *
	 * @return the name of this user registration
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this user registration.
	 *
	 * @return the primary key of this user registration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surname of this user registration.
	 *
	 * @return the surname of this user registration
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the user ID of this user registration.
	 *
	 * @return the user ID of this user registration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this user registration.
	 *
	 * @return the user name of this user registration
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user registration ID of this user registration.
	 *
	 * @return the user registration ID of this user registration
	 */
	@Override
	public long getUserRegistrationId() {
		return model.getUserRegistrationId();
	}

	/**
	 * Returns the user uuid of this user registration.
	 *
	 * @return the user uuid of this user registration
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user registration.
	 *
	 * @return the uuid of this user registration
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this user registration is field2.
	 *
	 * @return <code>true</code> if this user registration is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birthdate of this user registration.
	 *
	 * @param birthdate the birthdate of this user registration
	 */
	@Override
	public void setBirthdate(Date birthdate) {
		model.setBirthdate(birthdate);
	}

	/**
	 * Sets the company ID of this user registration.
	 *
	 * @param companyId the company ID of this user registration
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this user registration.
	 *
	 * @param createDate the create date of this user registration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this user registration.
	 *
	 * @param email the email of this user registration
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the field1 of this user registration.
	 *
	 * @param field1 the field1 of this user registration
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this user registration is field2.
	 *
	 * @param field2 the field2 of this user registration
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this user registration.
	 *
	 * @param field3 the field3 of this user registration
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field4 of this user registration.
	 *
	 * @param field4 the field4 of this user registration
	 */
	@Override
	public void setField4(Date field4) {
		model.setField4(field4);
	}

	/**
	 * Sets the field5 of this user registration.
	 *
	 * @param field5 the field5 of this user registration
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the group ID of this user registration.
	 *
	 * @param groupId the group ID of this user registration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this user registration.
	 *
	 * @param modifiedDate the modified date of this user registration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this user registration.
	 *
	 * @param name the name of this user registration
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this user registration.
	 *
	 * @param primaryKey the primary key of this user registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surname of this user registration.
	 *
	 * @param surname the surname of this user registration
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the user ID of this user registration.
	 *
	 * @param userId the user ID of this user registration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this user registration.
	 *
	 * @param userName the user name of this user registration
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user registration ID of this user registration.
	 *
	 * @param userRegistrationId the user registration ID of this user registration
	 */
	@Override
	public void setUserRegistrationId(long userRegistrationId) {
		model.setUserRegistrationId(userRegistrationId);
	}

	/**
	 * Sets the user uuid of this user registration.
	 *
	 * @param userUuid the user uuid of this user registration
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user registration.
	 *
	 * @param uuid the uuid of this user registration
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected UserRegistrationWrapper wrap(UserRegistration userRegistration) {
		return new UserRegistrationWrapper(userRegistration);
	}

}