package Functions.Transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionHistory {

    private WebDriver driver;
    public TransactionHistory (WebDriver driver){this.driver=driver;}

    public static final By trxButton = By.xpath("//*[@translate='general_label_transactions']");
    public static final By trxHistoryButton = By.xpath("//*[@translate='general_label_transaction_history']");
    public static final By startDatePicker = By.xpath("//*[@name='startDateInput']");
    public static final By endDatePicker = By.xpath("//*[@name='endDateInput']");
    public static final By minAmountField = By.xpath("//*[@id='minPriceInput']");
    public static final By maxAmountField = By.xpath("//*[@id='maxPriceInput']");
    public static final By trxTypeDropdown = By.xpath("//*[@name='txnTypeSelect']");
    public static final By trxAdminTransfer = By.xpath("//*[@name='txnTypeSelect']/option[2]");
    public static final By trxPurchase = By.xpath("//*[@name='txnTypeSelect']/option[3]");
    public static final By trxPriming = By.xpath("//*[@name='txnTypeSelect']/option[4]");
    public static final By trxTelecomPurchase = By.xpath("//*[@name='txnTypeSelect']/option[5]");
    public static final By trxTelecomRefund = By.xpath("//*[@name='txnTypeSelect']/option[6]");
    public static final By trxRetirement = By.xpath("//*[@name='txnTypeSelect']/option[7]");
    public static final By trxMerchantFundout = By.xpath("//*[@name='txnTypeSelect']/option[8]");
    public static final By trxCloseAccount = By.xpath("//*[@name='txnTypeSelect']/option[9]");
    public static final By trxStatus = By.xpath("//*[@name='txnStatusSelect']");
    public static final By trxSuccess = By.xpath("//*[@name='txnStatusSelect']/option[2]");
    public static final By trxSuspend = By.xpath("//*[@name='txnStatusSelect']/option[3]");
    public static final By trxFail = By.xpath("//*[@name='txnStatusSelect']/option[4]");
    public static final By trxRejected = By.xpath("//*[@name='txnStatusSelect']/option[5]");
    public static final By remitterField = By.xpath("//*[@name='remitter']");
    public static final By payeeField = By.xpath("//*[@name='payee']");
    public static final By externalIdField = By.xpath("//*[@name='externalID']");
    public static final By servicelIdField = By.xpath("//*[@name='serviceId']");
    public static final By merchantNameField = By.xpath("//*[@name='merchantName']");
    public static final By searchButton = By.xpath("//*[@id=\"searchTransaction\"]/div[1]/div[2]/div[8]/button[1]");
    public static final By exportCsvButton = By.xpath("//div[@class='row buttonRow']/button[2]");
    public static final By clearButton = By.xpath("//*[@id=\"searchTransaction\"]/div[1]/div[2]/div[8]/input");
    public static final By searchByTrxIfButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[1]/div/button");
    public static final By trxIdField = By.xpath("//*[@name =\"txnIDInput\"]");
    public static final By trxSearchButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/button");
    public static final By trxClearButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/input");
    public static final By searchByFilterCriteriaButton = By.xpath("//*[@ng-click=\"viewSearchBySearchCriteria()\"]");
    public static final By detailsbutton1row = By.xpath("//*[@id =\"manage\"]/table/tbody/tr[2]/td[13]/a/span");

    public void setTrxButton (){
        WebElement trxbutton = driver.findElement(trxButton);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click;",trxbutton);
    }

    public void setTrxHistoryButton (){
        WebElement trxHbutton = driver.findElement(trxHistoryButton);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click;",trxHbutton);
    }


    public void setMinAmountField (String minAmount){
        WebElement minamount = driver.findElement(minAmountField);
        minamount.clear();
        minamount.click();
        minamount.sendKeys(minAmount);
    }

    public void setMaxAmountField (String maxAmount){
        WebElement maxamount = driver.findElement(maxAmountField);
        maxamount.clear();
        maxamount.click();
        maxamount.sendKeys(maxAmount);
    }

    public void setTrxTypeDropdown (){
        driver.findElement(trxTypeDropdown).click();
    }

    public void setTrxAdminTransfer (){
        driver.findElement(trxAdminTransfer).click();
    }

    public void setTrxPurchase(){
        driver.findElement(trxPurchase).click();
    }

    public void setTrxPriming(){
        driver.findElement(trxPriming).click();
    }

    public void setTrxTelecomPurchase(){
        driver.findElement(trxTelecomPurchase).click();
    }

    public void setTrxTelecomRefund(){
        driver.findElement(trxTelecomRefund).click();
    }

    public void setTrxRetirement(){
        driver.findElement(trxRetirement).click();
    }

    public void setTrxMerchantFundout(){
        driver.findElement(trxMerchantFundout).click();
    }

    public void setTrxCloseAccount(){
        driver.findElement(trxCloseAccount).click();
    }

    public void setTrxStatus (){
        driver.findElement(trxStatus).click();
    }

    public void setTrxSuccess (){
        driver.findElement(trxSuccess).click();
    }

    public void setTrxSuspend (){
        driver.findElement(trxSuspend).click();
    }

    public void setTrxRejected (){
        driver.findElement(trxRejected).click();
    }

    public void setTrxFail(){
        driver.findElement(trxFail).click();
    }

    public void setRemitterField (String remittername){
        WebElement remitter = driver.findElement(remitterField);
        remitter.clear();
        remitter.click();
        remitter.sendKeys(remittername);
    }

    public void setPayeeFieldField (String payeename){
        WebElement payee = driver.findElement(payeeField);
        payee.clear();
        payee.click();
        payee.sendKeys(payeename);
    }

    public void setExternalIdField(String exId){
        WebElement externalId = driver.findElement(externalIdField);
        externalId.clear();
        externalId.click();
        externalId.sendKeys(exId);
    }

    public void setServicelIdField(String serId){
        WebElement serviceId = driver.findElement(servicelIdField);
        serviceId.clear();
        serviceId.click();
        serviceId.sendKeys(serId);
    }

    public void setMerchantNameField(String merchantname){
        WebElement merchantName = driver.findElement(merchantNameField);
        merchantName.clear();
        merchantName.click();
        merchantName.sendKeys(merchantname);
    }

    public  void setDetailsbutton1row(){
        driver.findElement(detailsbutton1row).click();
    }

}
