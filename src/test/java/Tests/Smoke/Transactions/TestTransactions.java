package Tests.Smoke.Transactions;

import BrowserSettings.BrowserSettings;
import Functions.Transactions.TransactionHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestTransactions extends BrowserSettings {

    @Test(groups = {"Transactions"}, priority = 0, dependsOnGroups = {"MyProfile"})
    public void verifyAbilityToSearchAdminTransferSuccess() {
        TransactionHistory trx = new TransactionHistory(driver);
        trx.setTrxButton();
        trx.setTrxHistoryButton();
        trx.setTrxTypeAdminTransfer();
        trx.setTrxSuccessStatus();
        trx.setSearchButton();
        trx.successStatusTable();
//        trx.setDetailsbutton1row();
//        (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"transactionDetailsForm\"]/div[1]/div[2]/div[8]/div/label")))).getText();
    }

}
