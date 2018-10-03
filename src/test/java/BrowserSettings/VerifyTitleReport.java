//package BrowserSettings;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.SkipException;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import java.io.File;
//
//public class VerifyTitleReport {
//
//    ExtentReports extentReports;
//    ExtentTest logger;
//
//    @BeforeTest
//    public void startTest (){
//        extentReports = new ExtentReports((System.getProperty("user.dir")+"/test-output/STMExtentReport.html"),true);
//        extentReports.addSystemInfo("Host name", "Software Testing Material")
//        .addSystemInfo("Environment", "Automation testing")
//        .addSystemInfo("User Name", "Ilona");
//
//        extentReports.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
//    }
//
//    @Test
//    public void passTest (){
//        logger = extentReports.startTest("passTest");
//        Assert.assertTrue(true);
//        logger.log(LogStatus.PASS,"Test case passed is passTest");
//    }
//
//    @Test
//    public void failTest (){
//        logger = extentReports.startTest("failTest");
//        Assert.assertTrue(false);
//        logger.log(LogStatus.FAIL, "Test case (failtest) Status is passed");
//
//    }
//
//    @Test
//    public void skipTest (){
//        logger = extentReports.startTest("skipest");
//        throw  new SkipException("Skipping - this is not ready for testing");
//    }
//
//    @AfterMethod
//    public void getReport (ITestResult result){
//        if(result.getStatus() == ITestResult.FAILURE){
//            //Write log
//            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
//            logger.log(LogStatus.FAIL, "Test Case Failed is" + result.getThrowable());
//        }
//        else if (result.getStatus() == ITestResult.SKIP){
//            //Write log
//            logger.log(LogStatus.SKIP, "Test case skip is " + result.getName());
//        }
//
//        //Ends the current test and prepared to prepare HTML report
//        extentReports.endTest(logger);
//    }
//
//    @AfterTest
//    public void endReport (){
//        //Updates info about report
//        extentReports.flush();
//        //Very end of your session , closing everything
//        extentReports.close();
//    }
//}
