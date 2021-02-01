<%@ include file="/init.jsp"%>
<%
	long userRegistrationId = ParamUtil.getLong(renderRequest, "userRegistrationId");
%>
<div class="row">
	<div class="col-md-6">
		<div class="form-group">
			<p>
				<b>User Registration Successfull with Registration Id <%=userRegistrationId%>
				on <%= new Date().toLocaleString() %></b>
			</p>
		</div>
	</div>
	<div class="col-md-6">
		<div class="form-group">
			<aui:button-row cssClass="buttons">

				<portlet:renderURL var="addEntryURL">
					<portlet:param name="mvcPath" value="/user_registration.jsp" />
				</portlet:renderURL>

				<aui:button onClick="<%=addEntryURL.toString()%>"
					value="<== User Registration"></aui:button>

			</aui:button-row>
		</div>
	</div>
</div>