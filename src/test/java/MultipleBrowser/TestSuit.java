package MultipleBrowser;

//
// import org.testng.annotations.Test;

import org.junit.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage = new HomePage();
    DigitalDownLoads digitalDownLoads = new DigitalDownLoads();
    IfYouWaitProduct ifYouWaitProduct = new IfYouWaitProduct();
    CartPage cartPage =new CartPage();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    OnePageCheckout onePageCheckout = new OnePageCheckout();
    CheckOutCompleted checkOutCompleted = new CheckOutCompleted();
    AboutNopCommerce aboutNopCommerce=new AboutNopCommerce();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    LoginPage loginPage = new LoginPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ReferProduct referProduct = new ReferProduct();
    EmailWishListPage emailWishListPage = new EmailWishListPage();

    @Test
    public void guestUserShouldAbleToCheckoutSuccessfully() {
        homePage.verifyUserIsOnHomePage();
        homePage.clickOnDigitalDownLoad();
        digitalDownLoads.verifyUserIsOnDigitalDownloadPage();
        digitalDownLoads.clickOnIfYouWaitProduct();
        ifYouWaitProduct.verifyUserIsOnProductPage();
        ifYouWaitProduct.addToCartButtonAndShoppingCart();
        cartPage.verifyUserIsOnCartPage();
        cartPage.clickOnTermsAndCondition();
        cartPage.clickOnCheckOut();
        checkOutAsGuest.verifyUserShouldOnCheckoutAsAGuestPage();
        checkOutAsGuest.clickOCheckoutAsGuestButton();
        onePageCheckout.guestEnterDetails();
        onePageCheckout.clickOnContinue();
        onePageCheckout.clickOnConfirm();
        checkOutCompleted.userIsOnCheckoutCompletedPage();

    }
    @Test
    public void guestUserShouldAbleToAddNewComment()
    {
        homePage.clickOnDetailsButton();
        aboutNopCommerce.verifyUserIsOnAboutNopCommercePage();
        aboutNopCommerce.addComments();
    }

    @Test
    public void verifyAddToCartButtonIsPresentOnHOmePage()
    {
        homePage.addToCartButtonIsPresent();
    }
    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }
    @Test
    public void registeredUserShouldAbleToReferProductToFriend()
    {
        homePage.clickOnLogin();
        loginPage.userEnterLoginDetails();

        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        //calling method to click on email to friend
        referProduct.emailProduct();

        emailWishListPage.enterEmailAddressOfFriend();
        emailWishListPage.sendEmailToFriend();
        emailWishListPage.verifyUserSeeEmailSentMessage();
    }


}
