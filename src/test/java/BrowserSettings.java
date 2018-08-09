import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BrowserSettings {

  protected WebDriver driver;

  @BeforeTest
  @Parameters(value = {"browser"})
    public void setBrowser (String browser) {
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
