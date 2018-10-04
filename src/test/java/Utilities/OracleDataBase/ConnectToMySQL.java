package Utilities.OracleDataBase;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectToMySQL
{

    @AfterSuite
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        Class.forName("oracle.jdbc.OracleDriver");
        // Open a connection
        conn = DriverManager.getConnection("jdbc:oracle:thin:@10.122.160.37:1521:xe", "vip_ukr", "wsx3edc");

        // Execute a query
        stmt = conn.createStatement();

        resultSet = stmt.executeQuery("select * from sc_service where full_name ='IZ_Bulk_P2P_Prepaid_Test113356'");
        while (resultSet .next()) {
            System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
                    + resultSet.getString(4) + "  " + resultSet.getString(5) + "  " + resultSet.getString(6) + "  " + resultSet.getString(7) + "  " + resultSet.getString(8));
        }

        if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
    }

