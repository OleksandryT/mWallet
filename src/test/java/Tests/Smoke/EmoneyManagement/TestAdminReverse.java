package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminReverse.AdminReverseCreation;
import Functions.EmoneyManagement.AdminReverse.AdminReversePending;
import Functions.MyprofileHelp.MyProfileHelp;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"AdminReverse"},dependsOnGroups = {"AdminTransfer"})
public class TestAdminReverse extends BrowserSettings {

    @Test
    public void verifySuccessfulConfirmationOfAdminReverse (){
        logger = extentReports.startTest("verifySuccessfulConfirmationOfAdminReverse");
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
        userLogOut.useridLocator(MyProfileHelp.getUserIdName());
        userLogOut.passwordLocator(MyProfileHelp.getOldPasswordName());
        userLogOut.signInButton();
        AdminReversePending adminPending = new AdminReversePending(driver);
        adminPending.setEmoneyManagement();
        adminPending.setPendingAdminReverse();
        adminPending.searchButtonAndDetails();
        adminPending.setConfimrReverseButton();
        String success = "Reversal transaction successfully confirmed.";
        Assert.assertTrue(true,success);
        Assert.assertTrue(true);
        System.out.println("Admin reverse was successfully confirmed");
        logger.log(LogStatus.PASS,"Test case passed is verifySuccessfulConfirmationOfAdminReverse");
    }

    @Test(dependsOnMethods = {"verifySuccessfulConfirmationOfAdminReverse"})
    public void verifyThatConfirmedAdminReverseCantBeReversedAgain (){
        logger = extentReports.startTest("verifyThatConfirmedAdminReverseCantBeReversedAgain");
        AdminReverseCreation adminReverse = new AdminReverseCreation(driver);
        adminReverse.setEmoneyManagement();
        adminReverse.setAdminReverse();
        adminReverse.setTxnIdField();
        adminReverse.setNotes();
        adminReverse.setReverseThisTransactionButoon();
        adminReverse.setConfirmThisTransactionButton();
        String hasBeenReversed = "The Transaction has already been reversed.";
        Assert.assertTrue(true,hasBeenReversed);
        System.out.println("Admin reverse was successfully confirmed");
        Assert.assertTrue(true);
        logger.log(LogStatus.PASS,"Test case passed is verifyThatConfirmedAdminReverseCantBeReversedAgain");
    }

    @Test(dependsOnMethods = {"verifyThatConfirmedAdminReverseCantBeReversedAgain"})
    public void verifySuccessfulRejectionOfAdminReverse (){
        logger = extentReports.startTest("verifySuccessfulRejectionOfAdminReverse");
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
        adminPending.setRejectReverseButton();
        String successOfRejection = "Reversal transaction successfully rejected.";
        Assert.assertTrue(true,successOfRejection);
        System.out.println("Admin reverse was successfully rejected.");
        Assert.assertTrue(true);
        logger.log(LogStatus.PASS,"Test case passed is verifySuccessfulRejectionOfAdminReverse");
    }


    @Test(dependsOnMethods = {"verifySuccessfulRejectionOfAdminReverse"})
    public void verifyThatRejectedReverseCanBeReversedAndConfirmedAgain (){
        logger = extentReports.startTest("verifySuccessfulRejectionOfAdminReverse");
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
        adminPending.setConfimrReverseButton();
        String success = "Reversal transaction successfully confirmed.";
        Assert.assertTrue(true,success);
        System.out.println("Admin reverse was successfully confirmed");
        Assert.assertTrue(true);
        logger.log(LogStatus.PASS,"Test case passed is verifyThatRejectedReverseCanBeReversedAndConfirmedAgain");
    }


}
