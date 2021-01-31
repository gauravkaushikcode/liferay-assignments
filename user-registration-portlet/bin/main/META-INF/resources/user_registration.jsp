<%@include file="/init.jsp"%>

<%
	long userRegistrationId = ParamUtil.getLong(renderRequest, "userRegistrationId");
	System.out.println(new Date());

%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addUserDetails" var="addUserDetailsURL"></portlet:actionURL>
<portlet:resourceURL id="captcha" var="captchaResourceURL" />

<div class="container">
	<h2>User Registration</h2>

	<aui:form action="<%=addUserDetailsURL%>"
		name="user_registration_form">

		<aui:model-context bean="<%=user%>"
			model="<%=UserRegistration.class%>" />

		<aui:fieldset>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<aui:input name="name" label="First Name">
							<aui:validator name="required" />
						</aui:input>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<aui:input name="surname" label="Surname">
							<aui:validator name="required" />
						</aui:input>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
					<aui:field-wrapper label="Birth Date">
						<liferay-ui:input-date name="birthdayfield" yearParam="birthYear"
							yearValue="1984" monthParam="birthMonth" monthValue="01"
							dayParam="birthDate" dayValue="17" required="true">
						</liferay-ui:input-date>
						</aui:field-wrapper>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<aui:input name="email">
							<aui:validator name="required" />
							<aui:validator name="email" />
						</aui:input>
					</div>
				</div>
			</div>
		</aui:fieldset>

		<aui:button-row>
			<liferay-captcha:captcha url="<%=captchaResourceURL%>" />
			<aui:button type="submit"></aui:button>
			<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>

		</aui:button-row>
	</aui:form>
</div>