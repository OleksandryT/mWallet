package BrowserSettings;

import Utilities.ExtentReports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BrowserSettings {
    /*
     * метод в методе можно использовать с помощью this
     * заверуть методы в методы и сократить методы в тестовых классах
     * исбавляться от Стрингов в классах и методах - использовать файлы - так секьюрнее
     * если какие либо тесты начинаются одинаково можно использовать @BeforeTest (или что то похожее) выписать в этот метод методы и не вписывать каждый раз , а тесты будут повторяться все равно
     * */

    public static WebDriver driver;
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
    }


    @AfterSuite
    public void tearDown (){
        driver.close();
    }

}
