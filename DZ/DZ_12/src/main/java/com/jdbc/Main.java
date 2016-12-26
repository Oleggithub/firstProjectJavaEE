package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by b_nop on 20.12.2016.
 */
public class Main {
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:h2:file:F:/Work/D/My_Lessons_Java/Java EE/DZ/DZ_12/DB/user_db2";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection = null;
        Driver driver;

        try {
            Class.forName("org.h2.Driver");//регистрация драйвера - если у тебя мускул - менял бы здесь просто название - сейчас скину
            // линк где можно посмотреть определние названий под каждый из представителей субд
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("code ...");
        } catch (SQLException ex) {
            System.out.println("Error connect !");
            return;
        } finally {
            if (connection != null)
                connection.close();
        }
    }
}
