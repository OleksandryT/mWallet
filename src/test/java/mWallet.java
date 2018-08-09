import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static  org.apache.commons.lang3.RandomStringUtils.*;

public class mWallet extends RandomValues {

    private WebDriver driver;
    public mWallet (WebDriver driver){
        this.driver = driver;
    }


    String userIdName = "IlonaQA4";
    String passwordName = "Zxcvbnm10!)";

    By userIdFiled = By.cssSelector(".InputTableRow > td:nth-child(2) > input:nth-child(1)");
    By passwordField = By.cssSelector(".loginTable > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)");
    By signIn = By.cssSelector("#login");
    By merchantsField = By.xpath("//*[@id=\"wrapper\"]/ul/li[4]/a");
    By createMerchantField = By.xpath("/html/body/div[4]/navp/div[3]/div/ul/li[4]/ul/li[3]/a");
    By merchantTypeDropbox = By.xpath("//*[@id=\"merchantType\"]");
    By merchantTypeMerchantField = By.xpath("//*[@translate=\"merchant_type_merchant\"][1]");
    By fullnameField = By.xpath("//*[@id=\"fullName\"]");
    By shortNameField = By.xpath("//*[@id=\"shortName\"]");
    By tradeNameOrganizationField = By.xpath("//*[@placeholder=\"Trade Name of the Organization\"]");
    By organizationFormField = By.xpath("//*[@placeholder=\"Organization form\"]");
    By businessEntityDropbox = By.xpath("//*[@name=\"businessEntityType\"]");
    By businessEntityTypePrivateField = By.xpath("//*[@name=\"businessEntityType\"]/option[2]");
    By businessEntityTypeLegalField = By.xpath("//*[@name=\"businessEntityType\"]/option[1]");
    By listOfMerchantsPointsOfSaleCreateNewPointOfSaleButton = By.xpath("//*[@translate=\"general_button_create_new_pos\"]");
    By newPosNameField = By.xpath("//*[@id=\"newPosName\"]");
    By newPosAddressField = By.xpath("//*[@id=\"newPosAddress\"]");
    By addPosButton = By.xpath("//*[@ng-click=\"newPosAdd()\"]");
    By listOfregionswhereMerchantOperatesDropdown = By.xpath("//*[@ng-click=\"toggleDropdown()\"]");
    By listOfRegionsVinnytskaobl = By.xpath("//*[contains(text(),'Вінницька обл.')]");
    By legalAddressFiled = By.xpath("//*[@ng-model = \"merchant.legalAddress\"]");
    By actualAddressFiled = By.xpath("//*[@ng-model = \"merchant.actualAddress\"]");
    By correspondenceAddressFiled = By.xpath("//*[@ng-model = \"merchant.correspondenceAddress\"]");
    By phoneNumberField = By.xpath("//*[@ng-model = \"merchant.contactPhoneNumber\"]");
    By contactEmailField = By.xpath("//*[@ng-model = \"merchant.contactEmail\"]");
    By contactWebsiteField = By.xpath("//*[@ng-model = \"merchant.contactWebsite\"]");
    By contactCallCenterNumberField = By.xpath("//*[@name = 'callCenterNumber']");
    By notificationChannelSmsField = By.xpath("//*[@name = \"merchant_receive_sms\"]");
    By notificationChannelEmailField = By.xpath("//*[@name = \"merchant_receive_email\"]");
    By nextButtonCompany = By.xpath(" //*[@name=\"companyDetailsFormNext\"]");
    By IDOfMerchantContractWithAgentForSettlement0Field = By.xpath("//*[@id=\"agreementContractId0\"]");
    By dateofMerchantContractWithAgentDate0Picker = By.xpath(" //*[@id=\"datePickerAgreementDate0\"]/span/span");
    By agreementContractScan0Button = By.xpath("//*[@id=\"agreementContractScan0\"]");
    By IDOfMerchantContractWithAgentForSettlement1Field = By.xpath("//*[@id=\"agreementContractId1\"]");
    By dateofMerchantContractWithAgentDate1Picker = By.xpath(" //*[@id=\"datePickerAgreementDate1\"]/span/span");
    By agreementContractScan1Button = By.xpath("//*[@id=\"agreementContractScan1\"]");
    By IDOfMerchantContractWithAgentForSettlement2Field = By.xpath("//*[@id=\"agreementContractId2\"]");
    By dateofMerchantContractWithAgentDate2Picker = By.xpath(" //*[@id=\"datePickerAgreementDate2\"]/span/span");
    By agreementContractScan2Button = By.xpath("//*[@id=\"agreementContractScan2\"]");
    By IDOfMerchantContractWithAgentForSettlement3Field = By.xpath("//*[@id=\"agreementContractId3\"]");
    By dateofMerchantContractWithAgentDate3Picker = By.xpath(" //*[@id=\"datePickerAgreementDate3\"]/span/span");
    By agreementContractScan3Button = By.xpath("//*[@id=\"agreementContractScan3\"]");
    By scanCopyOfPassportButton = By.xpath("//*[@id=\"agreementOtherDocumentPassportScan\"]");
    By scanCopyOfTaxIdButton = By.xpath("//*[@id=\"agreementOtherDocumentTaxIdScan\"]");
    By scanStatementOfCsrButton = By.xpath("//*[@id=\"agreementOtherDocumentStatementFromCsrScan\"]");
    By scanStatementExtractFromCsrButton = By.xpath("//*[@id=\"agreementOtherDocumentExtractFromCsrScan\"]");
    By scanStatementQuestionnareButton = By.xpath("//*[@id=\"agreementOtherDocumentQuestionnaireScan\"]");
    By fullNameContactField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_operational_issues\"]");
    By positionContactField = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_operational_issues\"]");
    By mobileNumberContactField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_operational_issues\"]");
    By workEmailContactField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_operational_issues\"]");
    By fullNameContactITField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_it_issues\"]");
    By positionContactITField = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_it_issues\"]");
    By mobileNumberContactITField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_it_issues\"]");
    By workEmailContactITField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_it_issues\"]");
    By fullNameContactFinField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_financial_issues\"]");
    By positionContactFinField = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_financial_issues\"]");
    By mobileNumberContactFinField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_financial_issues\"]");
    By workEmailContactFinField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_financial_issues\"]");
    By accountNoCompanyDetailsField = By.xpath("//*[@id=\"merchant_representative_company_details_account_no\"]");
    By bankNameCompanyDetailsField = By.xpath("//*[@id=\"merchant_representative_company_details_bank_name\"]");
    By bankIdComapnyDetailsField = By.xpath("//*[@id=\"merchant_representative_company_details_bank_id\"]");
    By stateEnterpriseRegistryIdField = By.xpath("//*[@id=\"merchant_representative_company_details_state_enterprise_registry_id\"]");
    By contractSigneeNameField = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_name\"]");
    By contractSigneePositionField = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_position\"]");
    By contractSigneeBasisField = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_basis\"]");
    By contractSigneeFullnameField = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_tab_full_name\"]");
    By contractSigneePositionField1 = By.xpath(" //*[@id=\"merchant_representative_company_details_contract_signee_tab_postion\"]");
    By contractSigneeMobileNumberField = By.xpath(" //*[@id=\"merchant_representative_company_details_contract_signee_tab_mobile\"]");
    By signeePassportScanButton = By.xpath(" //*[@id=\"signeePassportScan\"]");
    By signeeTaxIdScanButton = By.xpath(" //*[@id=\"signeeTaxidScan\"]");
    By signeeAuthorizingScanButton = By.xpath(" //*[@id=\"signeeAuthorScan\"]");
    By NextButton = By.xpath("//*[@name=\"regRepDetailNext\"]");
    By numberOfWorkingDaysForFundsInbankField = By.xpath("//*[@placeholder=\"Number of working days for funds will be available in bank after fund-out\"]");
    By merchantApiField = By.xpath("//*[@id=\"apiUrl\"]");
    By feeForRefundField = By.xpath("//*[@placeholder=\"Fee for refund\"]");
    By turnoverOverLastYearField = By.xpath("//*[@placeholder=\"Turnover over the last business year, UAH\"]");
    By testServerIpField = By.xpath("//*[@placeholder=\"Test server IP\"]");
    By testServerPortField = By.xpath("//*[@placeholder=\"Test server port\"]");
    By testProductionServerIpField = By.xpath("//*[@placeholder=\"Production server IP\"]");
    By testProductionServerPortField = By.xpath("//*[@placeholder=\"Production server port\"]");
    By bankdetailRecipientNameField0 = By.xpath("//*[@id=\"bankDetailRecipientNamebd0\"]");
    By bankdetailRecipientIdField0 = By.xpath("//*[@id=\"bankDetailRecipientIdbd0\"]");
    By bankdetailRecipientAccountNoField0 = By.xpath("//*[@id=\"bankDetailAccountNumberbd0\"]");
    By bankdetailRecipientBankCodeField0 = By.xpath("//*[@id=\"bankDetailBankCodebd0\"]");
    By bankdetailRecipientBankNameField0 = By.xpath("//*[@id=\"bankDetailBankNamebd0\"]");
    By bankdetailRecipientPaymentPurposeField0 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd0\"]");
    By bankdetailRecipientNameField1 = By.xpath("//*[@id=\"bankDetailRecipientNamebd1\"]");
    By bankdetailRecipientIdField1 = By.xpath("//*[@id=\"bankDetailRecipientIdbd1\"]");
    By bankdetailRecipientAccountNoField1 = By.xpath("//*[@id=\"bankDetailAccountNumberbd1\"]");
    By bankdetailRecipientBankCodeField1 = By.xpath("//*[@id=\"bankDetailBankCodebd1\"]");
    By bankdetailRecipientBankNameField1 = By.xpath("//*[@id=\"bankDetailBankNamebd1\"]");
    By bankdetailRecipientPaymentPurposeField1 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd1\"]");
    By bankdetailRecipientNameField2 = By.xpath("//*[@id=\"bankDetailRecipientNamebd2\"]");
    By bankdetailRecipientIdField2 = By.xpath("//*[@id=\"bankDetailRecipientIdbd2\"]");
    By bankdetailRecipientAccountNoField2 = By.xpath("//*[@id=\"bankDetailAccountNumberbd2\"]");
    By bankdetailRecipientBankCodeField2 = By.xpath("//*[@id=\"bankDetailBankCodebd2\"]");
    By bankdetailRecipientBankNameField2 = By.xpath("//*[@id=\"bankDetailBankNamebd2\"]");
    By bankdetailRecipientPaymentPurposeField2 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd2\"]");
    By paymentPurposeField = By.xpath("//*[@id=\"bankDetailPaymentPurposeepr\"]");
    By saveButton = By.xpath("//*[@id=\"regMerchSave\"]");


