package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp () { openBrowser(baseUrl);}

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {


        // enter valid user name into username field
        sendTextToElement(By.id("txtUsername"),"Admin");

        // enter valid password into valid password field
        sendTextToElement(By.name("txtPassword"),"admin123");

        // click on login button
        clickOnElement(By.xpath("//input[@id='btnLogin']"));

        // verify the welcome text is display
        String expectedResult = "Welcome";
        System.out.println("Welcome");

        WebElement actualResultElement = driver.findElement(By.xpath("//a[@id='welcome']"));
        String acutalresult1 = actualResultElement.getText();

        String actualResult = acutalresult1.substring(0,7);
        System.out.println(actualResult);

        Assert.assertEquals("Welcome",actualResult,expectedResult);

    }
    @After
    public void tearDown () { closeBrowser();}
}
