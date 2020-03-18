package MultipleBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserSelector {

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text), " \" Test Fail \"");
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextElement(By by) {
        return driver.findElement(by).getText();

    }

    public static void selectFromDropDownByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //time stamp method to create unique number
    public static String timeStamp()
    {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static void assertTextMessage(String message ,String expected,By by)
    {
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected,"Failed");
    }
}
