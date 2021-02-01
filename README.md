# liferay-assignments

Purpose :-

To design and develop a Web MVC application (it can be a traditional Java EE application, a
plugin or a Liferay module) to showcase a form with the following fields:
● Name
● Surname
● Birthdate
● Email
● Captcha
This information will be stored on a database adding also the date when the registration
happened. Once stored, an email will be sent to the person doing the registration
confirming that it was successful.

Github Link :- https://github.com/gauravkaushikcode/liferay-assignments

Source Code :-
The application is Liferay based Modules and needs Liferay environment to compile the code and execute.
There are two modules inside the code User Registration Porltet and Service.
1. User Registration Portlet :-
	This modules has the view and controller layer of the application. The view layer has user_registration jsp as a display template supported by view.jsp and init.jsp files.
	The controller part is in the UserRefistrationPortlet.java file that extends MVC portlet from Liferay library and controls the logic of the application and also makes a service request through UserRegistrationApi to the Service layer.
	This module also has a EmailUtil.java that is used to send email once the registration is completed.
2. User Registration Service :-
	This module has the service layer of the application and conprises of two sub-modules inside it UserRegistrationApi and UserRegistrationService.

How to execute :-
1. Mail Server configuration :-
	To be able to send an email via application it needs to have a mailing server, which can be configured easily from portal-ext.properties or control panel.
	portal-ext.properties file will have following to enable the mailing service in liferay :- (please fill in the user and password as properties)
	
	mail.session.mail=true
	mail.session.mail.pop3.host=pop.gmail.com
	mail.session.mail.pop3.password=
	mail.session.mail.pop3.port=110
	mail.session.mail.pop3.user=
	mail.session.mail.smtp.auth=true
	mail.session.mail.smtp.host=smtp.gmail.com
	mail.session.mail.smtp.password=
	mail.session.mail.smtp.port=465
	mail.session.mail.smtp.user=
	mail.session.mail.store.protocol=pop3
	mail.session.mail.transport.protocol=smtp
	
2. Application execution:-
	We need a liferay workspace which is very easy and can be created using LiferayStudio, IDE or using blade (blade init <workspaceName>).
	Start with UserRegistrationService module,
		If there are any issue related to service layer please check service.xml(this defines and object-relational map for the application) and to build a service from a service.xml file, one can use Liferay IDE, Liferay Developer Studio, or use a terminal window (blade gw buildService or gradlew buildService) in this case because it is a gradle build.
	Build the jar files from the modules using liferay studio or blade cli (blade gw jar)
	This will provide respective jar files in this case there will 3 jars one for UserRegistrationPortlet, UserRegistrationAPI and UserRegistrationService.
	If the environement is configured then one can use deploy command from Liferay Studio or blade cli (blade deploy) to deploy the jar files.
	Otherwise, drop the jar files in the deploy folder to be deployed to the application server.
	Access the liferay environment from browser and find the portlet under User category on the Add application panel and Add it to some page.

