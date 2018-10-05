package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminReverse.AdminReverseCreation;
import Functions.EmoneyManagement.AdminReverse.AdminReversePending;
import Functions.MyprofileHelp.MyProfileHelp;
import Utilities.OracleDataBase.ConnectToMySQL;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Functions.EmoneyManagement.AdminReverse.AdminReversePending.ADMIN_REVERSE_TXN_ID;
import static Functions.EmoneyManagement.AdminReverse.AdminReversePending.ALREADY_REVERSED_ADMIN_TXN;
import static Functions.EmoneyManagement.AdminReverse.AdminReversePending.FIRST_ROW_WITH_TRANSACTION;

@Test(groups = {"AdminReverse"},dependsOnGroups = {"MyProfile"})
public class TestAdminReverse extends BrowserSettings {

    public String adminRev;

    @Test(dependsOnGroups = {"MyProfile"})
    public void verifySuccessfulConfirmationOfAdminReverse () throws InterruptedException {
        AdminReverseCreation adminReverse = new AdminReverseCreation(driver);
        adminReverse.setEmoneyManagement();
        adminReverse.setAdminReverse();
        adminReverse.setTxnIdField();
        adminReverse.setNotes();
        adminReverse.setReverseThisTransactionButoon();
        adminReverse.setConfirmThisTransactionButton();
        adminReverse.setGoToAdminReversalButton();
        AdminReversePending adminReversePending = new AdminReversePending(driver);
        adminReversePending.setEmoneyManagement();
        adminReversePending.setPendingAdminReverse();
        MyProfileHelp userLogOut = new MyProfileHelp(driver);
        userLogOut.loggOut();
        userLogOut.useridLocator(MyProfileHelp.getUserIdName_2());
        userLogOut.passwordLocator(MyProfileHelp.getPasswordName_2());
        userLogOut.signInButton();
        AdminReversePending adminPending = new AdminReversePending(driver);
        adminPending.setEmoneyManagement();
        adminPending.setPendingAdminReverse();
        adminPending.searchButtonAndDetails();
        adminPending.setConfimrReverseButton();
        adminRev  = driver.findElement(ADMIN_REVERSE_TXN_ID).getText();
        System.out.print("Admin rev is " + adminRev);
        String success = "Reversal transaction sucessfully confirmed.";
        Thread.sleep(5000);
        Assert.assertTrue(driver.getPageSource().contains("OT-500, Please contact Kyivstar."));
        Thread.sleep(5000);
        String sqlQuery = "select * from transaction_view where transaction_id='"+adminRev+"'";
        String actualResult = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.println(actualResult);
        System.out.println("Admin reverse was successfully confirmed");
    }

    @Test(dependsOnMethods = {"verifySuccessfulConfirmationOfAdminReverse"})
    public void verifyThatConfirmedAdminReverseCantBeReversedAgain () throws InterruptedException {
        AdminReverseCreation adminReverse = new AdminReverseCreation(driver);
        adminReverse.setEmoneyManagement();
        adminReverse.setAdminReverse();
        adminReverse.setTxnIdField();
        adminReverse.setNotes();
        adminReverse.setReverseThisTransactionButoon();
        adminReverse.setConfirmThisTransactionButton();
        String hasBeenReversed = "The Transaction has already been reversed.";
        adminRev  = driver.findElement(ALREADY_REVERSED_ADMIN_TXN).getText();
        Thread.sleep(5000);
        Assert.assertTrue(true,hasBeenReversed);
        String sqlQuery = " select * from transaction_view where transaction_id='"+adminRev+"'";
        String actualResult = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.println(actualResult);
        System.out.println("Admin reverse was successfully confirmed");
    }

    @Test(dependsOnMethods = {"verifyThatConfirmedAdminReverseCantBeReversedAgain"})
    public void verifySuccessfulRejectionOfAdminReverse () throws InterruptedException {
        AdminReverseCreation adminReverse = new AdminReverseCreation(driver);
        adminReverse.setEmoneyManagement();
        adminReverse.setAdminReverse();
        adminReverse.setTxnIdField_2();
        adminReverse.setNotes();
        adminReverse.setReverseThisTransactionButoon();
        adminReverse.setConfirmThisTransactionButton();
        adminReverse.setGoToAdminReversalButton();
        AdminReversePending adminReversePending = new AdminReversePending(driver);
        adminReversePending.setEmoneyManagement();
        adminReversePending.setPendingAdminReverse();
        MyProfileHelp userLogOut = new MyProfileHelp(driver);
        userLogOut.loggOut();
        userLogOut.useridLocator(MyProfileHelp.getUserIdName());
        userLogOut.passwordLocator(MyProfileHelp.getOldPasswordName());
        userLogOut.signInButton();
        AdminReversePending adminPending = new AdminReversePending(driver);
        adminPending.setEmoneyManagement();
        adminPending.setPendingAdminReverse();
        adminPending.searchButtonAndDetails();
        adminPending.setCommentsForRejection();
        adminPending.setRejectReverseButton();
        String successOfRejection = "Reversal transaction successfully rejected.";
        adminRev  = driver.findElement(ADMIN_REVERSE_TXN_ID).getText();
        Thread.sleep(5000);
        Assert.assertTrue(true,successOfRejection);
        String sqlQuery = " select * from transaction_view where transaction_id='"+adminRev+"'";
        String actualResult = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.println(actualResult);
        System.out.println("Admin reverse was successfully rejected.");
    }


    @Test(dependsOnMethods = {"verifySuccessfulRejectionOfAdminReverse"})
    public void verifyThatRejectedReverseCanBeReversedAndConfirmedAgain () throws InterruptedException {
        AdminReverseCreation adminReverse = new AdminReverseCreation(driver);
        adminReverse.setEmoneyManagement();
        adminReverse.setAdminReverse();
        adminReverse.setTxnIdField_2();
        adminReverse.setNotes();
        adminReverse.setReverseThisTransactionButoon();
        adminReverse.setConfirmThisTransactionButton();
        adminReverse.setGoToAdminReversalButton();
        AdminReversePending adminReversePending = new AdminReversePending(driver);
        adminReversePending.setEmoneyManagement();
        adminReversePending.setPendingAdminReverse();
        MyProfileHelp userLogOut = new MyProfileHelp(driver);
        userLogOut.loggOut();
        userLogOut.useridLocator(MyProfileHelp.getUserIdName_2());
        userLogOut.passwordLocator(MyProfileHelp.getPasswordName_2());
        userLogOut.signInButton();
        AdminReversePending adminPending = new AdminReversePending(driver);
        adminPending.setEmoneyManagement();
        adminPending.setPendingAdminReverse();
        adminPending.searchButtonAndDetails();
        adminPending.setCommentsForRejection();
        adminPending.setConfimrReverseButton();
        String success = "Reversal transaction successfully confirmed.";
        adminRev  = driver.findElement(ADMIN_REVERSE_TXN_ID).getText();;
        Thread.sleep(5000);
        Assert.assertTrue(true,success);
        String sqlQuery = " select * from transaction_view where transaction_id='"+adminRev+"'";
        String actualResult = ConnectToMySQL.executeSQLQuery("QA", sqlQuery);
        System.out.println(actualResult);
        System.out.println("Admin reverse was successfully confirmed");
    }


}
