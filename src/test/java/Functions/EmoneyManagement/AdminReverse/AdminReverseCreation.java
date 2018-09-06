package Functions.EmoneyManagement.AdminReverse;

import RandomValuesForTests.EmoneyManagement;
import RandomValuesForTests.RandomValues;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static RandomValuesForTests.RandomValues.*;

public class AdminReverseCreation implements EmoneyManagement {

    private WebDriver driver;
    public AdminReverseCreation (WebDriver driver) {
        this.driver = driver;
    }

    public  static final String TXN_ID_FOR_REVERSE = "9934672";
    public  static final String TXN_ID_FOR_REVERSE_2 = "9934670";
    private String errorMessageReversedTxn = "The Transaction has been already reversed.";
    private String confirmationSuccessMessage = "Admin reversal is successful";

    public static final By TRANSACTION_ID_ON_CONFIRMATION_PAGE = By.xpath("//*[@id=\"content\"]/div[4]/form/div[2]/div[2]/div[1]/div/label");
    public static final By ADMIN_REVERSE = By.xpath("//*[@translate ='general_label_admin_reverse']");
    public static final By TXN_ID_FIELD = By.xpath("//*[@name ='txnId']");
    public static final By NOTES = By.xpath("//*[@ng-model ='notes']");
    public static final By REVERSE_THIS_TRANSACTION_BUTTON = By.xpath("//*[@ng-click='submitReversal()']");
    public static final By CONFIRM_THIS_TRANSACTION_BUTTON = By.xpath("//*[@ng-click='submitReversal(true)']");
    public static final By CANCEL_TRANSACTION_REVERSAL_BUTTON = By.xpath("//*[@translate ='general_button_cancel']");
    public static final By erroMessageTxnReversed = By.xpath("//*[@ng-show='confirmationErrorMessage !=null']");
    public static final By successfullMessageTxnReversed = By.xpath("//*[@ng-show='confirmationSuccessMessage !=null']");
    public static final By GO_TO_ADMIN_REVERSAL_BUTTON = By.xpath("//*[@translate='general_go_to_reversal']");


    public String getErrorMessageReversersedTxn() {
        return this.errorMessageReversedTxn;
    }

    public String getTxnIdForReverse() {
        return this.TXN_ID_FOR_REVERSE;
    }

    public String getConfirmationSuccessMessage() {
        return this.confirmationSuccessMessage;
    }

    public void setEmoneyManagement() {
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(emoneyManagement));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();",emoneyManagement);
    }

    public void setFirstRowWithTransaction() {
    }

    public void setDetails() {
    }

    public void setAdminReverse (){
        WebElement adminReverse = driver.findElement(ADMIN_REVERSE);
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(adminReverse));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();",adminReverse);
    }

    public void setTxnIdField (){
        WebElement txnIdField = driver.findElement(TXN_ID_FIELD);
        txnIdField.click();
        txnIdField.sendKeys(TXN_ID_FOR_REVERSE);
    }

    public void setTxnIdField_2 (){
        WebElement txnIdField = driver.findElement(TXN_ID_FIELD);
        txnIdField.click();
        txnIdField.sendKeys(TXN_ID_FOR_REVERSE_2);
    }
    public void setNotes (){
        WebElement notes = driver.findElement(NOTES);
        notes.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setReverseThisTransactionButoon (){
        WebElement reverseTxn = driver.findElement(REVERSE_THIS_TRANSACTION_BUTTON);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", reverseTxn);
    }

    public void setConfirmThisTransactionButton () {
        WebElement confirm = driver.findElement(CONFIRM_THIS_TRANSACTION_BUTTON);
        if (!driver.findElement(TRANSACTION_ID_ON_CONFIRMATION_PAGE).getText().equals(TXN_ID_FOR_REVERSE)) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click();", confirm);
        }
    }

    public void setCancelTransactionReversalButton () {
        WebElement cancel = driver.findElement(CANCEL_TRANSACTION_REVERSAL_BUTTON);
        if (!driver.findElement(TRANSACTION_ID_ON_CONFIRMATION_PAGE).getText().equals(TXN_ID_FOR_REVERSE)) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click();", cancel);
        }
    }

    public void setGoToAdminReversalButton (){
        if (driver.getPageSource().contains(getErrorMessageReversersedTxn())){
            WebElement goToAdminreversal = driver.findElement(GO_TO_ADMIN_REVERSAL_BUTTON);
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
            javascriptExecutor.executeScript("arguments[0].click();",goToAdminreversal);
            System.out.println("Reversal has already been reversed.");
        }
        else if (driver.getPageSource().contains(getConfirmationSuccessMessage())) {
            WebElement goToAdminreversal = driver.findElement(GO_TO_ADMIN_REVERSAL_BUTTON);
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click();", goToAdminreversal);
            System.out.println("Reversal was created successfully");
        }
        else {
            System.out.println("Something went wrong");
}
        }
    }
