package Functions.EmoneyManagement.AdminReverse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation.EMONEY_MANAGEMENT;
import static RandomValuesForTests.RandomValues.*;

public class AdminReversePending {

    private WebDriver driver;

    public AdminReversePending(WebDriver driver) {
        this.driver = driver;
    }

    public static final By PENDING_ADMIN_REVERSE = By.xpath("//*[@translate ='general_label_pending_admin_reverse']");
    public static final By SEARCH_BY_TRANSACTION_ID = By.xpath("//*[@ng-click='viewSearchByTransactionId()']");
    public static final By TRANSACTION_ID_INPUT = By.xpath("//*[@name='txnIDInput']");
    public static final By SEARCH_BUTTON = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/button");
    public static final By CLEAR_BUTTON = By.xpath("//*[@id=\"searchTransactionForm\"]/div[2]/div[2]/div[2]/input");
    public static final By FIRST_ROW_WITH_TRANSACTION = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[1]");
    public static final By DETAILS = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[9]/a");
    public static final By CONFIMR_REVERSE_BUTTON = By.xpath("//*[@ng-click=\"confirmReversal()\"]");
    public static final By REJECT_REVERSE_BUTTON = By.xpath("//*[@ng-click=\"rejectReversal()\"]");
    public static final By COMMENTS_FOR_REJECTION = By.xpath("//*[@ng-model=\"txnSelected.rejectReason\"]");
    public static final By BACK_TO_SEARCH_TRANSACTION_RESULT_BUTTON = By.xpath("//*[@ng-click=\"backToSearchTransactionResult()\"]");


    public void setEmoneyManagement() {
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", emoneyManagement);
    }

    public void setPendingAdminReverse() {
        WebElement adminReversePending = driver.findElement(PENDING_ADMIN_REVERSE);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", adminReversePending);
    }

    public void searchButtonAndDetails() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_ROW_WITH_TRANSACTION));
        String firstResult = driver.findElement(FIRST_ROW_WITH_TRANSACTION).getText();
        System.out.println(AdminReverseCreation.TXN_ID_FOR_REVERSE);
        System.out.println(firstResult);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(DETAILS));
        driver.findElement(DETAILS).click();
}

    public void setConfimrReverseButton (){
        driver.findElement(CONFIMR_REVERSE_BUTTON).click();
    }

    public void setRejectReverseButton (){
        WebElement reject = driver.findElement(REJECT_REVERSE_BUTTON);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(REJECT_REVERSE_BUTTON));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",reject);
    }

    public void setCommentsForRejection (){
        WebElement comments = driver.findElement(COMMENTS_FOR_REJECTION);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",comments);
        comments.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBackToSearchTransactionResultButton (){
        driver.findElement(BACK_TO_SEARCH_TRANSACTION_RESULT_BUTTON).click();
    }



}