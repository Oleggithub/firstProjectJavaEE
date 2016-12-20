package com.jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by b_nop on 20.12.2016.
 */
public class Main {
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sa";
    private static final String URL = "jdbc:h2:file:F:/Work/D/My_Lessons_Java/Java EE/DZ/DZ_12/DB/user_db1";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       
        Connection connection = null;
        Driver driver;

        try{
            driver = new FabricMySQLDriver();
        }
        catch (SQLException ex){
            System.out.println("Error driver !");
            return;
        }
        try{
            DriverManager.registerDriver(driver);
        } catch (SQLException ex) {
            System.out.println("Driver don't Registered !");
            return;
        }
        try{
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("code ...");
        } catch (SQLException ex){
            System.out.println("Error connect !");
            return;
        }
        finally {
            if (connection != null)
                connection.close();
        }
    }
}
