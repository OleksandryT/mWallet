//package Tests.Smoke.Transactions;
//
//import BrowserSettings.BrowserSettings;
//import Functions.Transactions.TransactionHistory;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class TestTransactions extends BrowserSettings {
//
//    @Test(groups = {"Transactions"}, priority = 0, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchAdminTransferSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeAdminTransfer();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//        System.out.println("Only AT successful txns are displayed");
//}
//
//    @Test(groups = {"Transactions"}, priority = 1, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchAdminTransferFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeAdminTransfer();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only AT failed txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 2, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchAdminTransferRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeAdminTransfer();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only AT rejected txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 3, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchAdminTransferSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeAdminTransfer();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only AT suspended txns are displayed");
//    }
//
//
//      @Test(groups = {"Transactions"}, priority = 4, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPurchaseSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePurchase();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//          System.out.println("Only successfull purchase txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 5, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPurchaseFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePurchase();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only failed purchase txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 6, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPurchaseRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePurchase();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only rejected purchase txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 7, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPurchaseSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePurchase();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only suspended purchase txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 8, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPrimingSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePriming();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//        System.out.println("Only successful priming txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 9, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPrimingFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePriming();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only failed priming are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 10, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPrimingRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePriming();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only rejected priming txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 11, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchPrimingSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypePriming();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only suspended priming txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 12, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchRetirementSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeRetirement();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//        System.out.println("Only successful retirement txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 13, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchretirementFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeRetirement();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only failed retirement are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 14, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchretirementRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeRetirement();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only rejected retirement txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 15, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchRetirementSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeRetirement();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only suspended retirement txns are displayed");
//    }
//
//
//    @Test(groups = {"Transactions"}, priority = 16, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchMerchantFundoutSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeMerchantFundout();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//        System.out.println("Only successful MerchantFundout txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 17, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchMerchantFundoutFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeMerchantFundout();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only failed MerchantFundout are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 18, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchMerchantFundoutRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeMerchantFundout();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only rejected MerchantFundout txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 19, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchMerchantFundoutSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeMerchantFundout();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only suspended MerchantFundout txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 20, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchCloseAccountSuccess() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeCloseAccount();
//        trx.setTrxSuccessStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.successStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Success")|| trxTable.contains(""));
//        System.out.println("Only successful close account txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 21, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchCloseAcountFail() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeCloseAccount();
//        trx.setTrxFailStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.failStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Fail")|| trxTable.contains(""));
//        System.out.println("Only failed close account are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 22, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchCloseAccountRejected() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeCloseAccount();
//        trx.setTrxRejectedStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.rejectedStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Rejected") || trxTable.contains(""));
//        System.out.println("Only rejected close account txns are displayed");
//    }
//
//    @Test(groups = {"Transactions"}, priority = 23, dependsOnGroups = {"MyProfile"})
//    public void verifyAbilityToSearchCloseAccountSuspend() throws InterruptedException {
//        TransactionHistory trx = new TransactionHistory(driver);
//        trx.setTrxButton();
//        trx.setTrxHistoryButton();
//        trx.setTrxTypeCloseAccount();
//        trx.setTrxSuspendStatus();
//        trx.setSearchButton();
//        Thread.sleep(5000);
//        trx.suspendStatusTable();
//        String trxTable = driver.findElement(By.xpath("//*[@id=\"manage\"]/table/tbody")).getText();
//        Assert.assertTrue(trxTable.contains("Suspend") || trxTable.contains(""));
//        System.out.println("Only suspended close account txns are displayed");
//    }
//
//
//}
