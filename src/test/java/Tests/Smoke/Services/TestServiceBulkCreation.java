package Tests.Smoke.Services;

import BrowserSettings.BrowserSettings;
import Functions.Services.ServiceBulkCreation;
import Utilities.OracleDataBase.ConnectToMySQL;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"Service"},dependsOnGroups = {"AdminTransfer"})
public class TestServiceBulkCreation extends BrowserSettings {

    @Test
    public void verifyCreationOfP2PPrepaidService () throws InterruptedException {
        ServiceBulkCreation serviceBulkCreation = new ServiceBulkCreation(driver);
        serviceBulkCreation.serviceRegistration();
        String successCreation = "The file uploaded has been processed successfully";
        String errorMessage = "Error : The file uploaded has not been processed";
        Thread.sleep(5000);
        Assert.assertTrue(driver.getPageSource().contains(errorMessage));
        String sqlQuery = " select * from sc_service where internal_name ='IZ_Bulk_P2P_Prepaid_TestFr'";
        String actualServiceFullName = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.print(actualServiceFullName);
    }
}
