package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “standard_user” username
        sendTextToTheElement(By.id("user-name"),"standard_user");
        // Enter “secret_sauce” password
        sendTextToTheElement(By.name("password"),"secret_sauce");
        //Click on ‘LOGIN’ button
        clickOnTheElement(By.xpath("//input[@id='login-button']"));
        // Verify the text “Products”
        compareText("Text not Displayed","Products",By.xpath("//span[contains(text(),'Products')]"));
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        // Enter “standard_user” username
        sendTextToTheElement(By.id("user-name"),"standard_user");
        // Enter “secret_sauce” password
        sendTextToTheElement(By.name("password"),"secret_sauce");
        //Click on ‘LOGIN’ button
        clickOnTheElement(By.xpath("//input[@id='login-button']"));
        // Verify that six products are displayed on page
        compareText("Product not displayed", "Sauce Labs Backpack",By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
        compareText("Product not displayed", "Sauce Labs Bike Light", By.xpath("//div[normalize-space()='Sauce Labs Bike Light']"));
        compareText("Product not displayed", "Sauce Labs Bolt T-Shirt", By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"));
        compareText("Product not displayed", "Sauce Labs Fleece Jacket", By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']"));
        compareText("Product not displayed", "Sauce Labs Onesie", By.xpath("//div[normalize-space()='Sauce Labs Onesie']"));
        compareText("Product not displayed", "Test.allTheThings() T-Shirt (Red)", By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
