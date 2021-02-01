package user.registration.portlet.action;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.WebKeys;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class EmailUtil extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	public void prepareEmail(ActionRequest actionRequest, ActionResponse actionResponse, String email, Long userRegistrationId)
    {
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String encodedToken = Base64.encode((timeStamp+"email"+email+"email_"+themeDisplay.getUserId()).getBytes());
        if (sendEmail(email,encodedToken, themeDisplay, userRegistrationId)) {
            SessionMessages.add(actionRequest, "request_processed",
                    "You have sent email to \"" + email
                            + "\" successfully.");
        } else// error
        {
            SessionErrors.add(actionRequest, "problem-occurred");
        }
    }
    public boolean sendEmail(String email,String encodedToken,ThemeDisplay themeDisplay, Long userRegistrationId)
    {
        try {
            InternetAddress toAddress = new InternetAddress(email);
            InternetAddress fromAddress = new InternetAddress(themeDisplay
                    .getCompany().getEmailAddress(), "test");
            String body = "Hi<br><br> User Registration Done! <br><br> Your Registration Id:-"
                    + userRegistrationId;
            MailMessage mailMessage = new MailMessage();
            mailMessage.setTo(toAddress);
            mailMessage.setFrom(fromAddress);
            mailMessage.setSubject("User Registration "
                    + email);
            mailMessage.setBody(body);
            mailMessage.setHTMLFormat(true);
            MailServiceUtil.sendEmail(mailMessage); // Sending message
            log.info("Email Sent!!.");
        } catch (Exception e) {
        	log.error("Email sending unsuccessful.");
            return false;
        }
        return true;
    }
	
}
