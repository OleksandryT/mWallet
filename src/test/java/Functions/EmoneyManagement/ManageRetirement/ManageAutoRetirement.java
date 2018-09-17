package Functions.EmoneyManagement.ManageRetirement;

import RandomValuesForTests.EmoneyManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageAutoRetirement  {

    private static WebDriver driver;
    public ManageAutoRetirement (WebDriver driver){
        this.driver=driver;
    }

    public static final By MANAGE_AUTO_RITEMENT = By.xpath("//*[@ng-click='permissions.goToManageRetirementMethods()']");
    public static final By BACK_TO_MANAGE_AUTO_RETIREMENT = By.xpath("//*[@ng-click = 'goToManageRetirementList()']");
    public static final By PENDING_AUTO_RETIREMENT = By.xpath("//*[@ng-show='permissions.canViewPendingRetirement']");
    public static final By SOURCE_ID_DROPDOWN = By.xpath("//*[@name = 'source']");
    public static final By SEARCH_BY_SOURCE_ID_BUTTON = By.xpath("//*[@ng-click = 'searchTransactions()']");
    public static final By CREATE_AUTO_RETIREMENT = By.xpath("//*[@ng-click='retirementMethodCreate()']");
    public static final By BANK_ISSUER_DROPDOWN = By.xpath("//*[@ng-model ='retirement.bank']");
    public static final By SOURCE_DROPDOWN = By.xpath("//*[@ng-model='retirement.source']");
    public static final By BANK_ISSUER_DROPDOWN_AUTO = By.xpath("//*[@ng-model='retirement.bank']");
    public static final By SOURCE_DROPDOWN_AUTO = By.xpath("//*[@id='source']");
    public static final By EXACT_AMOUNT_RADIO_BUTTON  =By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[1]/form/div[2]/retirement/div[2]/div[5]/div/input[2]");
    public static final By AMOUNT_FIELD = By.xpath("//*[@id=\"regAdmnAmount\"]");
    public static final By FREQUENCY_BUTTON = By.xpath("//*[@ng-model='retirement.frequency']");
    public static final By TIME_SLOT_HR = By.xpath("//*@ng-model='retirement.hour']");
    public static final By TIME_SLOT_MIN = By.xpath("//*@ng-model='retirement.minute']");
    public static final By NOTES = By.xpath("//*[@name='notes']");
    public static final By REASON = By.xpath("//*[@id='reason']");
    public static final By NEXT_BUTTON = By.xpath("//*[@translate='general_button_next']");
    public static final By CONFIRM_BUTTON = By.xpath("//*[@translate='general_button_confirm']");
    public static final By BACK_BUTTON = By.xpath("//*[@translate='general_button_back']");
    public static final By GO_TO_PENDING_RETIREMENT_LIST = By.xpath("//*[@ng-click='goToPendingRetirementList()']");
    public static final By GO_TO_MANAGE_AUTO_RETIREMENT = By.xpath("//*[@ng-click='goToManageRetirementMethodList()']");
    private String success = "Retirement method created successfully. Please approve by another admin.";

    public String getSuccess() {
        return success;
    }
}
