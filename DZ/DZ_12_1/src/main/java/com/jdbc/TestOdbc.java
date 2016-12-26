package com.jdbc;

/**
 * Created by b_nop on 26.12.2016.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestOdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbc");
        Connection connection = DriverManager.getConnection("jdbc:odbc:UserDataSource");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select [Sheet1$].id from [Sheet1$]");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        PreparedStatement preparedStatement = connection.prepareStatement("insert into [Sheet1$] values(?,?,?)");
        preparedStatement.setObject(1,"12");
        preparedStatement.setObject(2,"13");
        preparedStatement.setObject(3,"67");
        preparedStatement.executeUpdate();
        connection.close();

    }
}
