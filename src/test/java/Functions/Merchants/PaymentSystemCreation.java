package Functions.Merchants;

import RandomValuesForTests.Merchants;
import RandomValuesForTests.RandomValues;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Functions.Merchants.MerchantCreation.*;
import static RandomValuesForTests.RandomValues.*;
import static RandomValuesForTests.RandomValues.randomAlphabetic;
import static RandomValuesForTests.RandomValues.randomNumber;

public class PaymentSystemCreation implements Merchants {

    private WebDriver driver;
    public PaymentSystemCreation (WebDriver driver) {this.driver=driver;}

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
        email.sendKeys(RandomValues.generateEmail(20));
    }

    public void setContactWebsite() {
        WebElement web = driver.findElement(contactWebsiteField);
        web.click();
        web.clear();
        web.sendKeys(RandomValues.generateUrl(10));
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
        email.sendKeys(RandomValues.generateEmail(15));
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
        accEmail.sendKeys(RandomValues.generateEmail(15));
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
        operationEmail.sendKeys(RandomValues.generateEmail(15));
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
        emailIt.sendKeys(RandomValues.generateEmail(15));
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
        finEmail.sendKeys(RandomValues.generateEmail(15));
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
        merchantApi.sendKeys(RandomValues.generateUrl(15));
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

    public void setBankdetailRecipientBankCodeField0() {
        WebElement bankCode = driver.findElement(bankdetailRecipientBankCodeField0);
        bankCode.click();
        bankCode.clear();
        bankCode.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField0() {
        WebElement bankName0 = driver.findElement(bankdetailRecipientBankNameField0);
        bankName0.click();
        bankName0.clear();
        bankName0.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientPaymentPurposeField0() {
        WebElement purpose0 = driver.findElement(bankdetailRecipientPaymentPurposeField0);
        purpose0.click();
        purpose0.clear();
        purpose0.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientNameField1() {
        WebElement name1 = driver.findElement(bankdetailRecipientNameField1);
        name1.click();
        name1.clear();
        name1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientIdField1() {
        WebElement id1 = driver.findElement(bankdetailRecipientIdField1);
        id1.click();
        id1.clear();
        id1.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientAccountNoField1() {
        WebElement accountNumber = driver.findElement(bankdetailRecipientAccountNoField1);
        accountNumber.click();
        accountNumber.clear();
        accountNumber.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankCodeField1() {
        WebElement bankCode1 = driver.findElement(bankdetailRecipientBankCodeField1);
        bankCode1.click();
        bankCode1.clear();
        bankCode1.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField1() {
        WebElement bankname1 = driver.findElement(bankdetailRecipientBankNameField1);
        bankname1.click();
        bankname1.clear();
        bankname1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientPaymentPurposeField1() {
        WebElement bankPurpose1 = driver.findElement(bankdetailRecipientPaymentPurposeField1);
        bankPurpose1.click();
        bankPurpose1.clear();
        bankPurpose1.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientNameField2() {
        WebElement name2 = driver.findElement(bankdetailRecipientNameField2);
        name2.click();
        name2.clear();
        name2.sendKeys(randomAlphabetic);
    }

    public void setBankdetailRecipientIdField2() {
        WebElement recipient2 = driver.findElement(bankdetailRecipientIdField2);
        recipient2.click();
        recipient2.clear();
        recipient2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientAccountNoField2() {
        WebElement accountN2 = driver.findElement(bankdetailRecipientAccountNoField2);
        accountN2.click();
        accountN2.clear();
        accountN2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankCodeField2() {
        WebElement bankCode2 = driver.findElement(bankdetailRecipientBankCodeField2);
        bankCode2.click();
        bankCode2.clear();
        bankCode2.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientBankNameField2() {
        WebElement bankname = driver.findElement(bankdetailRecipientBankNameField2);
        bankname.click();
        bankname.clear();
        bankname.sendKeys(randomNumber);
    }

    public void setBankdetailRecipientPaymentPurposeField2() {
        WebElement paymentPurpose2 = driver.findElement(bankdetailRecipientPaymentPurposeField2);
        paymentPurpose2.click();
        paymentPurpose2.clear();
        paymentPurpose2.sendKeys(randomAlphabetic);
    }

    public void setPaymentPurposeField() {
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

    public void setSaveButton() {
        WebElement savebutton = driver.findElement(saveButton);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(savebutton));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(("arguments[0].click();"), savebutton);
    }
}
