package login_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void TestLogin(){

        startLogin();
        typeEmail("tan3su@gmail.com");
        typePassword("Tatyana123");
        clickLoginButton();


    }



}
