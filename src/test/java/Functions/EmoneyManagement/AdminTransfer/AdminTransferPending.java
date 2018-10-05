package Functions.EmoneyManagement.AdminTransfer;

import Utilities.EmoneyManagementt;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.RandomValues.RandomValues.*;

public class AdminTransferPending extends EmoneyManagementt {

    private static WebDriver driver;
    public AdminTransferPending(WebDriver driver) {
        this.driver = driver;
    }

    private String successfulMessage = "This Admin Transfer has been successfully approved";
    public static final By PENDING_ADMIN_TRANSFER = By.xpath("//*[@translate='general_label_pending_admin_transfers']");
    public static final By TRANSACTION_ID = By.xpath("//*[@id='transactionIdInput']");
    public static final By CLEAR = By.xpath("//*[@translate=\"general_button_clear\"]");
    public static final By START_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker1\"]/span/span");
    public static final By END_DATE_CALENDAR_PICKER = By.xpath("//*[@id=\"datetimepicker2\"]/span");
    public static final By ADMIN_TXN_ID_TABLE = By.xpath("//*[@id=\"manage\"]/table/tbody");
    public static final By NOTES = By.xpath("//*[@name='regAdmnNotes2']");
    public static final By CONFIRM_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrConfirm']");
    public static final By REJECT_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admntxnfrReject']");
    public static final By CANCEL_BOTTOM = By.xpath("//div[@class=\"div3 ng-scope\"]/p/button[@id='admnDtlCancel']");
    public static final By DETAILS = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[9]/a/span");
    public static final By TXN_ID = By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[3]/div/form/div/div/div/label");
    public static final By CREATED_TRANSACTION_ID = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/form/div[2]/div[1]/div/label");

    public String getSuccessfulMessage() {
        return successfulMessage;
    }

    public  void setPendingAdminTransfer (){
        WebElement pendingAdmin = driver.findElement(PENDING_ADMIN_TRANSFER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",pendingAdmin);
    }

    @Override
    public void searchByTxnID() {
        super.searchByTxnID();
    }



    public  void setConfirmBottom (){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_BOTTOM));
        driver.findElement(CONFIRM_BOTTOM).click();
    }

    public  void setRejectBottom (){
        driver.findElement(REJECT_BOTTOM).click();
    }

    public  void setNotes (){
        driver.findElement(NOTES).sendKeys("autoTest"+RANDOM_ALPHABETIC);
    }

    public void setTransactionId (){
        driver.findElement(CREATED_TRANSACTION_ID).getAttribute("value");
    }


}


