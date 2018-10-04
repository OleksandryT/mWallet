package Tests.Smoke.Services;

import BrowserSettings.BrowserSettings;
import Functions.Services.ServiceBulkCreation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"Service"},dependsOnGroups = {"MyProfile"})
public class TestServiceBulkCreation extends BrowserSettings {

    @Test
    public void verifyCreationOfP2PPrepaidService () throws InterruptedException {
        ServiceBulkCreation serviceBulkCreation = new ServiceBulkCreation(driver);
        serviceBulkCreation.serviceRegistration();
        String successCreation = "The file uploaded has been processed successfully";
        String sM = driver.findElement(By.xpath("//*[@id=\"successmsg\"]")).getAttribute("value");
        System.out.println(driver.getPageSource().contains("uploaded"));
        Thread.sleep(5000);
        Assert.assertTrue(driver.getPageSource().contains(successCreation));
    }
}
