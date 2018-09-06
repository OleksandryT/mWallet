package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class TestMerchantCreation extends BrowserSettings {

    @Test(groups = {"Merchants"}, enabled = false)
    public void merchantCreation () throws InterruptedException {
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
//        String message = driver.findElement(By.xpath("//*[@id=\"successmsg\"]")).getText();
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"successmsg\"]")));
        Assert.assertTrue(true, "Merchant created succesfully. Please approve the Merchant with another user with appropriate permission. Merchant ID = "+ merchantMerchant.getMerchantId());


  }

}
