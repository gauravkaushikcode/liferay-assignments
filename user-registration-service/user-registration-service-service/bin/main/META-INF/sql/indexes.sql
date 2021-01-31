create index IX_645DD0F6 on UserRegistration (field2);
create index IX_885EAA7E on UserRegistration (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8DEBB880 on UserRegistration (uuid_[$COLUMN_LENGTH:75$], groupId);