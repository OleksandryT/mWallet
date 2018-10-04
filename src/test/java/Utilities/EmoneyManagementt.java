package Utilities;

import BrowserSettings.BrowserSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static Functions.EmoneyManagement.AdminTransfer.AdminTransferCreation.EMONEY_MANAGEMENT;

public abstract class EmoneyManagementt extends BrowserSettings {
    public void setEmoneyManagement (){
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",emoneyManagement);
    }
}
