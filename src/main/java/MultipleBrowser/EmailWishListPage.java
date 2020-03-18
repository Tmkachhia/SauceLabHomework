package MultipleBrowser;

import org.openqa.selenium.By;

public class EmailWishListPage extends Utils
{
    private By _friendEmail = By.id("FriendEmail");
    private By _sendEmail = By.name("send-email");
    private By _actual =By.className("result");
    private By _notRegisterActual = By.id("YourEmailAddress-error");
    LoadProp loadProp = new LoadProp();

    //enter friend's email address
    public void enterEmailAddressOfFriend()
    {
        enterText(_friendEmail,"tmkachhia@gmail.com ");
    }
    //click on send email key
    public void sendEmailToFriend(){
        clickOnElement(_sendEmail);
    }

    //Assert to verify registered user see email sent message
    public void verifyUserSeeEmailSentMessage(){
        assertTextMessage("Email not send",loadProp.getProperty("expected"),_actual);
    }

    //Assert to check non registered user see message
    public void verifyNotRegisterUserSeeErrorMessage()
    {
        assertTextMessage("fail",loadProp.getProperty(" notRegisterExpected"),_notRegisterActual);
    }
}
