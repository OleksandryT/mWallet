package Tests.Smoke.Myprofilehelp;
import BrowserSettings.BrowserSettings;
import Functions.MyprofileHelp.MyProfileHelp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Functions.MyprofileHelp.MyProfileHelp.*;
import static RandomValuesForTests.RandomValues.*;

public class TestMyProfile extends BrowserSettings {

    @Test(groups = {"MyProfile"}, priority = 0)
    public void verifyLogIn () {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.goToMWallet(getUrl());
        myProfile.useridLocator(getUserIdName());
        myProfile.passwordLocator(getOldPasswordName());
        myProfile.signInButton();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleIs("Back Office Portal"));
        Assert.assertEquals(driver.getTitle(), "Back Office Portal");

    }

    @Test (groups = "MyProfile",priority = 1,enabled = false)
    public void verifyAbilityToEditAllAccountDetails(){
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.setEditAccountDetailsBottomFiled();
        myProfile.setFirstNameUpdateDetailsField();
        myProfile.setLastNameUpdateDetailsField();
        myProfile.setEmailUpdateDetailsField(GENERATE_EMAIL(15));
        myProfile.setContactPhoneUpdateDetailsField(RANDOM_NUMBER_MSISDN);
        myProfile.setNoteUpdateDetailsField(RANDOM_STRING());
        myProfile.setNextUpdateDetailsField();
        myProfile.setConfirmUpdateDetailsField();
        System.out.println("user has already been updated");
        String welcomeField = driver.findElement(By.xpath(" //*[@id=\"welcomeUser\"]")).getText();
        System.out.println(welcomeField);
        String success = driver.findElement(By.xpath("//*[@id=\"updateAdminSuccessMessage\"]")).getText();
        System.out.println(success);
        String successMessageText = "Success : Admin updated successfully";
        Assert.assertEquals(success,successMessageText);

    }

    @Test (groups = "MyProfile",priority = 2,enabled = false)
    public void verifyAbilityToREEditAllAccountDetails()  {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.setReEditField();
        myProfile.setFirstNameUpdateDetailsField();
        myProfile.setLastNameUpdateDetailsField();
        myProfile.setEmailUpdateDetailsField(GENERATE_EMAIL(15));
        myProfile.setNoteUpdateDetailsField(RANDOM_STRING());
        myProfile.setNextUpdateDetailsField();
        myProfile.setConfirmUpdateDetailsField();
        System.out.println("User has already been reEdited");
        String welcomeField = driver.findElement(By.xpath(" //*[@id=\"welcomeUser\"]")).getText();
        System.out.println(welcomeField);
        String success = driver.findElement(By.xpath("//*[@id=\"updateAdminSuccessMessage\"]")).getText();
        System.out.println(success);
        String successMessageText = "Success : Admin updated successfully";
        Assert.assertEquals(success,successMessageText);
    }

    @Test (groups = "MyProfile",priority = 3, enabled = false)
    public void verifyAbilityToChangePassword() {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.setGoToMyAccountButton();
        myProfile.setChangePasswordBottomField();
        myProfile.setOldPasswordField(getOldPasswordName());
        myProfile.setNewPasswordFieldPasswordField(getNewPasswordName());
        myProfile.setReNewPasswordField(getNewPasswordName());
        myProfile.setSubmitPasswordChange();
        myProfile.setConfirmPasswordChangeButton();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='changePassSuccess']"))));
        String changePassSuccess = driver.findElement(By.xpath("//*[@id=\"changePassSuccess\"]")).getText();
        System.out.println(changePassSuccess);
        System.out.println("Password has successfully been changed");
        String successPassText = "Change password succeeded";
        Assert.assertEquals(changePassSuccess,successPassText);
    }

    @Test (groups = "MyProfile",priority = 4, enabled = false)
    public void verifyThatPasswordIsNotChangedIfNewPasswordIsAsPreviousOne() {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.setOldPasswordField(getNewPasswordName());
        myProfile.setNewPasswordFieldPasswordField(getOldPasswordName());
        myProfile.setReNewPasswordField(getOldPasswordName());
        myProfile.setSubmitPasswordChange();
        myProfile.setConfirmPasswordChangeButton();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='changePassFailure']"))));
        String eRrorMessage = driver.findElement(By.xpath("//*[@id='changePassFailure']")).getText();
        System.out.println(eRrorMessage);
        String eRrorMessageText = "Error : Your password is not been changed, as the new password can not be same as the previous password.";
        Assert.assertEquals(eRrorMessage,eRrorMessageText);
    }

    @Test (groups = "MyProfile",priority = 5, enabled = false)
    public void verifyThatPasswordIsNotChangedIfOldPasswordIsInvalid() {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.setOldPasswordField(RANDOM_NUMBER);
        myProfile.setNewPasswordFieldPasswordField(getOldPasswordName());
        myProfile.setReNewPasswordField(getOldPasswordName());
        myProfile.setSubmitPasswordChange();
        myProfile.setConfirmPasswordChangeButton();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='changePassFailure']"))));
        String eRrorMessage = driver.findElement(By.xpath("//*[@id='changePassFailure']")).getText();
        System.out.println(eRrorMessage);
        String eRrorMessageText = "Error : Your Password has not been changed. Invalid old Password";
        Assert.assertEquals(eRrorMessage,eRrorMessageText);
    }


}

