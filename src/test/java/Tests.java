import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tests extends BrowserSettings{

    @Parameters ({"browser"})
    @org.testng.annotations.Test
    public void logIn (@Optional("Chrome")String browser) {
      mWallet logIn = new mWallet(driver);
      logIn.signIn();
      Assert.assertEquals(driver.getTitle(), "Back Office Portal");
  }

  @Parameters ({"browser"})
    @Test
    public void merchantCreation (@Optional("Chrome")String browser)  {
        mWallet merchantMerchant = new mWallet(driver);
        merchantMerchant.merchantCreation();

  }

}
