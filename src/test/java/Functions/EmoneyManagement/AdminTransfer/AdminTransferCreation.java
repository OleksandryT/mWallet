package Functions.EmoneyManagement.AdminTransfer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminTransferCreation {

    private static WebDriver driver;
    public AdminTransferCreation(WebDriver driver) {
        this.driver = driver;
    }

    private static String MERCHANT_SOURCE_ID = "009805915";
    private static String PAYMENT_SYSTEM_DESTINATION_ID = "005671744";
    private static final String TXN_ID = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[3]/div/form/div/div/div/label")).getText();

    public static final By EMONEY_MANAGEMENT = By.xpath("//*[@translate=\"general_label_emoney_management\"]");
    public static final By ADMIN_TRANSFER = By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/ul/li[3]/a");
    public static final By SOURCE_TYPE_DROPDOWN = By.xpath("//*[@name='transferSourceType']");
    public static final By DESTINATION_TYPE_DROPDOWN = By.xpath("//*[@name='transferDestinationType']");
    public static final By BANK = By.xpath("//*[@name='bank']");
    public static final By AMOUNT = By.xpath("//*[@id='regAdmnAmount']");
    public static final By NOTE = By.xpath("//*[@name='regAdmnNotes1']");
    public static final By CLEAR = By.xpath("//*[@name='regAdmnReset']");
    public static final By NEXT =  By.xpath("//*[@id='regAdmnNext']");
    public static final By SOURCE_MERCHANT_ID = By.xpath("//*[@placeholder='Source Merchant ID']");
    public static final By DESTINATION_MERCHANT_ID = By.xpath("//*[@placeholder='Destination Merchant ID']");
    public static final By GO_TO_ADMIN_TRANSFER = By.xpath("//*[@id='goToAdminTransferButton']");
    public static final By CONFIRM_CREATION_OF_ADMIN_TRANSFER = By.xpath("//*[@id=\"saveAdmin\"]");

    public static String getMerchantSourceId() {
        return MERCHANT_SOURCE_ID;
    }

    public static String getTxnId() {
        return TXN_ID;
    }

    public static String getPaymentSystemDestinationId() {
        return PAYMENT_SYSTEM_DESTINATION_ID;
    }

    public void setEmoneyManagement (){
        WebElement emoneyManagement = driver.findElement(EMONEY_MANAGEMENT);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",emoneyManagement);
    }

    public static void setAdminTransfer (){
        WebElement adminTransfer = driver.findElement(ADMIN_TRANSFER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",adminTransfer);
    }

    public static void setSourceTypeDropdown(){
        WebElement sourceType = driver.findElement(SOURCE_TYPE_DROPDOWN);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",sourceType);
    }

    public static void setSourceTypeDistribution (){
        Select distribution = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        distribution.selectByVisibleText("Distribution Root Account");
    }

    public static void setSourceTypeFCRoot(){
        Select fcroot = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        fcroot.selectByVisibleText("FC Root Account");
    }

    public static void setSourceTypeMerchantSVA(){
        Select merchantSVA = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        merchantSVA.selectByVisibleText("Merchant SVA");
    }

    public static void setSourceTypeOpCo(){
        Select opCo = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        opCo.selectByVisibleText("OpCo Fee/Commission Account");
    }

    public static void setSourceTypePaymentSystemSVA(){
        Select paymentSystem = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        paymentSystem.selectByVisibleText("Payment System SVA");
    }

    public static void setSourceTypeReplenishment(){
        Select replenishment = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        replenishment.selectByVisibleText("Replenishment Root Account");
    }

    public static void setSourceTypeSettlement(){
        Select settlement = new Select(driver.findElement(SOURCE_TYPE_DROPDOWN));
        settlement.selectByVisibleText("Settlement Root Account");
    }

    public static void setDestinationTypeDropdown (){
        WebElement destinationType = driver.findElement(DESTINATION_TYPE_DROPDOWN);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",destinationType);
    }

    public static void setDestinationTypeBank(){
        Select bank = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        bank.selectByVisibleText("Bank root");
    }

    public static void setDestinationTypeFCRoot(){
        Select fc = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        fc.selectByVisibleText("FC Root Account");
    }

    public static void setDestinationTypeMerchantSVA(){
        Select merchantSVA = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        merchantSVA.selectByVisibleText("MerchantSVA");
    }

    public static void setDestinationTypeOPCO(){
        Select opco = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        opco.selectByVisibleText("OpCo Fee/Commission Account");
    }

    public static void setDestinationTypePaymentSystem(){
        Select paymentSystem = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        paymentSystem.selectByVisibleText("Payment system SVA");
    }

    public static void setDestinationTypeReplenishment(){
        Select replenishment = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        replenishment.selectByVisibleText("Replenishment Root Account");
    }

    public static void setDestinationTypeSettlement(){
        Select settlement = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        settlement.selectByVisibleText("Settlement Root Account");
    }

    public static void setDestinationTypeDistribution(){
        Select distribution = new Select(driver.findElement(DESTINATION_TYPE_DROPDOWN));
        distribution.selectByVisibleText("Distribution Root Account");
    }

    public static void setSourceMerchantId(){
        WebElement merchantSource = driver.findElement(SOURCE_MERCHANT_ID);
        merchantSource.click();
        merchantSource.sendKeys(MERCHANT_SOURCE_ID);
    }

    public static void setDestinationMerchantId (){
        WebElement merchantDestination = driver.findElement(DESTINATION_MERCHANT_ID);
        merchantDestination.click();
        merchantDestination.sendKeys(PAYMENT_SYSTEM_DESTINATION_ID);
    }

    public static void setBankA (){
        Select bankA = new Select(driver.findElement(BANK));
        bankA.selectByVisibleText("A");
    }

    public static void setBankB (){
        Select bankB = new Select(driver.findElement(BANK));
        bankB.selectByVisibleText("B");
    }

    public static void setBankQ (){
        Select bankQ = new Select(driver.findElement(BANK));
        bankQ.selectByVisibleText("QUASI");
    }

    public static void setAmount (String sum){
        WebElement amount = driver.findElement(AMOUNT);
        amount.click();
        amount.sendKeys(sum);
    }

    public static void setNote(String text){
        WebElement note = driver.findElement(NOTE);
        note.click();
        note.sendKeys(text);
    }

    public static void setClear (){
        driver.findElement(CLEAR).click();
    }

    public static void setNext(){
        driver.findElement(NEXT).click();
    }

    public static void setConfirmCreationOfAdminTransfer (){
        driver.findElement(CONFIRM_CREATION_OF_ADMIN_TRANSFER).click();
    }

    public static void setGoToAdminTransfer(){
        driver.findElement(GO_TO_ADMIN_TRANSFER).click();
    }

}
