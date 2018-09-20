package Functions.EmoneyManagement.ManageRetirement;

import RandomValuesForTests.EmoneyManagementt;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import org.apache.bcel.generic.GOTO;
import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.plugin2.message.JavaScriptBaseMessage;

import static RandomValuesForTests.RandomValues.*;

import java.util.Set;

public class ManageRetirementCreation extends EmoneyManagementt {

    private static WebDriver driver;

    public ManageRetirementCreation (WebDriver driver){
        this.driver = driver;
    }

    private static  String success ="Retirement transaction seccessfully started. Another PSS Admin has to confirm this transfer before it will be completed.";
    public static final By MANAGE_RETIREMENT = By.xpath("//*[@ng-show='permissions.canViewRetirement']");
    public static final By NEW_RETIREMENT_TRANSATIONS = By.xpath("//*[@ng-show='permissions.canCreateRetirement']");
    public static final By PENDING_MANAGEMENT_LIST = By.xpath("//*[@ng-show='permissions.canViewPendingRetirement']");
    public static final By TRANSACTION_ID_FIELD = By.xpath("//*[@ng-model='txnId']");
    public static final By SEARCH_BUTTON = By.xpath("//*[@ng-click='searchTransactions()']");
    public static final By CLEAR_BUTTON = By.xpath("//*[@ng-click='init()']");
    public static final By BANK_ISSUER_DROPDOWN = By.xpath("//*[@ng-model='retirement.bank']");
    public static final By SOURCE_DROPDOWN = By.xpath("//*[@id='source']");
    public static final By EXACT_AMOUNT_RADIO_BUTTON  =By.xpath("//*[@value='exact']");
    public static final By AMOUNT_FIELD = By.xpath("//*[@class='form-group required has-error']/div");
    public static final By NOTES = By.xpath("//*[@name='notes']");
    public static final By REASON = By.xpath("//*[@id='reason']");
    public static final By NEXT_BUTTON = By.xpath("//*[@translate='general_button_next']");
    public static final By CONFIRM_BUTTON = By.xpath("//*[@translate='general_button_confirm']");
    public static final By BACK_BUTTON = By.xpath("//*[@translate='general_button_back']");
    public static final By GO_TO_PENDING_RETIREMENT_LIST = By.xpath("//*[@ng-click='goToPendingRetirementList()']");


    public static String getSuccess() {
        return success;
    }

    @Override
    public void setEmoneyManagement() {
        super.setEmoneyManagement();
    }

    public void setManageRetirement (){
        WebElement manageRetirement = driver.findElement(MANAGE_RETIREMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",manageRetirement);
    }

    public void setNewRetirementTransations (){
        WebElement newRetirement = driver.findElement(NEW_RETIREMENT_TRANSATIONS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", newRetirement);
    }

    public  void setBankIssuerDropdownA() {
        Select A = new Select(driver.findElement(BANK_ISSUER_DROPDOWN));
        A.selectByVisibleText("A");
    }

    public void setBankIssuerDropdownB (){
        Select B = new Select(driver.findElement(BANK_ISSUER_DROPDOWN));
        B.selectByVisibleText("B");
    }

    public void setBankIssuerDropdownQ (){
        Select Q = new Select(driver.findElement(BANK_ISSUER_DROPDOWN));
        Q.selectByVisibleText("QUASI");
    }

    public void setSourceDropdownFCRoot (){
        Select FCRoot = new Select(driver.findElement(SOURCE_DROPDOWN));
        FCRoot.selectByVisibleText("FC Root");
    }

    public void setSourceDropdownFeeCommissionRoot (){
        Select FeeCommissionRoot = new Select(driver.findElement(SOURCE_DROPDOWN));
        FeeCommissionRoot.selectByVisibleText("Fee Commission Root");
    }

    public void setSourceDropdownSettlementRoot (){
        Select SettlementRoot = new Select(driver.findElement(SOURCE_DROPDOWN));
        SettlementRoot.selectByVisibleText("Settlement Root");
    }

    public void setExactAmountRadioButton (){
        WebElement radioButton = driver.findElement(EXACT_AMOUNT_RADIO_BUTTON);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", radioButton);
    }

    public void setAmountField (){
        WebElement amount = driver.findElement(AMOUNT_FIELD);
        amount.click();
        amount.sendKeys(RANDOM_NUMBER);
    }

    public void setNotes (){
        WebElement note = driver.findElement(NOTES);
        note.click();
        note.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setReason (){
        WebElement reason = driver.findElement(REASON);
        reason.click();
        reason.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setNextButton (){
        driver.findElement(NEXT_BUTTON).click();
    }

    public void setConfirmButton(){
        driver.findElement(CONFIRM_BUTTON).click();
    }

    public void setGoToPendingRetirementList (){
        driver.findElement(GO_TO_PENDING_RETIREMENT_LIST).click();
    }

    public void createRetirementWithExactAmount (){
        setEmoneyManagement();
        setManageRetirement();
        setNewRetirementTransations();
        setBankIssuerDropdownA();
        setSourceDropdownFCRoot();
        setExactAmountRadioButton();
        setAmountField();
        setNotes();
        setReason();
        setNextButton();
        setConfirmButton();
    }
}
