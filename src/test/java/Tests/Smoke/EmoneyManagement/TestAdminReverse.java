package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminReverse.AdminReverseCreation;
import Functions.EmoneyManagement.AdminReverse.AdminReversePending;
import Functions.MyprofileHelp.MyProfileHelp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdminReverse extends BrowserSettings {

    @Test(groups = {"AdminReverse"}, dependsOnGroups = {"AdminTransfer"},priority = 0)
    public void verifySuccessfulAdminReverse (){
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
        adminPending.searchByTxnID();
    }

}
