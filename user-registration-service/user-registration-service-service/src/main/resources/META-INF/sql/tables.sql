create table UserRegistration (
	uuid_ VARCHAR(75) null,
	userRegistrationId LONG not null primary key,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	birthdate DATE null,
	email VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);