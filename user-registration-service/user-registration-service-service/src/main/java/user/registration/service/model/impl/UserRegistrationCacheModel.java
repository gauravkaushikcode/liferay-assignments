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

package user.registration.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import user.registration.service.model.UserRegistration;

/**
 * The cache model class for representing UserRegistration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserRegistrationCacheModel
	implements CacheModel<UserRegistration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserRegistrationCacheModel)) {
			return false;
		}

		UserRegistrationCacheModel userRegistrationCacheModel =
			(UserRegistrationCacheModel)object;

		if (userRegistrationId ==
				userRegistrationCacheModel.userRegistrationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userRegistrationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userRegistrationId=");
		sb.append(userRegistrationId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", birthdate=");
		sb.append(birthdate);
		sb.append(", email=");
		sb.append(email);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserRegistration toEntityModel() {
		UserRegistrationImpl userRegistrationImpl = new UserRegistrationImpl();

		if (uuid == null) {
			userRegistrationImpl.setUuid("");
		}
		else {
			userRegistrationImpl.setUuid(uuid);
		}

		userRegistrationImpl.setUserRegistrationId(userRegistrationId);

		if (name == null) {
			userRegistrationImpl.setName("");
		}
		else {
			userRegistrationImpl.setName(name);
		}

		if (surname == null) {
			userRegistrationImpl.setSurname("");
		}
		else {
			userRegistrationImpl.setSurname(surname);
		}

		if (birthdate == Long.MIN_VALUE) {
			userRegistrationImpl.setBirthdate(null);
		}
		else {
			userRegistrationImpl.setBirthdate(new Date(birthdate));
		}

		if (email == null) {
			userRegistrationImpl.setEmail("");
		}
		else {
			userRegistrationImpl.setEmail(email);
		}

		userRegistrationImpl.setGroupId(groupId);
		userRegistrationImpl.setCompanyId(companyId);
		userRegistrationImpl.setUserId(userId);

		if (userName == null) {
			userRegistrationImpl.setUserName("");
		}
		else {
			userRegistrationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userRegistrationImpl.setCreateDate(null);
		}
		else {
			userRegistrationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userRegistrationImpl.setModifiedDate(null);
		}
		else {
			userRegistrationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			userRegistrationImpl.setField1("");
		}
		else {
			userRegistrationImpl.setField1(field1);
		}

		userRegistrationImpl.setField2(field2);
		userRegistrationImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			userRegistrationImpl.setField4(null);
		}
		else {
			userRegistrationImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			userRegistrationImpl.setField5("");
		}
		else {
			userRegistrationImpl.setField5(field5);
		}

		userRegistrationImpl.resetOriginalValues();

		return userRegistrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userRegistrationId = objectInput.readLong();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		birthdate = objectInput.readLong();
		email = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userRegistrationId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		objectOutput.writeLong(birthdate);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long userRegistrationId;
	public String name;
	public String surname;
	public long birthdate;
	public String email;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;

}