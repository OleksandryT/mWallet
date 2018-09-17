package Functions.EmoneyManagement.ManageRetirement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageRetirementCreation {

    private static WebDriver driver;
    public ManageRetirementCreation (WebDriver driver){
        this.driver = driver;
    }

    private String success ="Retirement transaction seccessfully started. Another PSS Admin has to confirm this transfer before it will be completed.";

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


    public String getSuccess() {
        return success;
    }
}
