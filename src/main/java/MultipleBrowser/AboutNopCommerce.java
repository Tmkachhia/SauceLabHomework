package MultipleBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AboutNopCommerce extends Utils
{
    private By _commentTitle = By.cssSelector("input[id*='NewComment']");
    private By _addComment = By.cssSelector("textarea[id*='Comment']");
    private By _clickOnNewComment = By.cssSelector("input[value*='New comment']");
    private By _commentAddedMsg = By.cssSelector("div.result");
    private By _listOfComments = By.cssSelector("div.comments");

    public void verifyUserIsOnAboutNopCommercePage()
    {
        assertURL("about-nopcommerce");
    }
    public void addComments()
    {
        enterText(_commentTitle,"About NopCommerce");
        enterText(_addComment,"Very good website super");
        clickOnElement(_clickOnNewComment);
        Assert.assertEquals(getTextElement(_commentAddedMsg),loadProp.getProperty("commentSuccessMessage"),"Result not match please check");

    }
}
