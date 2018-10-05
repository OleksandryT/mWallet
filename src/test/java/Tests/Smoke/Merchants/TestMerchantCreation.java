package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups = {"Merchants"}, dependsOnGroups = {"MyProfile"})
public class TestMerchantCreation extends BrowserSettings {

    @Test
    public void merchantCreation () throws InterruptedException {
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
        Thread.sleep(20000);
        Assert.assertTrue(driver.getPageSource().contains("Merchant created successfully. Please approve the Merchant with another user with appropriate permission. Merchant ID = " ));
        System.out.println("Merchant was successfully created with the ID : " + merchantMerchant.merchantId());}

}
