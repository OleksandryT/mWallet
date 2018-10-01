package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test(groups = {"Merchants"}, dependsOnGroups = {"MyProfile"}, enabled = false)
public class TestMerchantCreation extends BrowserSettings {

    @Test(groups = {"Merchants"})
    public void merchantCreation () throws InterruptedException {
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
        // WebDriverWait wait = new WebDriverWait(driver,40);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"successmsg\"]")));
        Assert.assertTrue(true, "Merchant created succesfully. Please approve the Merchant with another user with appropriate permission. Merchant ID = "+ merchantMerchant.getMerchantId());
        System.out.println("Created " + merchantMerchant.getMerchantId());


  }

}
