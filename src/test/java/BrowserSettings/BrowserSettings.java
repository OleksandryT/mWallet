package BrowserSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BrowserSettings {

   public static WebDriver driver;


  @Parameters(value = {"browser"})
  @BeforeSuite(alwaysRun = true)
    public void setBrowser (@Optional("Chrome") String browser) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ilonazhd\\Documents\\QA docs\\AUTOMATION\\chromedriver.exe");
      driver = new ChromeDriver(ChromeDriverService.createDefaultService());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }



  @AfterSuite
    public void tearDown (){
      driver.close();
  }


}
