package Tests.Smoke.EmoneyManagement;
import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferPending;
import Functions.MyprofileHelp.MyProfileHelp;
import Utilities.OracleDataBase.ConnectToMySQL;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import static Functions.EmoneyManagement.AdminTransfer.AdminTransferPending.TRANSACTION_ID;
import static Functions.EmoneyManagement.AdminTransfer.AdminTransferPending.TXN_ID;

@Test(groups = {"AdminTransfer"},dependsOnGroups = {"AdminReverse"})
public class TestAdminTransfer extends BrowserSettings {

    @Test
    public  void verifyThatBothSourceAndDestinationCannotBeMerchant (){
        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
        adminTransfer.setEmoneyManagement();
        adminTransfer.setAdminTransfer();
        adminTransfer.setSourceTypeDropdown();
        adminTransfer.setSourceTypeMerchantSVA();
        adminTransfer.setSourceMerchantId();
        adminTransfer.setDestinationTypeDropdown();
        java.lang.String DESTINATION_TYPE_DROPDOWN = driver.findElement(By.xpath("//*[@name='transferDestinationType']")).getText();
        Assert.assertFalse(DESTINATION_TYPE_DROPDOWN.contains("Merchant SVA"));
        System.out.println("If one of the sources is Merchant SVA another one can't be Merchant SVA ");
        Assert.assertTrue(true);
    }

    @Test (dependsOnMethods = {"verifyThatBothSourceAndDestinationCannotBeMerchant"})
    public  void verifyThatSourceAndDestinationCannotBeEqual (){
        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
        adminTransfer.setEmoneyManagement();
        adminTransfer.setAdminTransfer();
        adminTransfer.setSourceTypeDropdown();
        adminTransfer.setSourceTypeOpCo();
        adminTransfer.setDestinationTypeDropdown();
        java.lang.String DESTINATION_TYPE_DROPDOWN = driver.findElement(By.xpath("//*[@name='transferDestinationType']")).getText();
        Assert.assertFalse(DESTINATION_TYPE_DROPDOWN.contains("OpCo Fee/Commission Account"));
        System.out.println("If one of the sources is OpCo Fee/Commission Account another one can't be OpCo Fee/Commission Account");
        Assert.assertTrue(true);
    }

    @Test (dependsOnMethods = {"verifyThatSourceAndDestinationCannotBeEqual"})
    public  void verifyThatAdminTransferCanBeApproved () throws InterruptedException {
        java.lang.String txn_id;
        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
        adminTransfer.setEmoneyManagement();
        adminTransfer.setAdminTransfer();
        adminTransfer.setSourceTypeDropdown();
        adminTransfer.setSourceTypeSettlement();
        adminTransfer.setDestinationTypeDropdown();
        adminTransfer.setDestinationTypeFCRoot();
        adminTransfer.setBankA();
        adminTransfer.setAmount("100");
        adminTransfer.setNote();
        adminTransfer.setNext();
        adminTransfer.setConfirmCreationOfAdminTransfer();
        txn_id = driver.findElement(TXN_ID).getText();
        System.out.println("TXN ID is : " + txn_id);
        MyProfileHelp userLogOut = new MyProfileHelp(driver);
        userLogOut.loggOut();
        userLogOut.useridLocator(MyProfileHelp.getUserIdName());
        userLogOut.passwordLocator(MyProfileHelp.getOldPasswordName());
        userLogOut.signInButton();
        adminTransfer.setEmoneyManagement();
        AdminTransferPending adminPending = new AdminTransferPending(driver);
        adminPending.setPendingAdminTransfer();
        adminPending.searchByTxnID();
        WebElement trxID = driver.findElement(TRANSACTION_ID);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(trxID));
        if (trxID.isEnabled()) {
            trxID.click();
            trxID.clear();
            trxID.sendKeys(txn_id);
        } else
            System.out.println("Transaction field was disabled");
        adminPending.serahcForCreatedTrx();
        adminPending.setNotes();
        adminPending.setConfirmBottom();
        Assert.assertEquals(adminPending.getSuccessfulMessage(), "This Admin Transfer has been successfully approved");
        System.out.println("Admin transfer has successfully been created by First Super BO Admin and approved by Second Super BO Admin");
        Assert.assertTrue(true);
        Thread.sleep(5000);
        String sqlQuery = " select * from transaction_view where transaction_id='"+txn_id+"'";
        String actualServiceFullName = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.println(actualServiceFullName);
    }


}
