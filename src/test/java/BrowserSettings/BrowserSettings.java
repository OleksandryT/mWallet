package BrowserSettings;

//import Utilities.OracleDataBase.ConnectToMySQL;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.sql.*;
import java.util.concurrent.TimeUnit;

public class BrowserSettings {
  /*
  * метод в методе можно использовать с помощью this
  * заверуть методы в методы и сократить методы в тестовых классах
  * исбавляться от Стрингов в классах и методах - использовать файлы - так секьюрнее
  * если какие либо тесты начинаются одинаково можно использовать @BeforeTest (или что то похожее) выписать в этот метод методы и не вписывать каждый раз , а тесты будут повторяться все равно
  * */

   public static WebDriver driver;
   public static ExtentReports extentReports;
   public static ExtentTest logger;
//
//    public static Connection conn = null ;
//    public static Statement stmt = null;
//    public static ResultSet resultSet = null ;

    public WebDriver getDriver() {
        return driver;
    }

  @Parameters(value = {"browser"})
  @BeforeSuite(alwaysRun = true)
    public static void startTest (@Optional("Chrome") String browser) {
      System.setProperty("webdriver.chrome.driver", "C:\\IlonaQA_Kyivstar_mWallet\\Automation_mWallet\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver(ChromeDriverService.createDefaultService());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
      extentReports = new ExtentReports((System.getProperty("user.dir") + "/test-output/DEMOTestAutomationmWalletKS.html"), false);
      extentReports.addSystemInfo("Host name", "mWallet");
      extentReports.addSystemInfo("Environment", "DEV");
      extentReports.addSystemInfo("User Name", "Ilona QA");
      extentReports.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }

    @AfterMethod
    public void getReport (ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            //Write log
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is" + result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SKIP){
            //Write log
            logger.log(LogStatus.SKIP, "Test case skip is " + result.getName());
        }

        //Ends the current test and prepared to prepare HTML report
        extentReports.endTest(logger);
    }

    @AfterTest
    public void endReport (){
        //Updates info about report
        extentReports.flush();
        //Very end of your session , closing everything
        extentReports.close();
    }


  @AfterSuite
    public void tearDown (){
      driver.close();
  }


}