//    By transactionsField = By.xpath("//*[@translate=\"general_label_transactions\"]");
    //
//    public void transactionsButton() {
//        WebElement transaction = driver.findElement(transactionsField);
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();",transaction);
//    }



    public void useridLocator (String userIdName) {
           WebElement userL = driver.findElement(userIdFiled);
            userL.click();
            userL.clear();
            userL.sendKeys(userIdName);
        }

    public void passwordLocator (String passwordName){
        WebElement passwordL = driver.findElement(passwordField);
        passwordL.click();
        passwordL.clear();
        passwordL.sendKeys(passwordName);
    }

    public void signInButton (){
        driver.findElement(signIn).click();
    }

    public void signIn() {
        useridLocator(userIdName);
        passwordLocator(passwordName);
        signInButton();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.titleIs("Back Office Portal"));
    }

    public void merchantLocator(){
        WebElement merchantField = driver.findElement(merchantsField);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",merchantField);
    }

    public void createMerchantLocator (){
        WebElement createmerchantField = driver.findElement(createMerchantField);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",createmerchantField);
    }

    public void merchnatTypeDropboxLocator (){
        driver.findElement(merchantTypeDropbox).click();
    }

    public void merchantTypeMerchantLocator (){
        driver.findElement(merchantTypeMerchantField).click();
    }

    public void fullnameLocator(){
        WebElement fullname = driver.findElement(fullnameField);
        fullname.click();
        fullname.clear();
        fullname.sendKeys(randomAlphabetic);
    }

    public void shortNameLocator (){
        WebElement shortname = driver.findElement(shortNameField);
        shortname.click();
        shortname.clear();
        shortname.sendKeys(randomAlphabetic);
    }

    public void setTradeNameOrganizationField (){
        WebElement tradeName = driver.findElement(tradeNameOrganizationField);
        tradeName.click();
        tradeName.clear();
        tradeName.sendKeys(randomAlphabetic);
    }

    public void setOrganizationForm (){
        WebElement organization = driver.findElement(organizationFormField);
        organization.click();
        organization.clear();
        organization.sendKeys(randomAlphabetic);
    }

    public void setBusinessEntityDropbox (){
        driver.findElement(businessEntityDropbox).click();
    }

    public void setBusinessEntityTypePrivateField (){
        driver.findElement(businessEntityTypePrivateField).click();
    }

    public void setBusinessEntityTypeLegalField() {
        driver.findElement(businessEntityTypeLegalField).click();
    }

    public void setListOfMerchantsPointsOfSaleCreateNewPointOfSaleButton (){
        driver.findElement(listOfMerchantsPointsOfSaleCreateNewPointOfSaleButton).click();
    }

    public void setPosName(){
        WebElement pos = driver.findElement(newPosNameField);
        pos.click();
        pos.clear();
        pos.sendKeys(randomAlphabetic);
    }

    public void setPosAddress (){
        WebElement posAddre = driver.findElement(newPosAddressField);
        posAddre.click();
        posAddre.clear();
        posAddre.sendKeys(randomAlphabetic);
    }

    public void addpos (){
        driver.findElement(addPosButton).click();
    }

    public void setListOfregionswhereMerchantOperatesDropdown (){
        driver.findElement(listOfregionswhereMerchantOperatesDropdown).click();
    }
    public void setListOfRegionsVinnytskaobl (){
        driver.findElement(listOfRegionsVinnytskaobl).click();
    }

    public void setLegalAddress (){
        WebElement legalAdre = driver.findElement(legalAddressFiled);
        legalAdre.click();
        legalAdre.clear();
        legalAdre.sendKeys(randomAlphabetic);
    }

    public void setActualAddressFiled (){
        WebElement actualAdd = driver.findElement(actualAddressFiled);
        actualAdd.click();;
        actualAdd.clear();
        actualAdd.sendKeys(randomAlphabetic);
    }

    public void setCorrespondenceAddress (){
        WebElement correspondenceAdd = driver.findElement(correspondenceAddressFiled);
        correspondenceAdd.click();
        correspondenceAdd.clear();
        correspondenceAdd.sendKeys(randomAlphabetic);
    }

    public void setPhoneNumberField (){
        WebElement phone = driver.findElement(phoneNumberField);
        phone.click();
        phone.clear();
        phone.sendKeys(randomNumber);
    }

    public void setContactEmail (){
        WebElement email = driver.findElement(contactEmailField);
        email.click();
        email.clear();
        email.sendKeys(generateEmail(20));
    }

    public void setContactWebsite (){
        WebElement web = driver.findElement(contactWebsiteField);
        web.click();
        web.clear();
        web.sendKeys(generateUrl(10));
    }

    public void setContactCallCenterNumberField (){
        WebElement callCenter = driver.findElement(contactCallCenterNumberField);
        callCenter.click();
        callCenter.clear();
        callCenter.sendKeys(randomNumber);
    }

    public void setNotificationChannelSmsField (){
        driver.findElement(notificationChannelSmsField).click();
    }

    public void setNotificationChannelEmailField (){
        driver.findElement(notificationChannelEmailField).click();
    }

    public void setNextButtonCompany (){
        driver.findElement(nextButtonCompany).click();
    }

    public void setIDOfMerchantContractWithAgentForSettlement0Field (){
        WebElement merchantContractWithSettlement = driver.findElement(IDOfMerchantContractWithAgentForSettlement0Field);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",merchantContractWithSettlement);
        merchantContractWithSettlement.sendKeys(randomNumber);
    }

    public void setDateofMerchantContractWithAgentDate0Picker (){
        WebElement dateWidget = driver.findElement(dateofMerchantContractWithAgentDate0Picker);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",dateWidget);
        Actions actions = new Actions(driver);
        actions.sendKeys(calendarDate);
        actions.perform();
    }

    public void setAgreementContractScan0Button (){
        WebElement contractWithAgent = driver.findElement(agreementContractScan0Button);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",contractWithAgent);
        Actions actions = new Actions(driver);
        actions.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
        actions.perform();
    }


    public void merchantCreation() {
        merchantLocator();
        createMerchantLocator();
        merchnatTypeDropboxLocator();
        merchantTypeMerchantLocator();
        fullnameLocator();
        shortNameLocator();
        setTradeNameOrganizationField();
        setOrganizationForm();
        setBusinessEntityDropbox();
        setBusinessEntityTypePrivateField();
        setListOfMerchantsPointsOfSaleCreateNewPointOfSaleButton();
        setPosName();
        setPosAddress();
        addpos();
        setListOfregionswhereMerchantOperatesDropdown();
        setListOfRegionsVinnytskaobl();
        setLegalAddress();
        setActualAddressFiled();
        setCorrespondenceAddress();
        setPhoneNumberField();
        setContactEmail();
        setContactWebsite();
        setContactCallCenterNumberField();
        setNotificationChannelSmsField();
        setNextButtonCompany();
        setIDOfMerchantContractWithAgentForSettlement0Field();
        setDateofMerchantContractWithAgentDate0Picker();
        setAgreementContractScan0Button();


    }

}
