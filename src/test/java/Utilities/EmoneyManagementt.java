package Utilities;

import BrowserSettings.BrowserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation.EMONEY_MANAGEMENT;
import static Functions.EmoneyManagement.AdminTransfer.AdminTransferPending.DETAILS;
import static Functions.EmoneyManagement.AdminTransfer.AdminTransferPending.TRANSACTION_ID;

public abstract class EmoneyManagementt extends BrowserSettings {

    public static final By DISTRIBUTION_ROOT_ACCOUNT = By.xpath("//*[@ng-click=\"changeSearchType('root')\"]");
    public static final By ROOT_ACCOUNTS = By.xpath("//*[@ng-show='permissions.canViewEmoneyMoney']");
    public static final By SEARCH_BY_FILTER_CRITERIA = By.xpath("//*[@translate='view_search_by_criteria']");
    public static final By SEARCH = By.xpath("//*[@ng-click='searchTransactions()']");
    public static final By FIRST_ROW_WITH_TRANSACTION = By.xpath("//*[@id=\"manage\"]/table/tbody/tr[2]/td[1]");


    public void setEmoneyManagement (){
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",emoneyManagement);
    }

    public void setDistributionRootAccount (){
        WebElement distribution = driver.findElement(DISTRIBUTION_ROOT_ACCOUNT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",distribution);
    }

    public void setRootAccounts (){
        WebElement rootAccount = driver.findElement(ROOT_ACCOUNTS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",rootAccount);
    }

    public  void searchByTxnID() {
        WebElement searchByFilterCriteria = driver.findElement(SEARCH_BY_FILTER_CRITERIA);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchByFilterCriteria));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();",searchByFilterCriteria);
    }

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
            WebElement details = driver.findElement(DETAILS);
//                    JavascriptExecutor ja = (JavascriptExecutor)driver;
//                    ja.executeScript("arguments[0].click();",details);
            details.click();
            System.out.println("TxnID was found between pendings and details view has been opened");
        }
        else
            System.out.println("The transaction was not found in the pending admin transfers!");
    }
}
