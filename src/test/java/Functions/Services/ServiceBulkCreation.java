package Functions.Services;

import Functions.Customers.Customer;
import org.apache.xpath.jaxp.JAXPVariableStack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceBulkCreation {

    Customer customer;

    private static WebDriver driver;
    public ServiceBulkCreation(WebDriver driver) {
        this.driver = driver;
    }

    public static final By SERVICES = By.xpath("//*[@translate='general_label_servicemenu']");
    public static final By BULK_SERVICE_CREATION = By.xpath("//*[@translate='general_label_bulk_service_creation']");
    public static final By CHOOSE_FILE = By.xpath("//*[@id='csvFileUpload']");
    public static final By CANCEL = By.xpath("//*[@value='Cancel']");
    public static final By SAVE = By.xpath("//*[@ng-click='createBulkServiceCreation()']");
    public static final By GO_TO_MANAGE_SERVICES = By.xpath("//*[@value='Go To Manage Service']");

    public void setServices (){
        WebElement services = driver.findElement(SERVICES);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", services);
    }

    public void setBulkServiceCreation (){
        WebElement bulkCreation = driver.findElement(BULK_SERVICE_CREATION);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", bulkCreation);
    }

    public void setChooseFile (){
        WebElement choose = driver.findElement(CHOOSE_FILE);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", choose);
        choose.sendKeys("C:\\IlonaQA_Kyivstar_mWallet\\QA docs\\FilesForTesting\\BulkServiceRegistration\\bulservice_p2p_prepaid.csv");
    }

    public void setCancel (){
        WebElement cancel= driver.findElement(CANCEL);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", cancel);
    }

    public void setSave (){
        WebElement save= driver.findElement(SAVE);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", save);
    }
//
//    public void setGoToManageServices (){
//        WebElement manageServices= driver.findElement((By) GO_TO_MANAGE_SERVICES);
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", manageServices);
//    }

    public void serviceRegistration (){
        setServices();
        setBulkServiceCreation();
        setChooseFile();
        setSave();
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(GO_TO_MANAGE_SERVICES));
    }

}
