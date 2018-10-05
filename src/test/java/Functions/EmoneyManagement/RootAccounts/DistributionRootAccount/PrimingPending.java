package Functions.EmoneyManagement.RootAccounts.DistributionRootAccount;

import Utilities.EmoneyManagementt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimingPending extends EmoneyManagementt {

    private static WebDriver driver;
    public PrimingPending (WebDriver driver){
        this.driver = driver;
    }

    public static final By VIEW_PENDING_PRIME_LIST = By.xpath("//*[@ng-click=\"goToPendingPrimingList()\"]");
    public static final By TRANSACTION_ID_INPUT_FIELD = By.xpath("//*[@id='transactionIdInput']");
    public static final By CONFIRM_PRIMING_BUTTON = By.xpath("//*[@id=\"primingTxnConfirm\"]");
    public static final By REJECT_PRIMING_BUTTON = By.xpath("//*[@id=\"primingtxnfrReject\"]");
    public static final By COMMENT_FIELD = By.xpath("//*[@id=\"regAdmnNotes3\"]");

    @Override
    public void setEmoneyManagement() {
        super.setEmoneyManagement();
    }


    @Override
    public void setRootAccounts() {
        super.setRootAccounts();
    }

    @Override
    public void setDistributionRootAccount() {
        super.setDistributionRootAccount();
    }

    public void setViewPendingPrimeList (){
        WebElement viewPenidng = driver.findElement(VIEW_PENDING_PRIME_LIST);
        viewPenidng.click();
    }

    @Override
    public void searchByTxnID() {
        super.searchByTxnID();
    }



}
