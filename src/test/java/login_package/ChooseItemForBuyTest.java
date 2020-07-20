package login_package;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ChooseItemForBuyTest extends TestBase{

    @Test
    public void chooseItemForBuyTest(){
        startLogin();
        typeEmail("tan3su@gmail.com");
        typePassword("Tatyana123");
        clickLoginButton();

        selectLadiesDepartment();



    }

    //public void mooveToMenu(){
    //    new Action(wd.findElement(By.cssSelector()));

    //}

    public void selectLadiesDepartment() {
        click(By.xpath("//ul[@class='category-menu']//span[contains(text(),'נשים')]"));

    }
}
