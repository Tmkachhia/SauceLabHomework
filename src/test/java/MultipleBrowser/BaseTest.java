package MultipleBrowser;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage
{

    @Before
    public void openBrowser()
    {
        BrowserSelector.setUpBrowser();
    }
  //  @AfterTest
//    public void closeBrowser()
//    {
//        // driver.quit();
//    }
}
