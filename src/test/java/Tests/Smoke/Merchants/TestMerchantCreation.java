package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.BackOfficeUser.BackOfficeUsers;
import Functions.Merchants.MerchantCreation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(groups = {"Merchants"} , dependsOnGroups = {"BackOfficeUsers"})
    public void merchantCreation (@Optional ("Chrome")String browser)  {
        BackOfficeUsers backOfficeUsers = new BackOfficeUsers(driver);
        backOfficeUsers.goToMWallet();
        backOfficeUsers.useridLocator();
        backOfficeUsers.passwordLocator();
        backOfficeUsers.signInButton();
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();

  }

}
