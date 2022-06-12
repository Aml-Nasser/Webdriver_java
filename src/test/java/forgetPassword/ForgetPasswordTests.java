package forgetPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgetPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertTrue(emailSentPage.getMessage().contains("Your e-mail's been sent!"), "Fail to update Password");
    }

}
