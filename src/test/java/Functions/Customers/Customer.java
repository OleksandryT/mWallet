package Functions.Customers;


import Functions.Services.ServiceBulkCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer extends ServiceBulkCreation {

    ServiceBulkCreation serviceBulkCreation;

    private static WebDriver driver;
    public Customer(WebDriver driver) {
        super(driver);
    }


    public static final By CUSTOMER = By.xpath("//*[@ng-show='permissions.canViewCustomer']");
    public static final By BULK_CUSTOMER_REGISTRATION = By.xpath("//*[@ng-show='permissions.canCreateBulkCustomer']");
    public static final By SAVE_CUSTOMER = By.xpath("//*[@ng-click='createBulkRegistration()']");


    @Override
    public void setCancel() {
        super.setCancel();
    }

    @Override
    public void setChooseFile() {
        super.setChooseFile();
    }

    public void setCustomer (){
        WebElement customer = driver.findElement(CUSTOMER);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments.click();", customer);
    }

    public void setBulkCustomerRegistration (){
        WebElement customerBulkRegistration = driver.findElement(BULK_CUSTOMER_REGISTRATION);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments.click();", customerBulkRegistration);
    }

    public void setSaveCustomer(){
        WebElement save = driver.findElement(SAVE_CUSTOMER);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments.click();", save);
    }

}
