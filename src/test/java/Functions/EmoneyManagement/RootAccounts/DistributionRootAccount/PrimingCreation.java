package Functions.EmoneyManagement.RootAccounts.DistributionRootAccount;

import Utilities.EmoneyManagementt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrimingCreation extends EmoneyManagementt {

    private static WebDriver driver;
    public PrimingCreation(WebDriver driver){
        this.driver = driver;
    }

    public static final By PRIME_DISTRIBUTION_ACCOUNT = By.xpath("//*[@ng-click=\"goToPriming()\"]");
    public static final By BANK_DROPDOWN = By.xpath("//*[@id=\"bank\"]");
    public static final By AMOUNT = By.xpath("//*[@id=\"amount\"]");
    public static final By REASON = By.xpath("//*[@id=\"note\"]");
    public static final By NOTE = By.xpath("//*[@placeholder=\"Note\"]");
    public static final By NEXT = By.xpath("//*[@name=\"regPrimeAcNext\"]");
    public static final By CANCEL = By.xpath("//*[@id =\"regPrimeAcReset\"]");
    public static final By BACK = By.xpath("//*[@id =\"regPrimeAcBack\"]");
    public static final By CONFIRM = By.xpath("//*[@id =\"saveAdmin\"]");
    public static final By CANCEL_ON_CONFIRMATION_PAGE = By.xpath("//*[@id =\"cancelAdmin\"]");
    public static final By GO_TO_EMONEY_MANAGEMENT = By.xpath("//*[@id =\"goBackEmoneyButton\"]");

    @Override
    public void setEmoneyManagement() {
        super.setEmoneyManagement();
    }

    @Override
    public void setDistributionRootAccount() {
        super.setDistributionRootAccount();
    }

    @Override
    public void setRootAccounts() {
        super.setRootAccounts();
    }
}
