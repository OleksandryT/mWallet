package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.ManageRetirement.ManageRetirementCreation;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(dependsOnGroups = {"AdminReverse"})
public class TestManualRetirement extends BrowserSettings {

    @Test(groups = {"ManageRetirement"})
    public void verifySuccessfullCreationOfRetirementWithExactAmount (){
        ManageRetirementCreation retirementWithExactAmount = new ManageRetirementCreation(driver);
        retirementWithExactAmount.createRetirementWithExactAmount();
        String successfullCreation = "Retirement transaction seccessfully started. Another PSS Admin has to confirm this transfer before it will be completed.";
        Assert.assertTrue(driver.getPageSource().contains(ManageRetirementCreation.getSuccess()),successfullCreation);
        System.out.println("Retirement was successfully created with exact amount. Second Admin should Approve");
    }

}
