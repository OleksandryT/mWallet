package Utilities.Listeners;

import BrowserSettings.BrowserSettings;
import Utilities.ExtentReports.ExtentTestManager;
import Utilities.ExtentReports.ExtentsManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BrowserSettings implements ITestListener
{
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    //Before starting all tests, below method runs.
    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", this.driver);
    }

    //After ending all tests, below method runs.
    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
        //Do tier down operations for extentreports reporting!
        ExtentTestManager.endTest();
        ExtentsManager.getReporter().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in onTestStart method " +  getTestMethodName(iTestResult) + " start");
        //Start operation for extentreports.
        ExtentTestManager.startTest(iTestResult.getMethod().getMethodName(),"");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
        //Extentreports log operation for passed tests.
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");

        //Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = ((BrowserSettings) testClass).getDriver();

        //Take base64Screenshot screenshot.
        String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
                getScreenshotAs(OutputType.BASE64);

        //Extentreports log and screenshot operations for failed tests.
        ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
                ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
        ExtentTestManager.getTest().log(LogStatus.FAIL,iTestResult.getThrowable().toString());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
        //Extentreports log operation for skipped tests.
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        ExtentTestManager.getTest().log(LogStatus.SKIP,iTestResult.getThrowable().toString());
        ExtentTestManager.getTest().log(LogStatus.SKIP, (Throwable) iTestResult.getMethod());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }

}
