package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import Functions.MyprofileHelp.MyProfileHelp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Functions.MyprofileHelp.MyProfileHelp.*;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(groups = {"Merchants"},dependsOnGroups = {"Transactions"}, enabled = false)
    public void merchantCreation (@Optional ("Chrome")String browser)  {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.goToMWallet();
        myProfile.useridLocator(userIdName);
        myProfile.passwordLocator(oldPasswordName);
        myProfile.signInButton();
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();

  }

}
