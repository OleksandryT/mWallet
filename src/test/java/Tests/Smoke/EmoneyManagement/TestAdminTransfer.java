package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdminTransfer extends BrowserSettings {

    @Test (groups = {"AdminTransferCreation"}, dependsOnGroups = {"MyProfile"}, priority = 0)
    public static void verifyThatBothSourceAndDestinationCannotBeMerchant (){
        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
        adminTransfer.setEmoneyManagement();
        adminTransfer.setAdminTransfer();
        adminTransfer.setSourceTypeDropdown();
        adminTransfer.setSourceTypeMerchantSVA();
        adminTransfer.setSourceMerchantId();
        adminTransfer.setDestinationTypeDropdown();
        String DESTINATION_TYPE_DROPDOWN = driver.findElement(By.xpath("//*[@name='transferDestinationType']")).getText();
        Assert.assertFalse(DESTINATION_TYPE_DROPDOWN.contains("Merchant SVA"));
        System.out.println("If one of the sources is Merchant SVA another one can't be Merchant SVA ");
    }

    @Test (groups = {"AdminTransferCreation"}, dependsOnGroups = {"MyProfile"}, priority = 1)
    public static void verifyThatSourceAndDestinationCannotBeEqual (){
        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
        adminTransfer.setEmoneyManagement();
        adminTransfer.setAdminTransfer();
        adminTransfer.setSourceTypeDropdown();
        adminTransfer.setSourceTypeOpCo();
        adminTransfer.setDestinationTypeDropdown();
        String DESTINATION_TYPE_DROPDOWN = driver.findElement(By.xpath("//*[@name='transferDestinationType']")).getText();
        Assert.assertFalse(DESTINATION_TYPE_DROPDOWN.contains("OpCo Fee/Commission Account"));
        System.out.println("If one of the sources is OpCo Fee/Commission Account another one can't be OpCo Fee/Commission Account");
    }

//    @Test (groups = {"AdminTransferCreation"}, dependsOnGroups = {"MyProfile"}, priority = 1)
//    public static void verifyThatAdminTransferCannotBeApprovedByCreator (){
//        AdminTransferCreation adminTransfer = new AdminTransferCreation(driver);
//        adminTransfer.setEmoneyManagement();
//        adminTransfer.setAdminTransfer();
//        adminTransfer.setSourceTypeDropdown();
//        adminTransfer.setSourceTypeOpCo();
//        adminTransfer.setDestinationTypeDropdown();
//        String DESTINATION_TYPE_DROPDOWN = driver.findElement(By.xpath("//*[@name='transferDestinationType']")).getText();
//        Assert.assertFalse(DESTINATION_TYPE_DROPDOWN.contains("OpCo Fee/Commission Account"));
//        System.out.println("If one of the sources is OpCo Fee/Commission Account another one can't be OpCo Fee/Commission Account");
//    }
}
