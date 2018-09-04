package Functions.EmoneyManagement.AdminReverse;

import RandomValuesForTests.EmoneyManagement;
import org.apache.commons.net.imap.IMAPClient;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminReversePending implements EmoneyManagement {

    private WebDriver driver;
    public AdminReversePending(WebDriver driver) {
        this.driver = driver;
    }

    public static final By PENDING_ADMIN_REVERSE = By.xpath("//*[@translate ='general_label_pending_admin_reverse']");
    public static final By SEARCH_BY_TRANSACTION_ID = By.xpath("//*[@ng-click='viewSearchByTransactionId()']");
    public static final By TRANSACTION_ID_INPUT = By.xpath("//*[@name='txnIDInput");
    public static final By SEARCH_BUTTON = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/button");
    public static final By CLEAR_BUTTON = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/input");



    public void setEmoneyManagement() {
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",emoneyManagement);
    }

    public void setPendingAdminReverse (){
        WebElement adminReversePending = driver.findElement(PENDING_ADMIN_REVERSE);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();",adminReversePending);
    }

    public  void searchByTxnID() {
        WebElement searchByTransactionId = driver.findElement(SEARCH_BY_TRANSACTION_ID);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchByTransactionId));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();",searchByTransactionId);
    }


}
