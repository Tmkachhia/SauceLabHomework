package MultipleBrowser;

import org.openqa.selenium.By;

public class DigitalDownLoads extends Utils {
    private By _clickOnIfYouWaitProduct = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/a/img");

    public void verifyUserIsOnDigitalDownloadPage() {
        assertURL("digital-downloads");
    }

    public void clickOnIfYouWaitProduct() {
        clickOnElement(_clickOnIfYouWaitProduct);
    }
}
