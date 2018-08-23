package Tests.Smoke.Transactions;

import BrowserSettings.BrowserSettings;
import Functions.Transactions.TransactionHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestTransactions extends BrowserSettings {

    @Test(groups = {"Transactions"}, priority = 0, dependsOnGroups = {"MyProfile"})
    public void verifyAbilityToSearchAdminTransferSuccess() throws InterruptedException {
        TransactionHistory trx = new TransactionHistory(driver);
        trx.setTrxButton();
        trx.setTrxHistoryButton();
        trx.setTrxTypeAdminTransfer();
        trx.setTrxSuccessStatus();
        trx.setSearchButton();
        Thread.sleep(5000);
        trx.successStatusTable();
  }

}
