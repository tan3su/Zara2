package login_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase{
    WebDriver wd;


    @BeforeClass
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.zara.com/il/");


    }

    public void startLogin() {
        click(By.cssSelector("._login"));
    }

    public void clickLoginButton() {
        click(By.cssSelector(".button.logon-view__form-button"));
    }

    public void typePassword(String password) {
        type(By.cssSelector("[name='password']"), password);
    }

    public void typeEmail(String email) {
        type(By.cssSelector("[name = 'email']"), email);
    }

    public void type(By by, String text) {
        click(by);
        wd.findElement(by).clear();
        wd.findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wd.findElement(by).click();
    }

}
