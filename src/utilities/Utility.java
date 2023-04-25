package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    // This method will click on the element
    public void clickOnTheElement(By by){
        driver.findElement(by).click();
    }

    // This method will send text to Element
    public void sendTextToTheElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    // This method will get text from the Element
    public String getTextFromTheElement(By by){
//        WebElement actualTextElement = driver.findElement(by);
//        String actualText = actualTextElement.getText();
        return driver.findElement(by).getText();
    }
    // this method will compare text
    public void compareText(String text, String expectedText, By by){
//        String expectedText = "";
//        String actualText = getTextFromTheElement(by);
        Assert.assertEquals(text,expectedText,getTextFromTheElement(by) );
    }

}
