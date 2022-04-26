package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        String expectedpassword = "Forgot Your Password?";

        WebElement actualMessageText = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualMessage = actualMessageText.getText();

        Assert.assertEquals("Forgot password",expectedpassword,actualMessage);

    }

}
