package Functions.Transactions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransactionHistory  {

    private WebDriver driver;
    public TransactionHistory (WebDriver driver){this.driver=driver;}

    public static final By trxButton = By.xpath("//*[@translate='general_label_transactions']");
    public static final By trxHistoryButton = By.xpath("//*[@translate='general_label_transaction_history']");
    public static final By startDatePicker = By.xpath("//*[@name='startDateInput']");
    public static final By endDatePicker = By.xpath("//*[@name='endDateInput']");
    public static final By minAmountField = By.xpath("//*[@id='minPriceInput']");
    public static final By maxAmountField = By.xpath("//*[@id='maxPriceInput']");
    public static final By trxTypeDropdown = By.xpath("//*[@ng-change=\"updateSubTxnList()\"]");
    public static final By trxAdminTransfer = By.xpath("//*[@id=\"searchTransaction\"]/div[1]/div[2]/div[3]/div[1]/select/option[2]");
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
    public static final By searchByTrxIdButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[1]/div/button");
    public static final By trxIdField = By.xpath("//*[@name =\"txnIDInput\"]");
    public static final By trxSearchButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/button");
    public static final By trxClearButton = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/input");
    public static final By searchByFilterCriteriaButton = By.xpath("//*[@ng-click=\"viewSearchBySearchCriteria()\"]");
    public static final By detailsbutton1row = By.xpath("//*[@id =\"manage\"]/table/tbody/tr[2]/td[13]/a/span");
    public static final By table = By.xpath("//*[@id=\"manage\"]/table");

    public void setTrxButton (){
        WebElement trxbutton = driver.findElement(trxButton);
        (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(trxbutton));
        if (trxbutton.isEnabled()){
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript(("arguments[0].click()"), trxbutton);
        }

        else {
            System.out.println("Couldn't");
        }
    }

    public void setTrxHistoryButton () {
        WebElement trxHbutton = driver.findElement(trxHistoryButton);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(trxHbutton));
        if (trxHbutton.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript(("arguments[0].click()"), trxHbutton);
        } else {
            System.out.println("Couldn't");
        }
    }

    public String setMinAmountField (String minAmount){
        WebElement minamount = driver.findElement(minAmountField);
        minamount.clear();
        minamount.click();
        minamount.sendKeys(minAmount);
        return minAmount;
    }

    public String setMaxAmountField (String maxAmount){
        WebElement maxamount = driver.findElement(maxAmountField);
        maxamount.clear();
        maxamount.click();
        maxamount.sendKeys(maxAmount);
        return maxAmount;
    }

    public void setTrxTypeAdminTransfer () {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Admin Transfer");
    }

    public void setTrxTypePurchase(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Purchase");
    }

    public void setTrxTypePriming(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Priming");
    }

    public void setTrxTypeTelecomPurchase(){
         Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Telecom Purchase");
    }

    public void setTrxTypeTelecomRefund(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Telecom Refund");
    }

    public void setTrxTypeRetirement(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Retirement");
    }

    public void setTrxTypeMerchantFundout(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Merchant Fundout");
    }

    public void setTrxTypeCloseAccount(){
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Close Account");
    }

    public void setTrxSuccessStatus ()  {
         Select  status =  new Select(driver.findElement(trxStatus));
         status.selectByVisibleText("Success");
    }


    public void setTrxSuspendStatus (){
        Select  status =  new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Suspend");
    }

    public void setTrxRejectedStatus (){
        Select  status =  new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Rejected");
    }

    public void setTrxFailStatus(){
        Select  status =  new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Fail");
    }

    public String setRemitterField (String remittername){
        WebElement remitter = driver.findElement(remitterField);
        remitter.clear();
        remitter.click();
        remitter.sendKeys(remittername);
        return remittername;
    }

    public String setPayeeFieldField (String payeename){
        WebElement payee = driver.findElement(payeeField);
        payee.clear();
        payee.click();
        payee.sendKeys(payeename);
        return payeename;
    }

    public String setExternalIdField(String exId){
        WebElement externalId = driver.findElement(externalIdField);
        externalId.clear();
        externalId.click();
        externalId.sendKeys(exId);
        return exId;
    }

    public String setServicelIdField(String serId){
        WebElement serviceId = driver.findElement(servicelIdField);
        serviceId.clear();
        serviceId.click();
        serviceId.sendKeys(serId);
        return serId;
    }

    public String setMerchantNameField(String merchantname){
        WebElement merchantName = driver.findElement(merchantNameField);
        merchantName.clear();
        merchantName.click();
        merchantName.sendKeys(merchantname);
        return merchantname;
    }

    public  void setDetailsbutton1row(){
        WebElement details = driver.findElement(detailsbutton1row);
        (new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(details));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(("arguments[0].click()"),details);
    }

    public void setSearchByTrxIdButton(){
        driver.findElement(searchByTrxIdButton).click();
    }

    public void setTrxIdField (){
        driver.findElement(trxIdField).click();
    }

    public void setTrxClearButton (){
        driver.findElement(trxClearButton);
    }

    public void setSearchButton (){
        driver.findElement(searchButton).click();
    }

    public void setTrxSearchButton(){
        driver.findElement(trxSearchButton).click();
    }

    public void setExportCsvButton (){
        driver.findElement(exportCsvButton).click();
    }

    public void setClearButton (){
        driver.findElement(clearButton).click();
    }

    public void setSearchByFilterCriteriaButton (){
        driver.findElement(searchByFilterCriteriaButton).click();
    }

    public void successStatusTable (){
        List<WebElement> tableRows = driver.findElements(table);
        List<WebElement> tableCells = driver.findElements(table);
        for (WebElement row:tableRows){
            List<WebElement> cells = row.findElements(table);
        }
        for (WebElement cell:tableCells){
            System.out.print("Value" + cell.getText());
        }

    }

}
