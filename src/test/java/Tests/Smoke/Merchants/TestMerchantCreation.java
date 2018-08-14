package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation {
    BrowserSettings bs;
    WebDriver driver = bs.getDriver();

    @Parameters ({"browser"})
    @Test(dependsOnGroups = {"BackOfficeUsers"})
    public void merchantCreation ()  {
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
  }

}
