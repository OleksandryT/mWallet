package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import ModulesElements.Merchants.Merchant;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(priority = 1)
    public void merchantCreation (@Optional("Chrome")String browser)  {
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
  }

}
