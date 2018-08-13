import com.gargoylesoftware.htmlunit.MockWebConnection;
import javafx.scene.web.WebErrorEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mWallet extends RandomValues {

    private WebDriver driver;

    public mWallet(WebDriver driver) {
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
    By nextButtonCompany = By.xpath("//*[@id=\"companyDetailsFormNext\"]");
    By IDOfMerchantContractWithAgentForSettlement0Field = By.xpath("//*[@id=\"agreementContractId0\"]");
    By dateofMerchantContractWithAgentDate0Picker = By.xpath(" //*[@name=\"contractDate0\"]");
    By agreementContractScan0Button = By.xpath("//*[@id=\"agreementContractScan0\"]");
    By IDOfMerchantContractWithAgentForSettlement1Field = By.xpath("//*[@id=\"agreementContractId1\"]");
    By dateofMerchantContractWithAgentDate1Picker = By.xpath(" //*[@id=\"contractDate1\"]");
    By agreementContractScan1Button = By.xpath("//*[@id=\"agreementContractScan1\"]");
    By IDOfMerchantContractWithAgentForSettlement2Field = By.xpath("//*[@id=\"agreementContractId2\"]");
    By dateofMerchantContractWithAgentDate2Picker = By.xpath(" //*[@id=\"contractDate2\"]");
    By agreementContractScan2Button = By.xpath("//*[@id=\"agreementContractScan2\"]");
    By IDOfMerchantContractWithAgentForSettlement3Field = By.xpath("//*[@id=\"agreementContractId3\"]");
    By dateofMerchantContractWithAgentDate3Picker = By.xpath(" //*[@id=\"contractDate3\"]");
    By agreementContractScan3Button = By.xpath("//*[@id=\"agreementContractScan3\"]");
    By scanCopyOfStatueButton = By.xpath("//*[@id=\"agreementOtherDocumentStatuteScan\"]");
    By scanCopyOfTaxIdButton = By.xpath("//*[@id=\"agreementOtherDocumentTaxCertificateScan\"]");
    By scanStatementOfCsrButton = By.xpath("//*[@id=\"agreementOtherDocumentStatementFromCsrScan\"]");
    By scanStatementExtractFromCsrButton = By.xpath("//*[@id=\"agreementOtherDocumentExtractFromCsrScan\"]");
    By scanStatementQuestionnareButton = By.xpath("//*[@id=\"agreementOtherDocumentQuestionnaireScan\"]");
    By fullNameContactField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_director\"]");
    By positionContactField = By.xpath(" //*[@id=\"positionmerchant_representative_data_director\"]");
    By countryOfResidence = By.xpath("//*[@id=\"countryOfResidencemerchant_representative_data_director\"]");
    By mobileNumberContactField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_director\"]");
    By workEmailContactField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_director\"]");
    By accountFullNameContactField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_chief_accountant\"]");
    By accountPositionContactField = By.xpath(" //*[@id=\"positionmerchant_representative_data_chief_accountant\"]");
    By accountCountryOfResidence = By.xpath("//*[@id=\"countryOfResidencemerchant_representative_data_chief_accountant\"]");
    By accountMobileNumberContactField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_chief_accountant\"]");
    By accountWorkEmailContactField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_chief_accountant\"]");
    By operationFullNameContactField = By.xpath(" //*[@id=\"fullNamemerchant_representative_data_contact_operational_issues\"]");
    By operationPositionContactField = By.xpath(" //*[@id=\"positionmerchant_representative_data_contact_operational_issues\"]");
    By operationMobileNumberContactField = By.xpath(" //*[@id=\"mobileNumbermerchant_representative_data_contact_operational_issues\"]");
    By operationWorkEmailContactField = By.xpath(" //*[@id=\"workEmailmerchant_representative_data_contact_operational_issues\"]");
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
    By signeeTaxIdScanButton = By.xpath(" //*[@id=\"signeeTaxIdScan\"]");
    By signeeAuthorizingScanButton = By.xpath(" //*[@id=\"signeeAuthorScan\"]");
    By NextButton = By.xpath("//*[@id=\"regRepDetailNext\"]");
    By NextButton2 = By.xpath("//*[@id=\"representativeDataForm\"]//button[@name='regRepDetailNext']");
    By NextButton3 = By.xpath("//*[@id=\"content\"]/div[4]/div/div/section[4]/form//p//button[@translate='general_button_next']");
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


    public void useridLocator(String userIdName) {
        WebElement userL = driver.findElement(userIdFiled);
        userL.click();
        userL.clear();
        userL.sendKeys(userIdName);
    }

    public void passwordLocator(String passwordName) {
        WebElement passwordL = driver.findElement(passwordField);
        passwordL.click();
        passwordL.clear();
        passwordL.sendKeys(passwordName);
    }

    public void signInButton() {
        driver.findElement(signIn).click();
    }

    public void signIn() {
        useridLocator(userIdName);
        passwordLocator(passwordName);
        signInButton();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleIs("Back Office Portal"));
    }

    public void merchantLocator() {
        WebElement merchantField = driver.findElement(merchantsField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", merchantField);
    }

    public void createMerchantLocator() {
        WebElement createmerchantField = driver.findElement(createMerchantField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createmerchantField);
    }

    public void merchnatTypeDropboxLocator() {
        driver.findElement(merchantTypeDropbox).click();
    }

    public void merchantTypeMerchantLocator() {
        driver.findElement(merchantTypeMerchantField).click();
    }

    public void fullnameLocator() {
        WebElement fullname = driver.findElement(fullnameField);
        fullname.click();
        fullname.clear();
        fullname.sendKeys(randomAlphabetic);
    }

    public void shortNameLocator() {
        WebElement shortname = driver.findElement(shortNameField);
        shortname.click();
        shortname.clear();
        shortname.sendKeys(randomAlphabetic);
    }

    public void setTradeNameOrganizationField() {
        WebElement tradeName = driver.findElement(tradeNameOrganizationField);
        tradeName.click();
        tradeName.clear();
        tradeName.sendKeys(randomAlphabetic);
    }

    public void setOrganizationForm() {
        WebElement organization = driver.findElement(organizationFormField);
        organization.click();
        organization.clear();
        organization.sendKeys(randomAlphabetic);
    }

    public void setBusinessEntityDropbox() {
        driver.findElement(businessEntityDropbox).click();
    }

    public void setBusinessEntityTypePrivateField() {
        driver.findElement(businessEntityTypePrivateField).click();
    }

    public void setBusinessEntityTypeLegalField() {
        driver.findElement(businessEntityTypeLegalField).click();
    }

    public void setListOfMerchantsPointsOfSaleCreateNewPointOfSaleButton() {
        driver.findElement(listOfMerchantsPointsOfSaleCreateNewPointOfSaleButton).click();
    }

    public void setPosName() {
        WebElement pos = driver.findElement(newPosNameField);
        pos.click();
        pos.clear();
        pos.sendKeys(randomAlphabetic);
    }

    public void setPosAddress() {
        WebElement posAddre = driver.findElement(newPosAddressField);
        posAddre.click();
        posAddre.clear();
        posAddre.sendKeys(randomAlphabetic);
    }

    public void addpos() {
        driver.findElement(addPosButton).click();
    }

    public void setListOfregionswhereMerchantOperatesDropdown() {
        driver.findElement(listOfregionswhereMerchantOperatesDropdown).click();
    }

    public void setListOfRegionsVinnytskaobl() {
        driver.findElement(listOfRegionsVinnytskaobl).click();
    }

    public void setLegalAddress() {
        WebElement legalAdre = driver.findElement(legalAddressFiled);
        legalAdre.click();
        legalAdre.clear();
        legalAdre.sendKeys(randomAlphabetic);
    }

    public void setActualAddressFiled() {
        WebElement actualAdd = driver.findElement(actualAddressFiled);
        actualAdd.click();
        ;
        actualAdd.clear();
        actualAdd.sendKeys(randomAlphabetic);
    }

    public void setCorrespondenceAddress() {
        WebElement correspondenceAdd = driver.findElement(correspondenceAddressFiled);
        correspondenceAdd.click();
        correspondenceAdd.clear();
        correspondenceAdd.sendKeys(randomAlphabetic);
    }

    public void setPhoneNumberField() {
        WebElement phone = driver.findElement(phoneNumberField);
        phone.click();
        phone.clear();
        phone.sendKeys(randomNumberMSISDN);
    }

    public void setContactEmail() {
        WebElement email = driver.findElement(contactEmailField);
        email.click();
        email.clear();
        email.sendKeys(generateEmail(20));
    }

    public void setContactWebsite() {
        WebElement web = driver.findElement(contactWebsiteField);
        web.click();
        web.clear();
        web.sendKeys(generateUrl(10));
    }

    public void setContactCallCenterNumberField() {
        WebElement callCenter = driver.findElement(contactCallCenterNumberField);
        callCenter.click();
        callCenter.clear();
        callCenter.sendKeys(randomNumber);
    }

    public void setNotificationChannelSmsField() {
        WebElement sms = driver.findElement(notificationChannelSmsField);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(notificationChannelSmsField));
        if (sms.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", sms);
        } else {
            System.out.println("Radio button SMS wasn't clickable");
        }
    }

    public void setNotificationChannelEmailField() {
        driver.findElement(notificationChannelEmailField).click();
    }

    public void setNextButtonCompany() {
        WebElement nextButton1 = driver.findElement(nextButtonCompany);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonCompany));
        if (nextButton1.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton1);
        } else {
            System.out.println("Next button was disabled");
        }
    }

    public void setIDOfMerchantContractWithAgentForSettlement0Field() {
        WebElement merchantContractWithSettlement = driver.findElement(IDOfMerchantContractWithAgentForSettlement0Field);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", merchantContractWithSettlement);
        merchantContractWithSettlement.sendKeys(randomNumber);
    }

    public void setDateofMerchantContractWithAgentDate0Picker() {
        WebElement dateWidget = driver.findElement(dateofMerchantContractWithAgentDate0Picker);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget);
        dateWidget.sendKeys(calendarDate);
    }

    public void setAgreementContractScan0Button() {
        WebElement contractWithAgent = driver.findElement(agreementContractScan0Button);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(agreementContractScan0Button));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", contractWithAgent);
        contractWithAgent.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement1Field() {
        WebElement merchantContractWithSettlement1 = driver.findElement(IDOfMerchantContractWithAgentForSettlement1Field);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", merchantContractWithSettlement1);
        merchantContractWithSettlement1.sendKeys(randomNumber);
    }

    public void setDateofMerchantContractWithAgentDate1Picker() {
        WebElement dateWidget1 = driver.findElement(dateofMerchantContractWithAgentDate1Picker);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget1);
        dateWidget1.sendKeys(calendarDate);
    }

    public void setAgreementContractScan1Button() {
        WebElement contractWithAgent1 = driver.findElement(agreementContractScan1Button);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", contractWithAgent1);
        contractWithAgent1.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement2Field() {
        WebElement merchantContractWithSettlement2 = driver.findElement(IDOfMerchantContractWithAgentForSettlement2Field);
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", merchantContractWithSettlement2);
        merchantContractWithSettlement2.sendKeys(randomNumber);
    }

    public void setDateofMerchantContractWithAgentDate2Picker() {
        WebElement dateWidget2 = driver.findElement(dateofMerchantContractWithAgentDate2Picker);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget2);
        dateWidget2.sendKeys(calendarDate);
    }

    public void setAgreementContractScan2Button() {
        WebElement contractWithAgent2 = driver.findElement(agreementContractScan2Button);
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", contractWithAgent2);
        contractWithAgent2.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setIDOfMerchantContractWithAgentForSettlement3Field() {
        WebElement merchantContractWithSettlement3 = driver.findElement(IDOfMerchantContractWithAgentForSettlement3Field);
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", merchantContractWithSettlement3);
        merchantContractWithSettlement3.sendKeys(randomNumber);
    }

    public void setDateofMerchantContractWithAgentDate3Picker() {
        WebElement dateWidget3 = driver.findElement(dateofMerchantContractWithAgentDate3Picker);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dateWidget3);
        dateWidget3.sendKeys(calendarDate);
    }

    public void setAgreementContractScan3Button() {
        WebElement contractWithAgent3 = driver.findElement(agreementContractScan3Button);
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", contractWithAgent3);
        contractWithAgent3.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setScanCopyOfStatueButton() {
        WebElement scanStatue = driver.findElement(scanCopyOfStatueButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanStatue);
        scanStatue.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setScanCopyOfTaxIdButton() {
        WebElement scanTax = driver.findElement(scanCopyOfTaxIdButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanTax);
        scanTax.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setScanStatementOfCsrButton() {
        WebElement scanCsr = driver.findElement(scanStatementOfCsrButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanCsr);
        scanCsr.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setScanStatementExtractFromCsrButton() {
        WebElement scanCsrExtr = driver.findElement(scanStatementExtractFromCsrButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanCsrExtr);
        scanCsrExtr.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setScanStatementQuestionnareButton() {
        WebElement scanQuestionnare = driver.findElement(scanStatementQuestionnareButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", scanQuestionnare);
        scanQuestionnare.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setNextButton1() {
        WebElement nextButton1 = driver.findElement(NextButton);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton1));
        if (nextButton1.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton1);
        } else
            System.out.println("Next button1 was disabled");
    }

    public void setFullNameContactField() {
        WebElement fullNameDirector = driver.findElement(fullNameContactField);
        fullNameDirector.click();
        fullNameDirector.clear();
        fullNameDirector.sendKeys(randomAlphabetic);
    }

    public void setPositionContactField() {
        WebElement position = driver.findElement(positionContactField);
        position.click();
        position.clear();
        position.sendKeys(randomAlphabetic);
    }

    public void setCountryOfResidence() {
        WebElement country = driver.findElement(countryOfResidence);
        country.click();
        country.clear();
        country.sendKeys(randomAlphabetic);
    }

    public void setMobileNumberContactField() {
        WebElement phone = driver.findElement(mobileNumberContactField);
        phone.click();
        phone.clear();
        phone.sendKeys(randomNumberMSISDN);
    }

    public void setWorkEmailContactField() {
        WebElement email = driver.findElement(workEmailContactField);
        email.click();
        email.clear();
        email.sendKeys(generateEmail(15));
    }

    public void setAccountFullNameContactField() {
        WebElement accName = driver.findElement(accountFullNameContactField);
        accName.click();
        accName.clear();
        accName.sendKeys(randomAlphabetic);
    }

    public void setAccountPositionContactField() {
        WebElement accPosition = driver.findElement(accountPositionContactField);
        accPosition.click();
        accPosition.clear();
        accPosition.sendKeys(randomAlphabetic);
    }

    public void setAccountCountryOfResidence() {
        WebElement accCountry = driver.findElement(accountCountryOfResidence);
        accCountry.click();
        accCountry.clear();
        accCountry.sendKeys(randomAlphabetic);
    }

    public void setAccountMobileNumberContactField() {
        WebElement accPhone = driver.findElement(accountMobileNumberContactField);
        accPhone.click();
        accPhone.clear();
        accPhone.sendKeys(randomNumberMSISDN);
    }

    public void setAccountWorkEmailContactField() {
        WebElement accEmail = driver.findElement(accountWorkEmailContactField);
        accEmail.click();
        accEmail.clear();
        accEmail.sendKeys(generateEmail(15));
    }

    public void setOperationFullNameContactField() {
        WebElement operationName = driver.findElement(operationFullNameContactField);
        operationName.click();
        operationName.clear();
        operationName.sendKeys(randomAlphabetic);
    }

    public void setOperationPositionContactField() {
        WebElement operationPosition = driver.findElement(operationPositionContactField);
        operationPosition.click();
        operationPosition.clear();
        operationPosition.sendKeys(randomAlphabetic);
    }

    public void setOperationMobileNumberContactField() {
        WebElement operatioNmobile = driver.findElement(operationMobileNumberContactField);
        operatioNmobile.click();
        operatioNmobile.clear();
        operatioNmobile.sendKeys(randomNumberMSISDN);
    }

    public void setOperationWorkEmailContactField() {
        WebElement operationEmail = driver.findElement(operationWorkEmailContactField);
        operationEmail.click();
        operationEmail.clear();
        operationEmail.sendKeys(generateEmail(15));
    }

    public void setFullNameContactITField() {
        WebElement itName = driver.findElement(fullNameContactITField);
        itName.click();
        itName.clear();
        itName.sendKeys(randomAlphabetic);
    }

    public void setPositionContactITField() {
        WebElement itPosition = driver.findElement(positionContactITField);
        itPosition.click();
        itPosition.clear();
        itPosition.sendKeys(randomAlphabetic);
    }

    public void setMobileNumberContactITField() {
        WebElement mobileIt = driver.findElement(mobileNumberContactITField);
        mobileIt.click();
        mobileIt.clear();
        mobileIt.sendKeys(randomNumberMSISDN);
    }

    public void setWorkEmailContactITField() {
        WebElement emailIt = driver.findElement(workEmailContactITField);
        emailIt.click();
        emailIt.clear();
        emailIt.sendKeys(generateEmail(15));
    }

    public void setFullNameContactFinField() {
        WebElement finName = driver.findElement(fullNameContactFinField);
        finName.click();
        finName.clear();
        finName.sendKeys(randomAlphabetic);
    }

    public void setPositionContactFinField() {
        WebElement finPosition = driver.findElement(positionContactFinField);
        finPosition.click();
        finPosition.clear();
        finPosition.sendKeys(randomAlphabetic);
    }

    public void setMobileNumberContactFinField() {
        WebElement finPhone = driver.findElement(mobileNumberContactFinField);
        finPhone.click();
        finPhone.clear();
        finPhone.sendKeys(randomNumberMSISDN);
    }

    public void setWorkEmailContactFinField() {
        WebElement finEmail = driver.findElement(workEmailContactFinField);
        finEmail.click();
        finEmail.clear();
        finEmail.sendKeys(generateEmail(15));
    }

    public void setAccountNoCompanyDetailsField() {
        WebElement accountNo = driver.findElement(accountNoCompanyDetailsField);
        accountNo.click();
        accountNo.clear();
        accountNo.sendKeys(randomNumber);
    }

    public void setBankNameCompanyDetailsField() {
        WebElement bankName = driver.findElement(bankNameCompanyDetailsField);
        bankName.click();
        bankName.clear();
        bankName.sendKeys(randomAlphabetic);
    }

    public void setBankIdComapnyDetailsField() {
        WebElement bankId = driver.findElement(bankIdComapnyDetailsField);
        bankId.click();
        bankId.clear();
        bankId.sendKeys(randomNumber);
    }

    public void setStateEnterpriseRegistryIdField() {
        WebElement stateEnterprise = driver.findElement(stateEnterpriseRegistryIdField);
        stateEnterprise.click();
        stateEnterprise.clear();
        stateEnterprise.sendKeys(randomNumber);
    }

    public void setContractSigneeNameField() {
        WebElement signee = driver.findElement(contractSigneeNameField);
        signee.click();
        signee.clear();
        signee.sendKeys(randomAlphabetic);
    }

    public void setContractSigneePositionField() {
        WebElement signeePosition = driver.findElement(contractSigneePositionField);
        signeePosition.click();
        signeePosition.clear();
        signeePosition.sendKeys(randomAlphabetic);
    }

    public void setContractSigneeBasisField() {
        WebElement signeeBasis = driver.findElement(contractSigneeBasisField);
        signeeBasis.click();
        signeeBasis.clear();
        signeeBasis.sendKeys(randomAlphabetic);
    }

    public void setContractSigneeFullnameField() {
        WebElement contractFullname = driver.findElement(contractSigneeFullnameField);
        contractFullname.click();
        contractFullname.clear();
        contractFullname.sendKeys(randomAlphabetic);
    }

    public void setContractSigneePositionField1() {
        WebElement position1 = driver.findElement(contractSigneePositionField1);
        position1.click();
        position1.clear();
        position1.sendKeys(randomAlphabetic);
    }

    public void setContractSigneeMobileNumberField() {
        WebElement mobileSignee = driver.findElement(contractSigneeMobileNumberField);
        mobileSignee.click();
        mobileSignee.clear();
        mobileSignee.sendKeys(randomNumberMSISDN);
    }

    public void setSigneePassportScanButton() {
        WebElement signeePassport = driver.findElement(signeePassportScanButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeePassport);
        signeePassport.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setSigneeTaxIdScanButton() {
        WebElement signeeTax = driver.findElement(signeeTaxIdScanButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeeTax);
        signeeTax.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setSigneeAuthorizingScanButton() {
        WebElement signeeAuthorize = driver.findElement(signeeAuthorizingScanButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signeeAuthorize);
        signeeAuthorize.sendKeys("C:\\Users\\ilonazhd\\Desktop\\winscp.png");
    }

    public void setNextButton2() {
        WebElement nextButton2 = driver.findElement(NextButton2);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton2));
        if (nextButton2.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton2);
        } else
            System.out.println("Next button2 was disabled");
    }

    public void setNumberOfWorkingDaysForFundsInbankField() {
        WebElement numberOfDays = driver.findElement(numberOfWorkingDaysForFundsInbankField);
        numberOfDays.click();
        numberOfDays.clear();
        numberOfDays.sendKeys(daysForRefund);
    }

    public void setMerchantApiField() {
        WebElement merchantApi = driver.findElement(merchantApiField);
        merchantApi.click();
        merchantApi.clear();
        merchantApi.sendKeys(generateUrl(15));
    }

    public void setFeeForRefundField() {
        WebElement feerefund = driver.findElement(feeForRefundField);
        feerefund.click();
        feerefund.clear();
        feerefund.sendKeys(daysForRefund);
    }

    public void setTurnoverOverLastYearField() {
        WebElement turnOver = driver.findElement(turnoverOverLastYearField);
        turnOver.click();
        turnOver.clear();
        turnOver.sendKeys(randomNumber);
    }

    public void setTestServerIpField() {
        WebElement serverIP = driver.findElement(testServerIpField);
        serverIP.click();
        serverIP.clear();
        serverIP.sendKeys(randomNumber);
    }

    public void setTestServerPortField() {
        WebElement serverPort = driver.findElement(testServerPortField);
        serverPort.click();
        serverPort.clear();
        serverPort.sendKeys(randomNumber);
    }

    public void setTestProductionServerIpField() {
        WebElement productionIP = driver.findElement(testProductionServerIpField);
        productionIP.click();
        productionIP.clear();
        productionIP.sendKeys(randomNumber);
    }

    public void setTestProductionServerPortField() {
        WebElement productionPort = driver.findElement(testProductionServerPortField);
        productionPort.click();
        productionPort.clear();
        productionPort.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientNameField0() {
        WebElement nameB = driver.findElement(bankdetailRecipientNameField0);
        nameB.click();
        nameB.clear();
        nameB.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientIdField0() {
        WebElement recipientId = driver.findElement(bankdetailRecipientIdField0);
        recipientId.click();
        recipientId.clear();
        recipientId.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientAccountNoField0() {
        WebElement accountB = driver.findElement(bankdetailRecipientAccountNoField0);
        accountB.click();
        accountB.clear();
        accountB.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankCodeField0 (){
        WebElement bankCode = driver.findElement(bankdetailRecipientBankCodeField0);
        bankCode.click();
        bankCode.clear();
        bankCode.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField0 (){
        WebElement bankName0 = driver.findElement(bankdetailRecipientBankNameField0);
        bankName0.click();
        bankName0.clear();
        bankName0.sendKeys(randomAlphabetic);
    }
    public void setBankdetailRecipientPaymentPurposeField0 (){
        WebElement purpose0 = driver.findElement(bankdetailRecipientPaymentPurposeField0);
        purpose0.click();
        purpose0.clear();
        purpose0.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientNameField1 (){
        WebElement name1 = driver.findElement(bankdetailRecipientNameField1);
        name1.click();
        name1.clear();
        name1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientIdField1 (){
        WebElement id1 = driver.findElement(bankdetailRecipientIdField1);
        id1.click();
        id1.clear();
        id1.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientAccountNoField1 (){
        WebElement accountNumber = driver.findElement(bankdetailRecipientAccountNoField1);
        accountNumber.click();
        accountNumber.clear();
        accountNumber.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankCodeField1 (){
        WebElement bankCode1 = driver.findElement(bankdetailRecipientBankCodeField1);
        bankCode1.click();
        bankCode1.clear();
        bankCode1.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField1 (){
        WebElement bankname1 = driver.findElement(bankdetailRecipientBankNameField1);
        bankname1.click();
        bankname1.clear();
        bankname1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientPaymentPurposeField1 (){
        WebElement bankPurpose1 = driver.findElement(bankdetailRecipientPaymentPurposeField1);
        bankPurpose1.click();
        bankPurpose1.clear();
        bankPurpose1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientNameField2 (){
        WebElement name2 = driver.findElement(bankdetailRecipientNameField2);
        name2.click();
        name2.clear();
        name2.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientIdField2 (){
        WebElement recipient2 = driver.findElement(bankdetailRecipientIdField2);
        recipient2.click();
        recipient2.clear();
        recipient2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientAccountNoField2 (){
        WebElement accountN2 = driver.findElement(bankdetailRecipientAccountNoField2);
        accountN2.click();
        accountN2.clear();
        accountN2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankCodeField2 (){
        WebElement bankCode2 = driver.findElement(bankdetailRecipientBankCodeField2);
        bankCode2.click();
        bankCode2.clear();
        bankCode2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField2 (){
        WebElement bankname = driver.findElement(bankdetailRecipientBankNameField2);
        bankname.click();
        bankname.clear();
        bankname.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientPaymentPurposeField2 (){
        WebElement paymentPurpose2 = driver.findElement(bankdetailRecipientPaymentPurposeField2);
        paymentPurpose2.click();
        paymentPurpose2.clear();
        paymentPurpose2.sendKeys(randomAlphabetic);
    }

    public void setPaymentPurposeField (){
        WebElement paymentPurpose = driver.findElement(paymentPurposeField);
        paymentPurpose.click();
        paymentPurpose.clear();
        paymentPurpose.sendKeys(randomAlphabetic);
    }


    public void setNextButton3() {
        WebElement nextButton3 = driver.findElement(NextButton3);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton3));
        if (nextButton3.isEnabled()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", nextButton3);
        } else
            System.out.println("Next button2 was disabled");
    }

    public  void setSaveButton () {
        WebElement savebutton = driver.findElement(saveButton);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(savebutton));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(("arguments[0].click();"),savebutton);
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
    }



}
