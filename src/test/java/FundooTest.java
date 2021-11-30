import base.Base;


import org.testng.annotations.Test;
import pages.Login;
import pages.Registration;

import java.net.MalformedURLException;

public class FundooTest {
    @Test
    public void testLogin() throws MalformedURLException {
        Login login = new Login();
        login.setUp();
        login.loginOperations();

        Registration registration = new Registration();
        registration.setUp();
        registration.registrationTest();
    }

}
