package Functions.Transactions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TransactionHistory {

    private WebDriver driver;

    public TransactionHistory(WebDriver driver) {
        this.driver = driver;
    }

    public static final By trxButton = By.xpath("//*[@translate='general_label_transactions']");
    public static final By trxHistoryButton = By.xpath("//*[@translate='general_label_transaction_history']");
    public static final By startDatePicker = By.xpath("//*[@name='startDateInput']");
    public static final By endDatePicker = By.xpath("//*[@name='endDateInput']");
    public static final By minAmountField = By.xpath("//*[@id='minPriceInput']");
    public static final By maxAmountField = By.xpath("//*[@id='maxPriceInput']");
    public static final By trxTypeDropdown = By.xpath("//*[@ng-change=\"updateSubTxnList()\"]");
    public static final By trxStatus = By.xpath("//*[@name='txnStatusSelect']");
    public static final By searchButton = By.xpath("//*[@id=\"searchTransaction\"]/div[1]/div[2]/div[7]/button[1]");
    public static final By clearButton = By.xpath("//*[@id=\"searchTransaction\"]/div[1]/div[2]/div[8]/input");
    public static final By searchByFilterCriteriaButton = By.xpath("//*[@ng-click=\"viewSearchBySearchCriteria()\"]");
    public static final By detailsbutton1row = By.xpath("//*[@id =\"manage\"]/table/tbody/tr[2]/td[13]/a/span");
    public static final By table = By.xpath("//*[@id =\"manage\"]/table/tbody");

    public void setTrxButton() {
        WebElement trxbutton = driver.findElement(trxButton);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(trxbutton));
        if (trxbutton.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript(("arguments[0].click()"), trxbutton);
        } else {
            System.out.println("Couldn't");
        }
    }

    public void setTrxHistoryButton() {
        WebElement trxHbutton = driver.findElement(trxHistoryButton);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(trxHbutton));
        if (trxHbutton.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript(("arguments[0].click()"), trxHbutton);
        } else {
            System.out.println("Couldn't");
        }
    }

    public String setMinAmountField(String minAmount) {
        WebElement minamount = driver.findElement(minAmountField);
        minamount.clear();
        minamount.click();
        minamount.sendKeys(minAmount);
        return minAmount;
    }

    public String setMaxAmountField(String maxAmount) {
        WebElement maxamount = driver.findElement(maxAmountField);
        maxamount.clear();
        maxamount.click();
        maxamount.sendKeys(maxAmount);
        return maxAmount;
    }

    public void setTrxTypeAdminTransfer() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Admin Transfer");
    }

    public void setTrxTypePurchase() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Purchase");
    }

    public void setTrxTypePriming() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Priming");
    }

    public void setTrxTypeRetirement() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Retirement");
    }

    public void setTrxTypeMerchantFundout() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Merchant Fundout");
    }

    public void setTrxTypeCloseAccount() {
        Select dropdownType = new Select(driver.findElement(trxTypeDropdown));
        dropdownType.selectByVisibleText("Close Account");
    }

    public void setTrxSuccessStatus() {
        Select status = new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Success");
    }


    public void setTrxSuspendStatus() {
        Select status = new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Suspend");
    }

    public void setTrxRejectedStatus() {
        Select status = new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Rejected");
    }

    public void setTrxFailStatus() {
        Select status = new Select(driver.findElement(trxStatus));
        status.selectByVisibleText("Fail");
    }

    public void setDetailsbutton1row() {
        WebElement details = driver.findElement(detailsbutton1row);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(details));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(("arguments[0].click()"), details);
    }

    public void setSearchButton() {
        WebElement search = driver.findElement(searchButton);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(search));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(("arguments[0].click()"), search);
    }


    public void setClearButton() {
        driver.findElement(clearButton).click();
    }

    public void setSearchByFilterCriteriaButton() {
        driver.findElement(searchByFilterCriteriaButton).click();
    }

    public void successStatusTable() {
        System.out.println("Start reading table with success only...");
//        Find table
        WebElement trxTable = driver.findElement(table);
//        Locate rows of table
        List<WebElement> rows_table = trxTable.findElements(By.tagName("tr"));
//         To calculate no of rows in the table
        int rows_count = rows_table.size();
//        Loop will execute till the last row
        for (int row = 0; row < rows_count; row++) {
//            To locate columns(cells) of that specific row.
            List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            To calculate columns(cells) of that specific row.
            int columns_count = columns_row.size();
//            Iterate through the columns within particular row
            for (int i = 0; i < columns_count; i++) {
                String cellText = columns_row.get(i).getText();
                if (cellText == "Suspend" || cellText =="Fail" || cellText =="Rejected"){
                break;
                }
            }
        }
    }
    public void failStatusTable() {
        System.out.println("Start reading table with fails only...");
//        Find table
        WebElement trxTable = driver.findElement(table);
//        Locate rows of table
        List<WebElement> rows_table = trxTable.findElements(By.tagName("tr"));
//         To calculate no of rows in the table
        int rows_count = rows_table.size();
//        Loop will execute till the last row
        for (int row = 0; row < rows_count; row++) {
//            To locate columns(cells) of that specific row.
            List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            To calculate columns(cells) of that specific row.
            int columns_count = columns_row.size();
//            Iterate through the columns within particular row
            for (int i = 0; i < columns_count; i++) {
                String cellText = columns_row.get(i).getText();
                if (cellText == "Suspend" || cellText =="Success" || cellText =="Rejected"){
                    break;
                }
            }
        }
    }

    public void rejectedStatusTable() {
        System.out.println("Start reading table with rejected only...");
//        Find table
        WebElement trxTable = driver.findElement(table);
//        Locate rows of table
        List<WebElement> rows_table = trxTable.findElements(By.tagName("tr"));
//         To calculate no of rows in the table
        int rows_count = rows_table.size();
//        Loop will execute till the last row
        for (int row = 0; row < rows_count; row++) {
//            To locate columns(cells) of that specific row.
            List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            To calculate columns(cells) of that specific row.
            int columns_count = columns_row.size();
//            Iterate through the columns within particular row
            for (int i = 0; i < columns_count; i++) {
                String cellText = columns_row.get(i).getText();
                if (cellText == "Suspend" || cellText =="Success" || cellText =="Fail"){
                    break;
                }
            }
        }
    }

    public void suspendStatusTable() {
        System.out.println("Start reading table with suspended only...");
//        Find table
        WebElement trxTable = driver.findElement(table);
//        Locate rows of table
        List<WebElement> rows_table = trxTable.findElements(By.tagName("tr"));
//         To calculate no of rows in the table
        int rows_count = rows_table.size();
//        Loop will execute till the last row
        for (int row = 0; row < rows_count; row++) {
//            To locate columns(cells) of that specific row.
            List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            To calculate columns(cells) of that specific row.
            int columns_count = columns_row.size();
//            Iterate through the columns within particular row
            for (int i = 0; i < columns_count; i++) {
                String cellText = columns_row.get(i).getText();
                if (cellText == "Rejected" || cellText =="Success" || cellText =="Fail"){
                    break;
                }
            }
        }
    }
}