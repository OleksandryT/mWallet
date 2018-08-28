package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMerchantCreation extends BrowserSettings {

    @Parameters ({"browser"})
    @Test(groups = {"Merchants"},dependsOnGroups = {"MyProfile"})
    public void merchantCreation (@Optional ("Chrome")String browser)  {
//        MyProfileHelp myProfile = new MyProfileHelp(driver);
//        myProfile.goToMWallet(getUrl());
//        myProfile.useridLocator(getUserIdName());
//        myProfile.passwordLocator(getOldPasswordName());
//        myProfile.signInButton();
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
        String successCreation = driver.findElement(By.xpath("//*[@id=\"successmsg\"]")).getText();
        Assert.assertEquals(successCreation, "Merchant created succesfully. Please approve the Merchant with another user with appropriate permission. Merchant ID = "+ merchantMerchant.getMerchantId());


  }

}
