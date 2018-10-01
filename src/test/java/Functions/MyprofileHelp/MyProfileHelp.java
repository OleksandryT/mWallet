package Functions.MyprofileHelp;

import RandomValuesForTests.BackOfficeUser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static RandomValuesForTests.RandomValues.*;

public class MyProfileHelp extends BackOfficeUser {

    private WebDriver driver;
    public MyProfileHelp(WebDriver driver) {
        super(driver);
        this.driver = driver; }



    public static final By userIdFiled = By.xpath("//*[@id=\"floating\"]/form/table/tbody/tr[1]/td[2]/input");
    public static final By passwordField = By.xpath("//*[@id=\"floating\"]/form/table/tbody/tr[2]/td[2]/input");
    public static final By signIn = By.cssSelector("#login");
    public static final By welcomeField = By.xpath(" //*[@id=\"welcomeUser\"]");
    public static final By contactPhoneNumberField = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/form/div/div[4]/div[1]/div/label");
    public static final By emailField = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/form/div/div[4]/div[2]/div/label");
    public static final By UserIDField = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/form/div/div[2]/div[1]/div/label");
    public static final By editAccountDetailsTopFiled = By.xpath("//div[@class='divwrap ng-scope']/p/button[@name='adminAcntEdtDtls']");
    public static final By editAccountDetailsBottomFiled = By.xpath("//div[@class='div3 ng-scope']/p/button[@name='adminAcntEdtDtls']");
    public static final By changePasswordBottomField = By.xpath("//div[@class='div3 ng-scope']/p/button[@name='adminDetailsChangePass']");
    public static final By changepasswordTopField = By.xpath("//div[@class='divwrap ng-scope']/p/button[@name='adminDetailsChangePass']");
    public static final By firstNameUpdateDetailsField = By.xpath("//*[@id = 'updateAdminAcntEdtName']");
    public static final By lastNameUpdateDetailsField = By.xpath("//*[@id = 'updateAdminAcntEdtLastName']");
    public static final By emailUpdateDetailsField = By.xpath("//*[@id = 'adminAcntEdtEmail']");
    public static final By contactPhoneUpdateDetailsField = By.xpath("//*[@id = 'regAdmnContact']");
    public static final By noteUpdateDetailsField = By.xpath("//*[@id = 'regAdmnFreetex']");
    public static final By nextUpdateDetailsField = By.xpath("//*[@id = 'adminAcntEdtUpdate']");
    public static final By confirmUpdateDetailsField = By.xpath("//*[@ng-click = 'updateAdmin()']");
    public static final By reEditField = By.xpath("//*[@ng-click = 'reEditMyAccount()']");
    public static final By oldPasswordField = By.xpath("//*[@id = 'admnChngPassOld']");
    public static final By newPasswordField = By.xpath("//*[@id = 'admnChngPassNew1']");
    public static final By reNewPasswordField = By.xpath("//*[@id = 'admnChngPassNew2']");
    public static final By submitPasswordChange = By.xpath("//*[@id=\"admnChngPassSubmit\"]");
    public static final By confirmPasswordChangeButton = By.xpath("//*[@class='sa-confirm-button-container']/button[contains(text(),'Yes')]");
    public static final By cancelPasswordChangeButton = By.xpath("//*[@class='sa-button-container']/button[contains(text(),'Cancel')]");
    public static final By goToMyAccountButton = By.xpath("//*[@id='adminAcntEdtOk']");
    public static final By areYouWantToChangePassword = By.xpath("//*[@class='sweet-alert showSweetAlert visible']");
    private static final String userIdName = "test1";
    private static final String userIdName_2 = "test2";
    private static final String PasswordName_2 = "Qazwsx11!!";
    private static final String oldPasswordName = "Qazwsx44$$";
    private static final String newPasswordName = "Qazwsx55%%";
    private static final String url = "https://10.122.160.37/ui/mwallet/aui/#/";

    public static String getNewPasswordName() {
        return newPasswordName;
    }

    public static String getOldPasswordName() {
        return oldPasswordName;
    }

    public static String getPasswordName_2() {
        return PasswordName_2;
    }

    public static String getUserIdName() {
        return userIdName;
    }

    public static String getUserIdName_2() {
        return userIdName_2;
    }

    public static String getUrl() {
        return url;
    }

