package RandomValuesForTests;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Functions.MyprofileHelp.MyProfileHelp.passwordField;
import static Functions.MyprofileHelp.MyProfileHelp.signIn;
import static Functions.MyprofileHelp.MyProfileHelp.userIdFiled;

public abstract class BackOfficeUser {

    public WebDriver driver ;

    public void goToMWallet (String url){
        driver.get(url);
    }
    public void useridLocator(String userIdName){
        WebElement userL = driver.findElement(userIdFiled);
        userL.click();
        userL.clear();
        userL.sendKeys(userIdName);
    }
    public void passwordLocator(String oldPasswordName){
        WebElement passwordL = driver.findElement(passwordField);
        passwordL.click();
        passwordL.clear();
        passwordL.sendKeys(oldPasswordName);
    }
    public void signInButton(){
        driver.findElement(signIn).click();}
}
