package Functions.Merchants;


import RandomValuesForTests.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static RandomValuesForTests.RandomValues.*;

public class MerchantCreation extends Merchants {
/*
* вынести все переменные в отдельный класс, что бы они не засоряли класс
* переименовать методы в такие, чо бы можно было понимать что каждый метод делает
* */

    private WebDriver driver;

    public MerchantCreation(WebDriver driver) {
        this.driver = driver;
    }

    private MerchantCreation(){}

    public static final By MERCHANTS_FIELD = By.xpath("//*[@id=\"wrapper\"]/ul/li[4]/a");
    public static final By CREATE_MERCHANT_FIELD = By.xpath("/html/body/div[4]/navp/div[3]/div/ul/li[4]/ul/li[3]/a");
    public static final By MERCHANT_TYPE_DROPBOX = By.xpath("//*[@id=\"merchantType\"]");
    public static final By MERCHANT_TYPE_MERCHANT_FIELD = By.xpath("//*[@translate=\"merchant_type_merchant\"][1]");
    public static final By FULL_NAME_FIELD = By.xpath("//*[@id=\"fullName\"]");
    public static final By SHORT_NAME_FIELD = By.xpath("//*[@id=\"shortName\"]");
    public static final By TRADE_NAME_ORGANIZATION_FIELD = By.xpath("//*[@placeholder=\"Trade Name of the Organization\"]");
    public static final By ORGANIZATION_FORM_FIELD = By.xpath("//*[@placeholder=\"Organization form\"]");
    public static final By BUSINESS_ENTITY_DROPBOX = By.xpath("//*[@name=\"businessEntityType\"]");
    public static final By BUSINESS_ENTITY_TYPE_PRIVATE_FIELD = By.xpath("//*[@name=\"businessEntityType\"]/option[2]");
    public static final By BUSINESS_ENTITY_TYPE_LEGALFIELD = By.xpath("//*[@name=\"businessEntityType\"]/option[1]");
    public static final By LIST_OF_MERCHANTS_POINTS_OF_SALE_CREATE_NEW_POINT_OF_SALE_BUTTON = By.xpath("//*[@translate=\"general_button_create_new_pos\"]");
    public static final By NEW_POSNAME_FIELD = By.xpath("//*[@id=\"newPosName\"]");
    public static final By NEW_POSADDRESS_FIELD = By.xpath("//*[@id=\"newPosAddress\"]");
    public static final By ADD_POSBUTTON = By.xpath("//*[@ng-click=\"newPosAdd()\"]");
    public static final By LIST_OF_REGIONS_WHERE_MERCHANT_OPERATES_DROPDOWN = By.xpath("//*[@ng-click=\"toggleDropdown()\"]");
    public static final By LIST_OF_REGIONS_VINNYTSKAOBL = By.xpath("//*[contains(text(),'Вінницька обл.')]");
    public static final By LEGAL_ADDRESS_FILED = By.xpath("//*[@ng-model = \"merchant.legalAddress\"]");
    public static final By ACTUAL_ADDRESS__FILED = By.xpath("//*[@ng-model = \"merchant.actualAddress\"]");
    public static final By CORRESPONDENCE_ADDRESS_FILED = By.xpath("//*[@ng-model = \"merchant.correspondenceAddress\"]");
    public static final By PHONE_NUMBER_FIELD = By.xpath("//*[@ng-model = \"merchant.contactPhoneNumber\"]");
    public static final By CONTACT_EMAIL_FIELD = By.xpath("//*[@ng-model = \"merchant.contactEmail\"]");
    public static final By CONTACT_WEB_SITE_FIELD = By.xpath("//*[@ng-model = \"merchant.contactWebsite\"]");
    public static final By CONTACT_CALL_CENTER_NUMBER_FIELD = By.xpath("//*[@name = 'callCenterNumber']");
    public static final By NOTIFICATION_CHANNEL_SMS_FIELD = By.xpath("//*[@name = \"merchant_receive_sms\"]");
    public static final By NOTIFICATION_CHANNEL_EMAIL_FIELD = By.xpath("//*[@name = \"merchant_receive_email\"]");
    public static final By NEXT_BUTTON_COMPANY = By.xpath("//*[@id=\"companyDetailsFormNext\"]");
    public static final By ID_OF_MERCHANT_CONTRACT_WITH_AGENT_FOR_SETTLEMENT_0_FIELD = By.xpath("//*[@id=\"agreementContractId0\"]");
    public static final By DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_0_PICKER = By.xpath(" //*[@name=\"contractDate0\"]");
    public static final By AGREEMENT_CONTRACT_SCAN_0_BUTTON = By.xpath("//*[@id=\"agreementContractScan0\"]");
    public static final By ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_1_FIELD = By.xpath("//*[@id=\"agreementContractId1\"]");
    public static final By DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_1_PICKER = By.xpath(" //*[@id=\"contractDate1\"]");
    public static final By AGREEMENT_CONTRACT_SCAN_1_BUTTON = By.xpath("//*[@id=\"agreementContractScan1\"]");
    public static final By ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_2_FIELD = By.xpath("//*[@id=\"agreementContractId2\"]");
    public static final By DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_2_PICKER = By.xpath(" //*[@id=\"contractDate2\"]");
    public static final By AGREEMENT_CONTRACT_SCAN_2_BUTTON = By.xpath("//*[@id=\"agreementContractScan2\"]");
    public static final By ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_3_FIELD = By.xpath("//*[@id=\"agreementContractId3\"]");
    public static final By DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_3_PICKER = By.xpath(" //*[@id=\"contractDate3\"]");
    public static final By AGREEMENT_CONTRACT_SCAN_3_BUTTON = By.xpath("//*[@id=\"agreementContractScan3\"]");
    public static final By SCAN_COPY_OF_STATUE_BUTTON = By.xpath("//*[@id=\"agreementOtherDocumentStatuteScan\"]");
    public static final By SCAN_COPY_OF_TAX_ID_BUTTON = By.xpath("//*[@id=\"agreementOtherDocumentTaxCertificateScan\"]");
    public static final By SCAN_STATEMENT_OF_CSR_BUTTON = By.xpath("//*[@id=\"agreementOtherDocumentStatementFromCsrScan\"]");
    public static final By SCAN_STATEMENT_EXTRACT_FROM_CSR_BUTTON = By.xpath("//*[@id=\"agreementOtherDocumentExtractFromCsrScan\"]");
    public static final By SCAN_STATEMENT_QUESTIONNARE_BUTTON = By.xpath("//*[@id=\"agreementOtherDocumentQuestionnaireScan\"]");
    public static final By FULL_NAME_CONTACT_FIELD = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_director\"]");
    public static final By POSITION_CONTACT_FIELD = By.xpath(" //*[@id=\"positionmerchant_representative_data_director\"]");
    public static final By COUNTRY_OF_RESIDENCE = By.xpath("//*[@id=\"countryOfResidencemerchant_representative_data_director\"]");
    public static final By MOBILE_NUMBER_CONTACT_FIELD = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_director\"]");
    public static final By WORK_EMAIL_CONTACT_FIELD = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_director\"]");
    public static final By ACCOUNT_FULL_NAME_CONTACT_FIELD = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_chief_accountant\"]");
    public static final By ACCOUNT_POSITION_CONTACT_FIELD = By.xpath(" //*[@id=\"positionmerchant_representative_data_chief_accountant\"]");
    public static final By ACCOUNT_COUNTRY_OF_RESIDENCE = By.xpath("//*[@id=\"countryOfResidencemerchant_representative_data_chief_accountant\"]");
    public static final By ACCOUNT_MOBILE_NUMBER_CONTACT_FIELD = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_chief_accountant\"]");
    public static final By ACCOUNT_WORK_EMAIL_CONTACT_FIELD = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_chief_accountant\"]");
    public static final By OPERATION_FULL_NAME_CONTACT_FIELD = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_operational_issues\"]");
    public static final By OPERATION_POSITION_CONTACT_FIELD = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_operational_issues\"]");
    public static final By OPERATION_MOBILE_NUMBER_CONTACT_FIELD = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_operational_issues\"]");
    public static final By OPERATION_WORK_EMAIL_CONTACT_FIELD = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_operational_issues\"]");
    public static final By FULL_NAME_CONTACT_IT_FIELD = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_it_issues\"]");
    public static final By POSITION_CONTACT_IT_FIELD = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_it_issues\"]");
    public static final By MOBILE_NUMBER_CONTACT_IT_FIELD = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_it_issues\"]");
    public static final By WORK_EMAIL_CONTACT_IT_FIELD = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_it_issues\"]");
    public static final By FULL_NAME_CONTACT_FIN_FIELD = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_financial_issues\"]");
    public static final By POSITION_CONTACT_FIN_FIELD = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_financial_issues\"]");
    public static final By MOBILE_NUMBER_CONTACT_FIN_FIELD = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_financial_issues\"]");
    public static final By WORK_EMAIL_CONTACT_FIN_FIELD = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_financial_issues\"]");
    public static final By ACCOUNT_NO_COMPANY_DETAILS_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_account_no\"]");
    public static final By BANK_NAME_COMPANY_DETAILS_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_bank_name\"]");
    public static final By BANK_ID_COMAPANY_DETAILS_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_bank_id\"]");
    public static final By STATE_ENTERPRISE_REGISTRY_ID_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_state_enterprise_registry_id\"]");
    public static final By CONTRACT_SIGNEE_NAME_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_name\"]");
    public static final By CONTRACT_SIGNEE_POSITION_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_position\"]");
    public static final By CONTRACT_SIGNEE_BASIS_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_basis\"]");
    public static final By CONTRACT_SIGNEE_FULL_NAME_FIELD = By.xpath("//*[@id=\"merchant_representative_company_details_contract_signee_tab_full_name\"]");
    public static final By CONTRACT_SIGNEE_POSITION_FIELD_1 = By.xpath(" //*[@id=\"merchant_representative_company_details_contract_signee_tab_postion\"]");
    public static final By CONTRACT_SIGNEE_MOBILE_NUMBER_FIELD = By.xpath(" //*[@id=\"merchant_representative_company_details_contract_signee_tab_mobile\"]");
    public static final By SIGNEE_PASSPORT_SCAN_BUTTON = By.xpath(" //*[@id=\"signeePassportScan\"]");
    public static final By SIGNEE_TAX_ID_SCAN_BUTTON = By.xpath(" //*[@id=\"signeeTaxIdScan\"]");
    public static final By SIGNEE_AUTHORIZING_SCAN_BUTTON = By.xpath(" //*[@id=\"signeeAuthorScan\"]");
    public static final By NEXT_BUTTON = By.xpath("//*[@id=\"regRepDetailNext\"]");
    public static final By NEXT_BUTTON_2 = By.xpath("//*[@id=\"representativeDataForm\"]//button[@name='regRepDetailNext']");
    public static final By NEXT_BUTTON_3 = By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[4]/form//p//button[@translate='general_button_next']");
    public static final By NUMBER_OF_WORKING_DAYS_FOR_FUNDS_IN_BANK_FIELD = By.xpath("//*[@placeholder=\"Number of working days for funds will be available in bank after fund-out\"]");
    public static final By MERCHANT_API_FIELD = By.xpath("//*[@id=\"apiUrl\"]");
    public static final By FEE_FOR_REFUND_FIELD = By.xpath("//*[@placeholder=\"Fee for refund\"]");
    public static final By TURN_OVER_OVER_LAST_YEAR_FIELD = By.xpath("//*[@placeholder=\"Turnover over the last business year, UAH\"]");
    public static final By TEST_SERVER_IP_FIELD = By.xpath("//*[@placeholder=\"Test server IP\"]");
    public static final By TEST_SERVER_PORT_FIELD = By.xpath("//*[@placeholder=\"Test server port\"]");
    public static final By TEST_PRODUCTION_SERVER_IP_FIELD = By.xpath("//*[@placeholder=\"Production server IP\"]");
    public static final By TEST_PRODUCTION_SERVER_PORT_FIELD = By.xpath("//*[@placeholder=\"Production server port\"]");
    public static final By BANK_DETAIL_RECIPIENT_NAME_FIELD_0 = By.xpath("//*[@id=\"bankDetailRecipientNamebd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_ID_FIELD_0 = By.xpath("//*[@id=\"bankDetailRecipientIdbd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_0 = By.xpath("//*[@id=\"bankDetailAccountNumberbd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_0 = By.xpath("//*[@id=\"bankDetailBankCodebd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_0 = By.xpath("//*[@id=\"bankDetailBankNamebd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_0 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd0\"]");
    public static final By BANK_DETAIL_RECIPIENT_NAME_FIELD_1 = By.xpath("//*[@id=\"bankDetailRecipientNamebd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_ID_FIELD_1 = By.xpath("//*[@id=\"bankDetailRecipientIdbd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_1 = By.xpath("//*[@id=\"bankDetailAccountNumberbd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_1 = By.xpath("//*[@id=\"bankDetailBankCodebd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_1 = By.xpath("//*[@id=\"bankDetailBankNamebd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_1 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd1\"]");
    public static final By BANK_DETAIL_RECIPIENT_NAME_FIELD_2 = By.xpath("//*[@id=\"bankDetailRecipientNamebd2\"]");
    public static final By BANK_DETAIL_RECIPIENT_ID_FIELD_2 = By.xpath("//*[@id=\"bankDetailRecipientIdbd2\"]");
    public static final By BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_2 = By.xpath("//*[@id=\"bankDetailAccountNumberbd2\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_2 = By.xpath("//*[@id=\"bankDetailBankCodebd2\"]");
    public static final By BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_2 = By.xpath("//*[@id=\"bankDetailBankNamebd2\"]");
    public static final By BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_2 = By.xpath("//*[@id=\"bankDetailPaymentPurposebd2\"]");
    public static final By PAYMENT_PURPOSE_FIELD = By.xpath("//*[@id=\"bankDetailPaymentPurposeepr\"]");
    public static final By SAVE_BUTTON = By.xpath("//*[@id=\"regMerchSave\"]");
    private static final By MERCHANT_ID = By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[7]/div/form/merch-general-information/div[2]/div[1]/div/label");

    public WebElement getMerchantId() {
        WebElement id = driver.findElement(MERCHANT_ID);
        id.click();
        id.getAttribute("innerHTML");
        return id;
    }

    public void merchantLocator() {
        WebElement merchantField = driver.findElement(MERCHANTS_FIELD);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", merchantField);
    }

    public void createMerchantLocator() {
        WebElement createmerchantField = driver.findElement(CREATE_MERCHANT_FIELD);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createmerchantField);
    }

    public void merchnatTypeDropboxLocator() {
        Select dropboxMerchant = new Select(driver.findElement(MERCHANT_TYPE_DROPBOX));
        dropboxMerchant.selectByVisibleText("Merchant");

    }

    public void merchantTypeMerchantLocator() {
//        WebElement merchant = driver.findElement(MERCHANT_TYPE_MERCHANT_FIELD);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments.click();", merchant);
    }

    public void fullnameLocator() {
        WebElement fullname = driver.findElement(FULL_NAME_FIELD);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", fullname);
        fullname.clear();
        fullname.sendKeys(RANDOM_ALPHABETIC);
    }

    public void shortNameLocator() {
        WebElement shortname = driver.findElement(SHORT_NAME_FIELD);
        shortname.click();
        shortname.clear();
        shortname.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setTradeNameOrganizationField() {
        WebElement tradeName = driver.findElement(TRADE_NAME_ORGANIZATION_FIELD);
        tradeName.click();
        tradeName.clear();
        tradeName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setOrganizationForm() {
        WebElement organization = driver.findElement(ORGANIZATION_FORM_FIELD);
        organization.click();
        organization.clear();
        organization.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBusinessEntityDropbox() {
        driver.findElement(BUSINESS_ENTITY_DROPBOX).click();
    }

    public void setBusinessEntityTypePrivateField() {
        driver.findElement(BUSINESS_ENTITY_TYPE_PRIVATE_FIELD).click();
    }

    public void setBusinessEntityTypeLegalField() {
        driver.findElement(BUSINESS_ENTITY_TYPE_LEGALFIELD).click();
    }

    public void setListOfMerchantsPointsOfSaleCreateNewPointOfSaleButton() {
        driver.findElement(LIST_OF_MERCHANTS_POINTS_OF_SALE_CREATE_NEW_POINT_OF_SALE_BUTTON).click();
    }

    public void setPosName() {
        WebElement pos = driver.findElement(NEW_POSNAME_FIELD);
        pos.click();
        pos.clear();
        pos.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPosAddress() {
        WebElement posAddre = driver.findElement(NEW_POSADDRESS_FIELD);
        posAddre.click();
        posAddre.clear();
        posAddre.sendKeys(RANDOM_ALPHABETIC);
    }

    public void addpos() {
        driver.findElement(ADD_POSBUTTON).click();
    }

    public void setListOfregionswhereMerchantOperatesDropdown() {
        driver.findElement(LIST_OF_REGIONS_WHERE_MERCHANT_OPERATES_DROPDOWN).click();
    }

    public void setListOfRegionsVinnytskaobl() {
        driver.findElement(LIST_OF_REGIONS_VINNYTSKAOBL).click();
    }

    public void setLegalAddress() {
        WebElement legalAdre = driver.findElement(LEGAL_ADDRESS_FILED);
        legalAdre.click();
        legalAdre.clear();
        legalAdre.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setActualAddressFiled() {
        WebElement actualAdd = driver.findElement(ACTUAL_ADDRESS__FILED);
        actualAdd.click();
        ;
        actualAdd.clear();
        actualAdd.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setCorrespondenceAddress() {
        WebElement correspondenceAdd = driver.findElement(CORRESPONDENCE_ADDRESS_FILED);
        correspondenceAdd.click();
        correspondenceAdd.clear();
        correspondenceAdd.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPhoneNumberField() {
        WebElement phone = driver.findElement(PHONE_NUMBER_FIELD);
        phone.click();
        phone.clear();
        phone.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setContactEmail() {
        WebElement email = driver.findElement(CONTACT_EMAIL_FIELD);
        email.click();
        email.clear();
        email.sendKeys(RandomValues.GENERATE_EMAIL(20));
    }

    public void setContactWebsite() {
        WebElement web = driver.findElement(CONTACT_WEB_SITE_FIELD);
        web.click();
        web.clear();
        web.sendKeys(RandomValues.GENERATE_URL(10));
    }

    public void setContactCallCenterNumberField() {
        WebElement callCenter = driver.findElement(CONTACT_CALL_CENTER_NUMBER_FIELD);
        callCenter.click();
        callCenter.clear();
        callCenter.sendKeys(RANDOM_NUMBER);
    }

    public void setNotificationChannelSmsField() {
        WebElement sms = driver.findElement(NOTIFICATION_CHANNEL_SMS_FIELD);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(NOTIFICATION_CHANNEL_SMS_FIELD));
        if (sms.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", sms);
        } else {
            System.out.println("Radio button SMS wasn't clickable");
        }
    }

    public void setNotificationChannelEmailField() {
        driver.findElement(NOTIFICATION_CHANNEL_EMAIL_FIELD).click();
    }

    public void setNextButtonCompany() {
        WebElement nextButton1 = driver.findElement(NEXT_BUTTON_COMPANY);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(NEXT_BUTTON_COMPANY));
        if (nextButton1.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton1);
        } else {
            System.out.println("Next button was disabled");
        }
    }

    public void setIDOfMerchantContractWithAgentForSettlement0Field() {
        WebElement merchantContractWithSettlement = driver.findElement(ID_OF_MERCHANT_CONTRACT_WITH_AGENT_FOR_SETTLEMENT_0_FIELD);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", merchantContractWithSettlement);
        merchantContractWithSettlement.sendKeys(RANDOM_NUMBER);
    }

    public void setDateofMerchantContractWithAgentDate0Picker() {
        WebElement dateWidget = driver.findElement(DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_0_PICKER);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget);
        dateWidget.sendKeys(CALENDAR_DATE);
    }

    public void setAgreementContractScan0Button() {
        WebElement contractWithAgent = driver.findElement(AGREEMENT_CONTRACT_SCAN_0_BUTTON);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(AGREEMENT_CONTRACT_SCAN_0_BUTTON));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", contractWithAgent);
        contractWithAgent.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement1Field() {
        WebElement merchantContractWithSettlement1 = driver.findElement(ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_1_FIELD);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", merchantContractWithSettlement1);
        merchantContractWithSettlement1.sendKeys(RANDOM_NUMBER);
    }

    public void setDateofMerchantContractWithAgentDate1Picker() {
        WebElement dateWidget1 = driver.findElement(DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_1_PICKER);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget1);
        dateWidget1.sendKeys(CALENDAR_DATE);
    }

    public void setAgreementContractScan1Button() {
        WebElement contractWithAgent1 = driver.findElement(AGREEMENT_CONTRACT_SCAN_1_BUTTON);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", contractWithAgent1);
        contractWithAgent1.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement2Field() {
        WebElement merchantContractWithSettlement2 = driver.findElement(ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_2_FIELD);
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", merchantContractWithSettlement2);
        merchantContractWithSettlement2.sendKeys(RANDOM_NUMBER);
    }

    public void setDateofMerchantContractWithAgentDate2Picker() {
        WebElement dateWidget2 = driver.findElement(DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_2_PICKER);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget2);
        dateWidget2.sendKeys(CALENDAR_DATE);
    }

    public void setAgreementContractScan2Button() {
        WebElement contractWithAgent2 = driver.findElement(AGREEMENT_CONTRACT_SCAN_2_BUTTON);
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", contractWithAgent2);
        contractWithAgent2.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement3Field() {
        WebElement merchantContractWithSettlement3 = driver.findElement(ID_OF_MERCHANT_CONTRAC_TWITH_AGENT_FOR_SETTLEMENT_3_FIELD);
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", merchantContractWithSettlement3);
        merchantContractWithSettlement3.sendKeys(RANDOM_NUMBER);
    }

    public void setDateofMerchantContractWithAgentDate3Picker() {
        WebElement dateWidget3 = driver.findElement(DATE_OF_MERCHANT_CONTRACT_WITH_AGENT_DATE_3_PICKER);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget3);
        dateWidget3.sendKeys(CALENDAR_DATE);
    }

    public void setAgreementContractScan3Button() {
        WebElement contractWithAgent3 = driver.findElement(AGREEMENT_CONTRACT_SCAN_3_BUTTON);
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", contractWithAgent3);
        contractWithAgent3.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setScanCopyOfStatueButton() {
        WebElement scanStatue = driver.findElement(SCAN_COPY_OF_STATUE_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanStatue);
        scanStatue.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setScanCopyOfTaxIdButton() {
        WebElement scanTax = driver.findElement(SCAN_COPY_OF_TAX_ID_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanTax);
        scanTax.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setScanStatementOfCsrButton() {
        WebElement scanCsr = driver.findElement(SCAN_STATEMENT_OF_CSR_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanCsr);
        scanCsr.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setScanStatementExtractFromCsrButton() {
        WebElement scanCsrExtr = driver.findElement(SCAN_STATEMENT_EXTRACT_FROM_CSR_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanCsrExtr);
        scanCsrExtr.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setScanStatementQuestionnareButton() {
        WebElement scanQuestionnare = driver.findElement(SCAN_STATEMENT_QUESTIONNARE_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanQuestionnare);
        scanQuestionnare.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setNextButton1() {
        WebElement nextButton1 = driver.findElement(NEXT_BUTTON);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton1));
        if (nextButton1.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton1);
        } else
            System.out.println("Next button1 was disabled");
    }

    public void setFullNameContactField() {
        WebElement fullNameDirector = driver.findElement(FULL_NAME_CONTACT_FIELD);
        fullNameDirector.click();
        fullNameDirector.clear();
        fullNameDirector.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPositionContactField() {
        WebElement position = driver.findElement(POSITION_CONTACT_FIELD);
        position.click();
        position.clear();
        position.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setCountryOfResidence() {
        WebElement country = driver.findElement(COUNTRY_OF_RESIDENCE);
        country.click();
        country.clear();
        country.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setMobileNumberContactField() {
        WebElement phone = driver.findElement(MOBILE_NUMBER_CONTACT_FIELD);
        phone.click();
        phone.clear();
        phone.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setWorkEmailContactField() {
        WebElement email = driver.findElement(WORK_EMAIL_CONTACT_FIELD);
        email.click();
        email.clear();
        email.sendKeys(RandomValues.GENERATE_EMAIL(15));
    }

    public void setAccountFullNameContactField() {
        WebElement accName = driver.findElement(ACCOUNT_FULL_NAME_CONTACT_FIELD);
        accName.click();
        accName.clear();
        accName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setAccountPositionContactField() {
        WebElement accPosition = driver.findElement(ACCOUNT_POSITION_CONTACT_FIELD);
        accPosition.click();
        accPosition.clear();
        accPosition.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setAccountCountryOfResidence() {
        WebElement accCountry = driver.findElement(ACCOUNT_COUNTRY_OF_RESIDENCE);
        accCountry.click();
        accCountry.clear();
        accCountry.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setAccountMobileNumberContactField() {
        WebElement accPhone = driver.findElement(ACCOUNT_MOBILE_NUMBER_CONTACT_FIELD);
        accPhone.click();
        accPhone.clear();
        accPhone.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setAccountWorkEmailContactField() {
        WebElement accEmail = driver.findElement(ACCOUNT_WORK_EMAIL_CONTACT_FIELD);
        accEmail.click();
        accEmail.clear();
        accEmail.sendKeys(RandomValues.GENERATE_EMAIL(15));
    }

    public void setOperationFullNameContactField() {
        WebElement operationName = driver.findElement(OPERATION_FULL_NAME_CONTACT_FIELD);
        operationName.click();
        operationName.clear();
        operationName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setOperationPositionContactField() {
        WebElement operationPosition = driver.findElement(OPERATION_POSITION_CONTACT_FIELD);
        operationPosition.click();
        operationPosition.clear();
        operationPosition.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setOperationMobileNumberContactField() {
        WebElement operatioNmobile = driver.findElement(OPERATION_MOBILE_NUMBER_CONTACT_FIELD);
        operatioNmobile.click();
        operatioNmobile.clear();
        operatioNmobile.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setOperationWorkEmailContactField() {
        WebElement operationEmail = driver.findElement(OPERATION_WORK_EMAIL_CONTACT_FIELD);
        operationEmail.click();
        operationEmail.clear();
        operationEmail.sendKeys(RandomValues.GENERATE_EMAIL(15));
    }

    public void setFullNameContactITField() {
        WebElement itName = driver.findElement(FULL_NAME_CONTACT_IT_FIELD);
        itName.click();
        itName.clear();
        itName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPositionContactITField() {
        WebElement itPosition = driver.findElement(POSITION_CONTACT_IT_FIELD);
        itPosition.click();
        itPosition.clear();
        itPosition.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setMobileNumberContactITField() {
        WebElement mobileIt = driver.findElement(MOBILE_NUMBER_CONTACT_IT_FIELD);
        mobileIt.click();
        mobileIt.clear();
        mobileIt.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setWorkEmailContactITField() {
        WebElement emailIt = driver.findElement(WORK_EMAIL_CONTACT_IT_FIELD);
        emailIt.click();
        emailIt.clear();
        emailIt.sendKeys(RandomValues.GENERATE_EMAIL(15));
    }

    public void setFullNameContactFinField() {
        WebElement finName = driver.findElement(FULL_NAME_CONTACT_FIN_FIELD);
        finName.click();
        finName.clear();
        finName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPositionContactFinField() {
        WebElement finPosition = driver.findElement(POSITION_CONTACT_FIN_FIELD);
        finPosition.click();
        finPosition.clear();
        finPosition.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setMobileNumberContactFinField() {
        WebElement finPhone = driver.findElement(MOBILE_NUMBER_CONTACT_FIN_FIELD);
        finPhone.click();
        finPhone.clear();
        finPhone.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setWorkEmailContactFinField() {
        WebElement finEmail = driver.findElement(WORK_EMAIL_CONTACT_FIN_FIELD);
        finEmail.click();
        finEmail.clear();
        finEmail.sendKeys(RandomValues.GENERATE_EMAIL(15));
    }

    public void setAccountNoCompanyDetailsField() {
        WebElement accountNo = driver.findElement(ACCOUNT_NO_COMPANY_DETAILS_FIELD);
        accountNo.click();
        accountNo.clear();
        accountNo.sendKeys(RANDOM_NUMBER);
    }

    public void setBankNameCompanyDetailsField() {
        WebElement bankName = driver.findElement(BANK_NAME_COMPANY_DETAILS_FIELD);
        bankName.click();
        bankName.clear();
        bankName.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankIdComapnyDetailsField() {
        WebElement bankId = driver.findElement(BANK_ID_COMAPANY_DETAILS_FIELD);
        bankId.click();
        bankId.clear();
        bankId.sendKeys(RANDOM_NUMBER);
    }

    public void setStateEnterpriseRegistryIdField() {
        WebElement stateEnterprise = driver.findElement(STATE_ENTERPRISE_REGISTRY_ID_FIELD);
        stateEnterprise.click();
        stateEnterprise.clear();
        stateEnterprise.sendKeys(RANDOM_NUMBER);
    }

    public void setContractSigneeNameField() {
        WebElement signee = driver.findElement(CONTRACT_SIGNEE_NAME_FIELD);
        signee.click();
        signee.clear();
        signee.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setContractSigneePositionField() {
        WebElement signeePosition = driver.findElement(CONTRACT_SIGNEE_POSITION_FIELD);
        signeePosition.click();
        signeePosition.clear();
        signeePosition.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setContractSigneeBasisField() {
        WebElement signeeBasis = driver.findElement(CONTRACT_SIGNEE_BASIS_FIELD);
        signeeBasis.click();
        signeeBasis.clear();
        signeeBasis.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setContractSigneeFullnameField() {
        WebElement contractFullname = driver.findElement(CONTRACT_SIGNEE_FULL_NAME_FIELD);
        contractFullname.click();
        contractFullname.clear();
        contractFullname.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setContractSigneePositionField1() {
        WebElement position1 = driver.findElement(CONTRACT_SIGNEE_POSITION_FIELD_1);
        position1.click();
        position1.clear();
        position1.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setContractSigneeMobileNumberField() {
        WebElement mobileSignee = driver.findElement(CONTRACT_SIGNEE_MOBILE_NUMBER_FIELD);
        mobileSignee.click();
        mobileSignee.clear();
        mobileSignee.sendKeys(RANDOM_NUMBER_MSISDN);
    }

    public void setSigneePassportScanButton() {
        WebElement signeePassport = driver.findElement(SIGNEE_PASSPORT_SCAN_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeePassport);
        signeePassport.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setSigneeTaxIdScanButton() {
        WebElement signeeTax = driver.findElement(SIGNEE_TAX_ID_SCAN_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeeTax);
        signeeTax.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setSigneeAuthorizingScanButton() {
        WebElement signeeAuthorize = driver.findElement(SIGNEE_AUTHORIZING_SCAN_BUTTON);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeeAuthorize);
        signeeAuthorize.sendKeys("C:\\Users\\ilona\\Desktop\\test.png");
    }

    public void setNextButton2() {
        WebElement nextButton2 = driver.findElement(NEXT_BUTTON_2);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton2));
        if (nextButton2.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton2);
        } else
            System.out.println("Next button2 was disabled");
    }

    public void setNumberOfWorkingDaysForFundsInbankField() {
        WebElement numberOfDays = driver.findElement(NUMBER_OF_WORKING_DAYS_FOR_FUNDS_IN_BANK_FIELD);
        numberOfDays.click();
        numberOfDays.clear();
        numberOfDays.sendKeys(DAYS_FOR_REFUND);
    }

    public void setMerchantApiField() {
        WebElement merchantApi = driver.findElement(MERCHANT_API_FIELD);
        merchantApi.click();
        merchantApi.clear();
        merchantApi.sendKeys(RandomValues.GENERATE_URL(15));
    }

    public void setFeeForRefundField() {
        WebElement feerefund = driver.findElement(FEE_FOR_REFUND_FIELD);
        feerefund.click();
        feerefund.clear();
        feerefund.sendKeys(DAYS_FOR_REFUND);
    }

    public void setTurnoverOverLastYearField() {
        WebElement turnOver = driver.findElement(TURN_OVER_OVER_LAST_YEAR_FIELD);
        turnOver.click();
        turnOver.clear();
        turnOver.sendKeys(RANDOM_NUMBER);
    }

    public void setTestServerIpField() {
        WebElement serverIP = driver.findElement(TEST_SERVER_IP_FIELD);
        serverIP.click();
        serverIP.clear();
        serverIP.sendKeys(RANDOM_NUMBER);
    }

    public void setTestServerPortField() {
        WebElement serverPort = driver.findElement(TEST_SERVER_PORT_FIELD);
        serverPort.click();
        serverPort.clear();
        serverPort.sendKeys(RANDOM_NUMBER);
    }

    public void setTestProductionServerIpField() {
        WebElement productionIP = driver.findElement(TEST_PRODUCTION_SERVER_IP_FIELD);
        productionIP.click();
        productionIP.clear();
        productionIP.sendKeys(RANDOM_NUMBER);
    }

    public void setTestProductionServerPortField() {
        WebElement productionPort = driver.findElement(TEST_PRODUCTION_SERVER_PORT_FIELD);
        productionPort.click();
        productionPort.clear();
        productionPort.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientNameField0() {
        WebElement nameB = driver.findElement(BANK_DETAIL_RECIPIENT_NAME_FIELD_0);
        nameB.click();
        nameB.clear();
        nameB.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientIdField0() {
        WebElement recipientId = driver.findElement(BANK_DETAIL_RECIPIENT_ID_FIELD_0);
        recipientId.click();
        recipientId.clear();
        recipientId.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientAccountNoField0() {
        WebElement accountB = driver.findElement(BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_0);
        accountB.click();
        accountB.clear();
        accountB.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankCodeField0() {
        WebElement bankCode = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_0);
        bankCode.click();
        bankCode.clear();
        bankCode.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankNameField0() {
        WebElement bankName0 = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_0);
        bankName0.click();
        bankName0.clear();
        bankName0.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientPaymentPurposeField0() {
        WebElement purpose0 = driver.findElement(BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_0);
        purpose0.click();
        purpose0.clear();
        purpose0.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientNameField1() {
        WebElement name1 = driver.findElement(BANK_DETAIL_RECIPIENT_NAME_FIELD_1);
        name1.click();
        name1.clear();
        name1.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientIdField1() {
        WebElement id1 = driver.findElement(BANK_DETAIL_RECIPIENT_ID_FIELD_1);
        id1.click();
        id1.clear();
        id1.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientAccountNoField1() {
        WebElement accountNumber = driver.findElement(BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_1);
        accountNumber.click();
        accountNumber.clear();
        accountNumber.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankCodeField1() {
        WebElement bankCode1 = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_1);
        bankCode1.click();
        bankCode1.clear();
        bankCode1.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankNameField1() {
        WebElement bankname1 = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_1);
        bankname1.click();
        bankname1.clear();
        bankname1.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientPaymentPurposeField1() {
        WebElement bankPurpose1 = driver.findElement(BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_1);
        bankPurpose1.click();
        bankPurpose1.clear();
        bankPurpose1.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientNameField2() {
        WebElement name2 = driver.findElement(BANK_DETAIL_RECIPIENT_NAME_FIELD_2);
        name2.click();
        name2.clear();
        name2.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setBankdetailRecipientIdField2() {
        WebElement recipient2 = driver.findElement(BANK_DETAIL_RECIPIENT_ID_FIELD_2);
        recipient2.click();
        recipient2.clear();
        recipient2.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientAccountNoField2() {
        WebElement accountN2 = driver.findElement(BANK_DETAIL_RECIPIENT_ACCOUNT_NO_FIELD_2);
        accountN2.click();
        accountN2.clear();
        accountN2.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankCodeField2() {
        WebElement bankCode2 = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_CODE_FIELD_2);
        bankCode2.click();
        bankCode2.clear();
        bankCode2.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientBankNameField2() {
        WebElement bankname = driver.findElement(BANK_DETAIL_RECIPIENT_BANK_NAME_FIELD_2);
        bankname.click();
        bankname.clear();
        bankname.sendKeys(RANDOM_NUMBER);
    }

    public void setBankdetailRecipientPaymentPurposeField2() {
        WebElement paymentPurpose2 = driver.findElement(BANK_DETAIL_RECIPIENT_PAYMENT_PURPOSE_FIELD_2);
        paymentPurpose2.click();
        paymentPurpose2.clear();
        paymentPurpose2.sendKeys(RANDOM_ALPHABETIC);
    }

    public void setPaymentPurposeField() {
        WebElement paymentPurpose = driver.findElement(PAYMENT_PURPOSE_FIELD);
        paymentPurpose.click();
        paymentPurpose.clear();
        paymentPurpose.sendKeys(RANDOM_ALPHABETIC);
    }


    public void setNextButton3() {
        WebElement nextButton3 = driver.findElement(NEXT_BUTTON_3);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton3));
        if (nextButton3.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton3);
        } else
            System.out.println("Next button2 was disabled");
    }

    public void setSaveButton() {
        WebElement savebutton = driver.findElement(SAVE_BUTTON);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(savebutton));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(("arguments[0].click();"), savebutton);
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
        setIDOfMerchantContractWithAgentForSettlement1Field();
        setDateofMerchantContractWithAgentDate1Picker();
        setAgreementContractScan1Button();
        setIDOfMerchantContractWithAgentForSettlement2Field();
        setDateofMerchantContractWithAgentDate2Picker();
        setAgreementContractScan2Button();
        setAgreementContractScan2Button();
        setIDOfMerchantContractWithAgentForSettlement3Field();
        setDateofMerchantContractWithAgentDate3Picker();
        setAgreementContractScan3Button();
        setScanCopyOfStatueButton();
        setScanCopyOfTaxIdButton();
        setScanStatementOfCsrButton();
        setScanStatementExtractFromCsrButton();
        setScanStatementQuestionnareButton();
        setNextButton1();
        setFullNameContactField();
        setPositionContactField();
        setCountryOfResidence();
        setMobileNumberContactField();
        setWorkEmailContactField();
        setAccountFullNameContactField();
        setAccountPositionContactField();
        setAccountCountryOfResidence();
        setAccountMobileNumberContactField();
        setAccountWorkEmailContactField();
        setOperationFullNameContactField();
        setOperationPositionContactField();
        setOperationMobileNumberContactField();
        setOperationWorkEmailContactField();
        setFullNameContactITField();
        setPositionContactITField();
        setMobileNumberContactITField();
        setWorkEmailContactITField();
        setFullNameContactFinField();
        setPositionContactFinField();
        setMobileNumberContactFinField();
        setWorkEmailContactFinField();
        setAccountNoCompanyDetailsField();
        setBankNameCompanyDetailsField();
        setBankIdComapnyDetailsField();
        setStateEnterpriseRegistryIdField();
        setContractSigneeNameField();
        setContractSigneePositionField();
        setContractSigneeBasisField();
        setContractSigneeFullnameField();
        setContractSigneePositionField1();
        setContractSigneeMobileNumberField();
        setSigneePassportScanButton();
        setSigneeTaxIdScanButton();
        setSigneeAuthorizingScanButton();
        setNextButton2();
        setNumberOfWorkingDaysForFundsInbankField();
        setMerchantApiField();
        setFeeForRefundField();
        setTurnoverOverLastYearField();
        setTestServerIpField();
        setTestServerPortField();
        setTestProductionServerIpField();
        setTestProductionServerPortField();
        setBankdetailRecipientNameField0();
        setBankdetailRecipientIdField0();
        setBankdetailRecipientAccountNoField0();
        setBankdetailRecipientBankCodeField0();
        setBankdetailRecipientBankNameField0();
        setBankdetailRecipientPaymentPurposeField0();
        setBankdetailRecipientNameField1();
        setBankdetailRecipientIdField1();
        setBankdetailRecipientAccountNoField1();
        setBankdetailRecipientBankCodeField1();
        setBankdetailRecipientBankNameField1();
        setBankdetailRecipientPaymentPurposeField1();
        setBankdetailRecipientNameField2();
        setBankdetailRecipientBankNameField2();
        setBankdetailRecipientIdField2();
        setBankdetailRecipientAccountNoField2();
        setBankdetailRecipientBankCodeField2();
        setBankdetailRecipientBankNameField2();
        setBankdetailRecipientPaymentPurposeField2();
        setPaymentPurposeField();
        setNextButton3();
        setSaveButton();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }

}