    public void useridLocator(String userIdName) {
        WebElement userL = driver.findElement(userIdFiled);

        userL.click();
        userL.clear();
        userL.sendKeys(userIdName);
    }

    public void passwordLocator(String oldPasswordName) {
        WebElement passwordL = driver.findElement(passwordField);
        passwordL.click();
        passwordL.clear();
        passwordL.sendKeys(oldPasswordName);
    }

    public void signInButton() {
        driver.findElement(signIn).click();
    }

    @Override
    public void loggOut() {
        super.loggOut();
    }

    @Override
    public void goToMWallet(String url) {
        driver.get(url);
    }

    public void setWelcomeField (){
        driver.findElement(welcomeField).getAttribute("value");
    }

    public void setUserIDField (){
        driver.findElement(UserIDField);

    }

    public void setEmailField (){
        driver.findElement(By.id(GENERATE_EMAIL(15)));
    }

    public void setContactPhoneNumberField (){
        driver.findElement(contactPhoneNumberField);
    }

    public void setEditAccountDetailsTopFiled (){
        WebElement editTop =  driver.findElement(editAccountDetailsTopFiled);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", editTop);
    }

    public void setEditAccountDetailsBottomFiled (){
        WebElement editBottom = driver.findElement(editAccountDetailsBottomFiled);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", editBottom);
    }

    public void setChangePasswordBottomField (){
        WebElement changePassBottom = driver.findElement(changePasswordBottomField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", changePassBottom);
    }

    public void setChangepasswordTopField (){
        WebElement changePassTop = driver.findElement(changepasswordTopField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", changePassTop);
    }

    public void setOldPasswordField (String oldPasswordName){
        WebElement oldPassword = driver.findElement(oldPasswordField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", oldPassword);
        oldPassword.sendKeys(oldPasswordName);
    }

    public void setNewPasswordFieldPasswordField (String newPasswordName){
        WebElement newPassword = driver.findElement(newPasswordField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", newPassword);
        newPassword.sendKeys(newPasswordName);
    }

    public void setReNewPasswordField(String newPasswordName){
        WebElement reNewPassword = driver.findElement(reNewPasswordField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", reNewPassword);
        reNewPassword.sendKeys(newPasswordName);
    }

    public void setFirstNameUpdateDetailsField (){
        WebElement firstname = driver.findElement(firstNameUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", firstname);
        firstname.clear();
        firstname.sendKeys(RANDOM_STRING());
    }

    public void setLastNameUpdateDetailsField (){
        WebElement lastName = driver.findElement(lastNameUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", lastName);
        lastName.clear();
        lastName.sendKeys(RANDOM_STRING());
    }

    public void setEmailUpdateDetailsField (String randomEmail){
        WebElement email = driver.findElement(emailUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", email);
        email.clear();
        email.sendKeys(GENERATE_EMAIL(15));
    }

    public void setContactPhoneUpdateDetailsField (String randomNumber){
        WebElement contactPhone = driver.findElement(contactPhoneUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", contactPhone);
        contactPhone.clear();
        contactPhone.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setNoteUpdateDetailsField (String random){
        WebElement note = driver.findElement(noteUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", note);
        note.clear();
        note.sendKeys(RANDOM_STRING());
    }

    public void setNextUpdateDetailsField (){
        WebElement nextButton = driver.findElement(nextUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", nextButton);
    }

    public void setConfirmUpdateDetailsField () {
        WebElement confirmButton = driver.findElement(confirmUpdateDetailsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", confirmButton);
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"adminAcntReEdt\"]"))));
    }

    public void setReEditField (){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(reEditField));
        WebElement reEdit = driver.findElement(reEditField);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", reEdit);
    }

    public void setSubmitPasswordChange (){
        WebElement submitPassChange = driver.findElement(submitPasswordChange);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submitPassChange);
    }

    public void setConfirmPasswordChangeButton (){
        WebElement confirmPassChange = driver.findElement(confirmPasswordChangeButton);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(areYouWantToChangePassword));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", confirmPassChange);
    }

    public void setCancelPasswordChangeButton (){
        WebElement cancelPassChange = driver.findElement(cancelPasswordChangeButton);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", cancelPassChange);
    }

    public void setGoToMyAccountButton (){
        WebElement goToMyAccount = driver.findElement(goToMyAccountButton);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", goToMyAccount);
    }


}
