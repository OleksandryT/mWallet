package RandomValuesForTests;

import org.apache.xpath.jaxp.JAXPVariableStack;
import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Functions.MyprofileHelp.MyProfileHelp.passwordField;
import static Functions.MyprofileHelp.MyProfileHelp.signIn;
import static Functions.MyprofileHelp.MyProfileHelp.userIdFiled;

public abstract class BackOfficeUser {

    public WebDriver driver;
    public BackOfficeUser(WebDriver driver) {
        this.driver = driver;
    }

    private static final By LOG_OUT = By.xpath("//*[@translate='general_label_logout']");

    public abstract void goToMWallet(String url);

    public void useridLocator(String userIdName){
        WebElement userL = driver.findElement(userIdFiled);
        userL.click();
        userL.clear();
        userL.sendKeys();
    }
    public void passwordLocator(String oldPasswordName){
        WebElement passwordL = driver.findElement(passwordField);
        passwordL.click();
        passwordL.clear();
        passwordL.sendKeys();
    }
    public void signInButton(){
        driver.findElement(signIn).click();
    }

    public void loggOut (){
        WebElement logOut = driver.findElement(LOG_OUT);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(logOut));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",logOut);
    }
}
