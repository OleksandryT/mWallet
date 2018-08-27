package Functions.EmoneyManagement.AdminTransfer;

import RandomValuesForTests.BackOfficeUser;
import org.openqa.selenium.By;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static RandomValuesForTests.RandomValues.*;
import static Functions.MyprofileHelp.MyProfileHelp.*;


import java.util.List;

public class AdminTransferPending extends BackOfficeUser {

    private static WebDriver driver;
    public AdminTransferPending(WebDriver driver) {
        this.driver = driver;
    }

    private String successfulMessage = "This Admin Transfer has been successfully approved";
    private static final  String TXN_ID = AdminTransferCreation.getTxnId();
    public static  final By PENDING_ADMIN_TRANSFER = By.xpath("//*[@translate='general_label_pending_admin_transfers']");
    public static final By SEARCH_BY_FILTER_CRITERIA = By.xpath("//*[@translate='view_search_by_criteria']");
    public static final By TRANSACTION_ID = By.xpath("//*[@id='transactionIdInput']");
    public static final By SEARCH = By.xpath("//*[@ng-click='searchTransactions()']");
    public static final By CLEAR = By.xpath("//*[@translate=\"general_button_clear\"]");
    public static final By START_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker1\"]/span/span");
    public static final By END_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker2\"]/span");
    public static final By ADMIN_TXN_ID_TABLE = By.xpath("//*[@id=\"manage\"]/table");
    public static final By NOTES = By.xpath("//*[@name='regAdmnNotes2']");
    public static final By CONFIRM_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrConfirm']");
    public static final By REJECT_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrReject']");
    public static final By CANCEL_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admnDtlCancel']");
    public static final By DETAILS = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[9]/a/span");

    @Override
    public void goToMWallet(String url) {
        driver.get(url);
    }

    @Override
    public void passwordLocator(String oldPasswordName) {
        super.passwordLocator(oldPasswordName);
    }

    @Override
    public void signInButton() {
        super.signInButton();
    }

    @Override
    public void useridLocator(String userIdName) {
        super.useridLocator(userIdName);
    }

    public static String getTxnId() {
        return TXN_ID;
    }

    public String getSuccessfulMessage() {
        return successfulMessage;
    }

    public static void eMoneyManagement (){
        AdminTransferCreation ac = new AdminTransferCreation(driver);
        ac.setEmoneyManagement();
    }

    public static void setPendingAdminTransfer (){
        WebElement pendingAdmin = driver.findElement(PENDING_ADMIN_TRANSFER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",pendingAdmin);
    }
    public static void searchByTxnID(){
        WebElement searchByFilterCriteria = driver.findElement(SEARCH_BY_FILTER_CRITERIA);
        searchByFilterCriteria.click();
        WebElement txnId = driver.findElement(TRANSACTION_ID);
        txnId.sendKeys(TXN_ID);
        WebElement searchButton = driver.findElement(SEARCH);
        searchButton.click();
        System.out.println("Start searching for specific txnId");
//        Find table
        WebElement trxTable = driver.findElement(ADMIN_TXN_ID_TABLE);
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
                if (cellText == TXN_ID){
                    driver.findElement(DETAILS).click();
                    System.out.println("TxnID was found between pendings and details view has been opened");
                }
            }
        }
    }

    public static void setConfirmBottom (){
        driver.findElement(CONFIRM_BOTTOM).click();
    }

    public static void setRejectBottom (){
        driver.findElement(REJECT_BOTTOM).click();
    }

    public static void setNotes (){
        driver.findElement(NOTES).sendKeys("autoTest"+RANDOM_ALPHABETIC);
    }



}


