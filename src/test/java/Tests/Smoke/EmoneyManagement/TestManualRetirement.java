package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.ManageRetirement.ManageRetirementCreation;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"AdminReverse"})
public class TestManualRetirement extends BrowserSettings {

    @Test(groups = {"ManageRetirement"})
    public void verifySuccessfullCreationOfRetirementWithExactAmount () throws InterruptedException {
        ManageRetirementCreation retirementWithExactAmount = new ManageRetirementCreation(driver);
        retirementWithExactAmount.createRetirementWithExactAmount();
        String successfullCreation = driver.findElement(By.xpath("//*[@id=\"successmsg\"]")).getAttribute("value");
        Assert.assertTrue(true,"Retirement transaction successfully started. Another PSS Admin has to confirm this transfer before it will be completed.");
        System.out.println("Retirement was successfully created with exact amount. Second Admin should Approve it");
    }

}
