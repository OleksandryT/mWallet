package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import Functions.MyprofileHelp.MyProfileHelp;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(groups = {"Merchants"} , dependsOnGroups = {"MyProfile"})
    public void merchantCreation (@Optional ("Chrome")String browser)  {
        MyProfileHelp myProfile = new MyProfileHelp(driver);
        myProfile.goToMWallet();
        myProfile.useridLocator();
        myProfile.passwordLocator();
        myProfile.signInButton();
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();

  }

}
