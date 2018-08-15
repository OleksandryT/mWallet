package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Customers.LogIn;
import Functions.Merchants.MerchantCreation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(groups = {"Merchants"} , dependsOnGroups = {"BackOfficeUsers"})
    public void merchantCreation (@Optional ("Chrome")String browser)  {
        LogIn logIn = new LogIn(driver);
        logIn.signIn();
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();

  }

}
