package MultipleBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{
    private By _clickOnDigitalDownload = By.xpath("//ul[contains(@class,'not')]//a[contains(text(),'Digital')]");
    private By _clickOnDetails = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[3]/div[3]/a");
    private By _currentCurrencyFromDropDownMenu = By.cssSelector("select#customerCurrency");
    private By _addToCartButtons = By.cssSelector("[type='button'][value='Add to cart']");
    private By _totalItemsOnField = By.className("product-item");
    private By _addCartButtonField = By.cssSelector("[type='button'][value='Add to cart']");
    private By _registerLink = By.xpath("//a[contains(@class,'register')]");
    private By _loginbutton = By.className("ico-login");
    private By _computer =By.xpath("//ul[contains(@class,'notmobile')]//a[contains(text(),'Computers ')]");



    public void verifyUserIsOnHomePage()
    {
        assertURL("nopcommerce");
    }
    public void clickOnDigitalDownLoad()
    {
        clickOnElement(_clickOnDigitalDownload);
        sleep(2);
    }
    public void clickOnDetailsButton()
    {
        clickOnElement(_clickOnDetails);
    }

    public void addToCartButtonIsPresent()
    {
        List<WebElement>listOfItems=driver.findElements(_totalItemsOnField);
        int count = 0;

        for(WebElement items : listOfItems)
        {
            //finding how many add to cart button is present at each element
                int cartButton = items.findElements(_addToCartButtons).size();

        if(cartButton==1)
        {
            count++;
        }
        else
            {
            //get name of item not having add to cart button
                System.out.println("No add to cart button >>>>> " );

            }

        }
        Assert.assertEquals(count,listOfItems.size(),"SORRY TEST CASE FAIL");

    }
    //click on register button
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerLink);
    }

    //click on login button
    public void clickOnLogin()
    {
        clickOnElement(_loginbutton);
    }

    //click on computer button
    public void clickOnComputer(){
        clickOnElement(_computer);
    }

}

