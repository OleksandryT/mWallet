package Tests.Smoke.EmoneyManagement;

import BrowserSettings.BrowserSettings;
import org.openqa.selenium.By;

public class TestPriming extends BrowserSettings {

    public String successMessage = driver.findElement(By.xpath("//*[@id=\"successMsg\"]")).getText();
}
