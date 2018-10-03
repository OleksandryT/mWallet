package Tests.Smoke.Merchants;

import BrowserSettings.BrowserSettings;
import Functions.Merchants.MerchantCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLException;

@Test(groups = {"Merchants"}, dependsOnGroups = {"MyProfile"})
public class TestMerchantCreation extends BrowserSettings {
//
//    Connection conn = null;
//    Statement stmt = null;
//    ResultSet resultSet = null;
//
//    @BeforeClass
//    public void setUpConnection() throws  SQLException, ClassNotFoundException{
//        // Register JDBC driver (JDBC driver name and Database URL)
//        Class.forName("oracle.jdbc.OracleDriver");
//        // Open a connection
//        conn = DriverManager.getConnection("jdbc:oracle:thin:@10.122.160.37:1521:xe", "vip_ukr", "wsx3edc");
////        stmt = conn.createStatement();
//    }

    @Test
    public void merchantCreation () throws InterruptedException, SQLException, ClassNotFoundException {
        logger = extentReports.startTest("merchantCreation");
        // Open a connection
        MerchantCreation merchantMerchant = new MerchantCreation(driver);
        merchantMerchant.merchantCreation();
        // WebDriverWait wait = new WebDriverWait(driver,40);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"successmsg\"]")));
        Thread.sleep(50000);
        Assert.assertTrue(true, String.valueOf(driver.getPageSource().contains("Merchant created successfully. Please approve the Merchant with another user with appropriate permission. Merchant ID = " )));
        System.out.println("Merchant was successfully created with the ID : " + merchantMerchant.merchantId());
////        throw  new SkipException("Skipping - this is not ready for testing. Merchant Creation");
//        // Execute a query
//        stmt = conn.createStatement();
//        resultSet = stmt.executeQuery("select * from merchant where merchant_name = " + "'" + merchantMerchant.merchantId() + "'" + ";");
//        while (resultSet .next()) {
//            System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
//                    + resultSet.getString(4) + "  " + resultSet.getString(5)+"  " + resultSet.getString(6)+"  " + resultSet.getString(7)+"  " + resultSet.getString(8));
//        }


    }

//    @AfterTest
//    public void CloseTheConnection() throws SQLException {
//        // Code to close each and all Object related to Database connection
//        if (resultSet != null) {
//            try {
//                resultSet.close();
//            } catch (Exception e) {
//            }
//        }
//
//        if (stmt != null) {
//            try {
//                stmt.close();
//            } catch (Exception e) {
//            }
//        }
//
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (Exception e) {
//            }
//        }
//    }


}
