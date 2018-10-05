package Utilities.OracleDataBase;
import java.sql.*;
import java.util.ArrayList;


public class ConnectToMySQL {

    private static String dbusername;
    private static String dbpassword;

    //Should be defined as jdbc:mysql://host:port/database name
    private static String databaseURLQA= "jdbc:oracle:thin:@10.122.160.37:1521:xe";
    private static String databaseURLSTAGE= "";
    private static String databaseURLPRODUCTION= "";


    public static String executeSQLQuery(String testEnv, String sqlQuery) {
        String connectionUrl="";
        Connection connection;
        String resultValue = "";
        ResultSet rs;

        //To connect with QA Database
        if(testEnv.equalsIgnoreCase("QA")){
            connectionUrl = databaseURLQA;
            dbusername = "vip_ukr";
            dbpassword = "wsx3edc";
        }
        //To connect with Stage Database
        else if(testEnv.equalsIgnoreCase("STAGE")) {
            connectionUrl = databaseURLSTAGE;
            dbusername = "";
            dbpassword = "";
        }

        //To connect with Production Database
        else if(testEnv.equalsIgnoreCase("PRODUCTION")) {
            connectionUrl = databaseURLPRODUCTION;
            dbusername = "";
            dbpassword = "";
        }
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null) {
                System.out.println("Connected to the database...");
            }else {
                System.out.println("Database connection failed to "+testEnv+" Environment");
            }
            Statement stmt = connection.createStatement();
            rs=stmt.executeQuery(sqlQuery);

            try {
                while(rs.next()){
                    System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
                            + rs.getString(4) + "  " + rs.getString(5)+ "  " + rs.getString(6)+ "  " + rs.getString(7)+ "  " + rs.getString(8)+ "  " + rs.getString(9)+ "  " + rs.getString(10)+ "  " + rs.getString(11)+ "  " + rs.getString(12)+ "  " + rs.getString(13)+ "  " + rs.getString(14)+ "  " + rs.getString(15)+ "  " + rs.getString(16)+ "  " + rs.getString(17)+ "  " + rs.getString(18)+ "  " + rs.getString(19)+ "  " + rs.getString(20));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException err) {
                System.out.println("No Records obtained for this specific query");
                err.printStackTrace();
            }
            connection.close();

        }catch(SQLException sqlEx) {
            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
    }

public static ArrayList<String> executeSQLQuery_List(String testEnv, String sqlQuery) {
        String connectionUrl="";
        Connection connection;
        ArrayList<String> resultValue = new ArrayList<String>();
        ResultSet resultSet;

        //To connect with QA Database
        if(testEnv.equalsIgnoreCase("QA")){
            connectionUrl = databaseURLQA;
            dbusername = "vip_ukr";
            dbpassword = "wsx3edc";
        }

        //To connect with Stage Database
        else if(testEnv.equalsIgnoreCase("STAGE")) {
            connectionUrl = databaseURLSTAGE;
            dbusername = "";
            dbpassword = "";
        }

        //To connect with Production Database
        else if(testEnv.equalsIgnoreCase("PRODUCTION")) {
            connectionUrl = databaseURLPRODUCTION;
            dbusername = "";
            dbpassword = "";
        }

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null) {
                System.out.println("Connected to the database");
            }else {
                System.out.println("Failed to connect to "+testEnv+" database");
            }
            Statement statement = connection.createStatement();
            resultSet=statement.executeQuery(sqlQuery);

            try {
                while(resultSet.next()){
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int iCounter=1;iCounter<=columnCount; iCounter++){
                        stringBuilder.append(resultSet.getString(iCounter).trim()+" ");
                    }
                    String reqValue = stringBuilder.substring(0, stringBuilder.length()-1);
                    resultValue.add(reqValue);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException ex) {
                System.out.println("No Records found for this specific query" +ex.getStackTrace());
            }
            finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.out.println( "SQL Exception:" +ex.getStackTrace());
                    }
                }
            }

        }catch(SQLException sqlEx) {
            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
    }
    }

