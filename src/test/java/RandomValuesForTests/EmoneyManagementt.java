package RandomValuesForTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static BrowserSettings.BrowserSettings.driver;
import static Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation.EMONEY_MANAGEMENT;

public abstract class EmoneyManagementt {

    public void setEmoneyManagement (){
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",emoneyManagement);
    }
}
