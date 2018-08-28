package RandomValuesForTests;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Functions.MyprofileHelp.MyProfileHelp.passwordField;
import static Functions.MyprofileHelp.MyProfileHelp.signIn;
import static Functions.MyprofileHelp.MyProfileHelp.userIdFiled;

public abstract class BackOfficeUser {

    public WebDriver driver;
    public BackOfficeUser(WebDriver driver) {
        this.driver = driver;
    }

    private static final By LOG_OUT = By.xpath("//*[@translate='general_label_logout']");

    public void goToMWallet (String url){
        driver.get(url);
    }
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
        driver.findElement(LOG_OUT).click();

    }
}
