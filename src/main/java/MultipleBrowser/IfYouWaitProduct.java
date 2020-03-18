package MultipleBrowser;

import org.openqa.selenium.By;

public class IfYouWaitProduct extends Utils {
    private By _addToCart = By.xpath("//*[@id=\"add-to-cart-button-35\"]");
    private By _shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    private By _closeTab = By.xpath("//span[@class='close']");


    public void verifyUserIsOnProductPage() {
        assertURL("donation");
    }

    public void addToCartButtonAndShoppingCart() {
        clickOnElement(_addToCart);
        clickOnElement(_closeTab);
        sleep(1);
        clickOnElement(_shoppingCart);
        sleep(1);
    }
}
