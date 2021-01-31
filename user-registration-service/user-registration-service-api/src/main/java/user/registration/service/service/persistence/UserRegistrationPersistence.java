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

package user.registration.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import user.registration.service.exception.NoSuchUserRegistrationException;
import user.registration.service.model.UserRegistration;

/**
 * The persistence interface for the user registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserRegistrationUtil
 * @generated
 */
@ProviderType
public interface UserRegistrationPersistence
	extends BasePersistence<UserRegistration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserRegistrationUtil} to access the user registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user registrations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid(String uuid);

	/**
	 * Returns a range of all the user registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @return the range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the user registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the first user registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the last user registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the last user registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the user registrations before and after the current user registration in the ordered set where uuid = &#63;.
	 *
	 * @param userRegistrationId the primary key of the current user registration
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user registration
	 * @throws NoSuchUserRegistrationException if a user registration with the primary key could not be found
	 */
	public UserRegistration[] findByUuid_PrevAndNext(
			long userRegistrationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Removes all the user registrations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user registrations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user registrations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the user registration where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUserRegistrationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByUUID_G(String uuid, long groupId)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the user registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the user registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the user registration where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the user registration that was removed
	 */
	public UserRegistration removeByUUID_G(String uuid, long groupId)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the number of user registrations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching user registrations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the user registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the user registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @return the range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the user registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the first user registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the last user registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the last user registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the user registrations before and after the current user registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userRegistrationId the primary key of the current user registration
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user registration
	 * @throws NoSuchUserRegistrationException if a user registration with the primary key could not be found
	 */
	public UserRegistration[] findByUuid_C_PrevAndNext(
			long userRegistrationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Removes all the user registrations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of user registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user registrations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the user registrations where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching user registrations
	 */
	public java.util.List<UserRegistration> findByField2(boolean field2);

	/**
	 * Returns a range of all the user registrations where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @return the range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByField2(
		boolean field2, int start, int end);

	/**
	 * Returns an ordered range of all the user registrations where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user registrations where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user registrations
	 */
	public java.util.List<UserRegistration> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user registration in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the first user registration in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the last user registration in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration
	 * @throws NoSuchUserRegistrationException if a matching user registration could not be found
	 */
	public UserRegistration findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the last user registration in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user registration, or <code>null</code> if a matching user registration could not be found
	 */
	public UserRegistration fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns the user registrations before and after the current user registration in the ordered set where field2 = &#63;.
	 *
	 * @param userRegistrationId the primary key of the current user registration
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user registration
	 * @throws NoSuchUserRegistrationException if a user registration with the primary key could not be found
	 */
	public UserRegistration[] findByField2_PrevAndNext(
			long userRegistrationId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
				orderByComparator)
		throws NoSuchUserRegistrationException;

	/**
	 * Removes all the user registrations where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of user registrations where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching user registrations
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the user registration in the entity cache if it is enabled.
	 *
	 * @param userRegistration the user registration
	 */
	public void cacheResult(UserRegistration userRegistration);

	/**
	 * Caches the user registrations in the entity cache if it is enabled.
	 *
	 * @param userRegistrations the user registrations
	 */
	public void cacheResult(java.util.List<UserRegistration> userRegistrations);

	/**
	 * Creates a new user registration with the primary key. Does not add the user registration to the database.
	 *
	 * @param userRegistrationId the primary key for the new user registration
	 * @return the new user registration
	 */
	public UserRegistration create(long userRegistrationId);

	/**
	 * Removes the user registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userRegistrationId the primary key of the user registration
	 * @return the user registration that was removed
	 * @throws NoSuchUserRegistrationException if a user registration with the primary key could not be found
	 */
	public UserRegistration remove(long userRegistrationId)
		throws NoSuchUserRegistrationException;

	public UserRegistration updateImpl(UserRegistration userRegistration);

	/**
	 * Returns the user registration with the primary key or throws a <code>NoSuchUserRegistrationException</code> if it could not be found.
	 *
	 * @param userRegistrationId the primary key of the user registration
	 * @return the user registration
	 * @throws NoSuchUserRegistrationException if a user registration with the primary key could not be found
	 */
	public UserRegistration findByPrimaryKey(long userRegistrationId)
		throws NoSuchUserRegistrationException;

	/**
	 * Returns the user registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userRegistrationId the primary key of the user registration
	 * @return the user registration, or <code>null</code> if a user registration with the primary key could not be found
	 */
	public UserRegistration fetchByPrimaryKey(long userRegistrationId);

	/**
	 * Returns all the user registrations.
	 *
	 * @return the user registrations
	 */
	public java.util.List<UserRegistration> findAll();

	/**
	 * Returns a range of all the user registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @return the range of user registrations
	 */
	public java.util.List<UserRegistration> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the user registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user registrations
	 */
	public java.util.List<UserRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user registrations
	 * @param end the upper bound of the range of user registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user registrations
	 */
	public java.util.List<UserRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserRegistration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user registrations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user registrations.
	 *
	 * @return the number of user registrations
	 */
	public int countAll();

}