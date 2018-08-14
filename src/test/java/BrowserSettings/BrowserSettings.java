package BrowserSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BrowserSettings {

  protected WebDriver driver;

  @BeforeSuite
  @Parameters(value = {"browser"})
    public void setBrowser (@Optional("Chrome")String browser) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ilonazhd\\Documents\\QA docs\\AUTOMATION\\chromedriver.exe");
      driver = new ChromeDriver(ChromeDriverService.createDefaultService());
      driver.get("https://10.122.160.37/ui/mwallet/aui/#/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

//
//  @AfterTest
//    public void tearDown (){
//      driver.close();
//  }


}
