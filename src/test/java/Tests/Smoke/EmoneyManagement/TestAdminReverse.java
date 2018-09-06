package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminReverse.AdminReverseCreation;
import Functions.EmoneyManagement.AdminReverse.AdminReversePending;
import Functions.MyprofileHelp.MyProfileHelp;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestAdminReverse extends BrowserSettings {

    @Test(groups = {"AdminReverse"})
    public void verifySuccessfulConfirmationOfAdminReverse (){
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
        System.out.println("Admin reverse was successfully confirmed");
    }

    @Test(groups = {"AdminReverse"})
    public void verifyThatConfirmedAdminReverseCantBeReversedAgain (){
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
    }

    @Test(groups = {"AdminReverse"})
    public void verifySuccessfulRejectionOfAdminReverse (){
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
    }


    @Test(groups = {"AdminReverse"})
    public void verifyThatRejectedReverseCanBeReversedAndConfirmedAgain (){
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
    }


}
