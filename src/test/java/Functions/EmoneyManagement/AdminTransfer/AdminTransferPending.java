package Functions.EmoneyManagement.AdminTransfer;

import RandomValuesForTests.BackOfficeUser;
import Tests.Smoke.EmoneyManagement.TestAdminTransfer;
import org.apache.xpath.jaxp.JAXPVariableStack;
import org.openqa.selenium.*;
import Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.nio.ch.DefaultAsynchronousChannelProvider;

import static RandomValuesForTests.RandomValues.*;



import java.util.List;

public class AdminTransferPending extends BackOfficeUser {

    private static WebDriver driver;
    public AdminTransferPending(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private String successfulMessage = "This Admin Transfer has been successfully approved";
    public static final By PENDING_ADMIN_TRANSFER = By.xpath("//*[@translate='general_label_pending_admin_transfers']");
    public static final By SEARCH_BY_FILTER_CRITERIA = By.xpath("//*[@translate='view_search_by_criteria']");
    public static final By TRANSACTION_ID = By.xpath("//*[@id='transactionIdInput']");
    public static final By SEARCH = By.xpath("//*[@ng-click='searchTransactions()']");
    public static final By CLEAR = By.xpath("//*[@translate=\"general_button_clear\"]");
    public static final By START_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker1\"]/span/span");
    public static final By END_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker2\"]/span");
    public static final By ADMIN_TXN_ID_TABLE = By.xpath("//*[@id=\"manage\"]/table/tbody");
    public static final By NOTES = By.xpath("//*[@name='regAdmnNotes2']");
    public static final By CONFIRM_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrConfirm']");
    public static final By REJECT_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrReject']");
    public static final By CANCEL_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admnDtlCancel']");
    public static final By DETAILS = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[9]/a");
    public static final By TXN_ID = By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[3]/div/form/div/div/div/label");
    public static By FIRST_ROW_WITH_TRANSACTION = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[1]");

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

    public String getSuccessfulMessage() {
        return successfulMessage;
    }

    public  void eMoneyManagement (){
        AdminTransferCreation ac = new AdminTransferCreation(driver);
        ac.setEmoneyManagement();
    }

    public static String transactionCreated (){
        String transaction = driver.findElement(TXN_ID).getText();
        return transaction;
    }

    public  void setPendingAdminTransfer (){
        WebElement pendingAdmin = driver.findElement(PENDING_ADMIN_TRANSFER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",pendingAdmin);
    }
    public  void searchByTxnID() {
        WebElement searchByFilterCriteria = driver.findElement(SEARCH_BY_FILTER_CRITERIA);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchByFilterCriteria));
        if(searchByFilterCriteria.isEnabled()){
            searchByFilterCriteria.click();
        }
    }
//
//    public void transactionId () {
//        WebElement trxID = driver.findElement(TRANSACTION_ID);
//        WebDriverWait wait1 = new WebDriverWait(driver, 20);
//        wait1.until(ExpectedConditions.elementToBeClickable(trxID));
//        if (trxID.isEnabled()) {
//            trxID.click();
//            trxID.clear();
//            trxID.sendKeys();
//        } else
//            System.out.println("Transaction field was disabled");
//    }

    public void serahcForCreatedTrx(){
        WebElement searchButton = driver.findElement(SEARCH);
        Actions action = new Actions(driver);
        action.moveToElement(searchButton).click().build().perform();
        System.out.println("Start searching for specific txnId");
        String firstRowFound = driver.findElement(FIRST_ROW_WITH_TRANSACTION).getText();
        String current_trx = driver.findElement(TRANSACTION_ID).getAttribute("value");
        System.out.println("Found is : "+firstRowFound+" "+"Current is "+current_trx);
                if (firstRowFound.equals(current_trx)){
                    WebDriverWait wait  = new WebDriverWait(driver, 30);
                    wait.until(ExpectedConditions.elementToBeClickable(DETAILS));
                    driver.findElement(DETAILS).click();
                    System.out.println("TxnID was found between pendings and details view has been opened");
                }
                else
                    System.out.println("The transaction was not found in the pending admin transfers!");
            }

    public  void setConfirmBottom (){
        driver.findElement(CONFIRM_BOTTOM).click();
    }

    public  void setRejectBottom (){
        driver.findElement(REJECT_BOTTOM).click();
    }

    public  void setNotes (){
        driver.findElement(NOTES).sendKeys("autoTest"+RANDOM_ALPHABETIC);
    }

}


