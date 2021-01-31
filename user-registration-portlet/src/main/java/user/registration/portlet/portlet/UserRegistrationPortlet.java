package user.registration.portlet.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import user.registration.portlet.action.EmailUtil;
import user.registration.portlet.constants.UserRegistrationPortletKeys;
import user.registration.service.model.UserRegistration;
import user.registration.service.service.UserRegistrationLocalService;

/**
 * @author gauravkaushik
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.user",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UserRegistration",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/user_registration.jsp",
		"javax.portlet.name=" + UserRegistrationPortletKeys.USERREGISTRATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserRegistrationPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	private EmailUtil emailUtil = null;
	
	public void addUserDetails(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(UserRegistration.class.getName(), request);

		String userName = ParamUtil.getString(request, "name");
		String surName = ParamUtil.getString(request, "surname");
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = ParamUtil.getDate(serviceContext, "birthdayfield", formatter);
		System.out.println(birthDate + " "+ serviceContext);
		String email = ParamUtil.getString(request, "email");
			try {
				
				long userRegistrationId = CounterLocalServiceUtil.increment();
				_userRegistrationLocalService.addUserRegistration(userRegistrationId, userName, surName, birthDate, email,
						serviceContext);

				response.setRenderParameter("userRegistrationId", Long.toString(userRegistrationId));
				if(emailUtil == null) {
					emailUtil = new EmailUtil();
				}
				emailUtil.prepareEmail(request, response, email, userRegistrationId);
				
				response.setRenderParameter("mvcPath", "/view.jsp");
			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/view.jsp");
			}
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

			super.render(renderRequest, renderResponse);
	}
	
	@ProcessAction(name = "basicFormDataWithCaptcha")
    public void basicFormDataWithCaptcha(ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
 
        try{
            CaptchaUtil.check(actionRequest);
            log.info("CAPTCHA verification successful.");
        }catch(Exception exception) {
            if(exception instanceof CaptchaTextException) {
                SessionErrors.add(actionRequest, exception.getClass(), exception);
                log.error("CAPTCHA verification failed.");
            }
        }
    }
 
    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
        throws  IOException, PortletException {
        try {
            CaptchaUtil.serveImage(resourceRequest, resourceResponse);
        }catch(Exception exception) {
            log.error(exception.getMessage(), exception);
        }
    }
 
    protected boolean isCheckMethodOnProcessAction() {
        return _CHECK_METHOD_ON_PROCESS_ACTION;
    }
 
    private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;

	@Reference
	private UserRegistrationLocalService _userRegistrationLocalService;

}