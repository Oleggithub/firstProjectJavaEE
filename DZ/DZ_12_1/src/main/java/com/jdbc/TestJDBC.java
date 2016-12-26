package com.jdbc;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class TestJDBC {
    private static String USER_INFO = "id = %s; name = %s \n";

    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        TestJDBC testJDBC = new TestJDBC();
        Class.forName("com.mysql.jdbc.Driver");//register jdbc.properties driver
        Properties properties = new Properties();
        testJDBC.loadProps(properties);

        String url = properties.getProperty("url");//get url from our jdbc.properties file
        String userName = properties.getProperty("user.name");//get username
        String password = properties.getProperty("user.password");//get password


        Connection connection = DriverManager.getConnection(url, userName, password);//create connection to db, using url, username and pswrd from jdbc.properties file
        printDataAboutUsers(connection);
        System.out.println("Update user's names ------------------------------------------");
        updateUserData(connection);
        //print info after user's name update
        printDataAboutUsers(connection);
        System.out.println("Add new users ------------------------------------------");
        //add new users
        addNewUsers(connection);
        //print info after new user creations
        printDataAboutUsers(connection);
        connection.close();
    }

    private static void addNewUsers(Connection connection) throws SQLException {
        connection.setAutoCommit(false);
        String sqlStr = "INSERT INTO USER(NAME) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);

        for (int i = 0; i < 10; i++) {
            preparedStatement.setString(1, "New_user_" + i);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
    }

    private static void updateUserData(Connection connection) throws SQLException {
        connection.setAutoCommit(false);
        String updateSQLStr = "UPDATE USER SET NAME=? WHERE ID=?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQLStr);
        preparedStatement.setString(1, "New_user_name");
        preparedStatement.setString(2, "1");
        preparedStatement.addBatch();

        preparedStatement.setString(1, "New_user_name");
        preparedStatement.setString(2, "2");
        preparedStatement.addBatch();

        int[] resultOfExecution = preparedStatement.executeBatch();
        /*
        A number greater than or equal to zero -- indicates that the command was processed successfully and is an update count giving the number of rows in the database that were affected by the command's execution
        A value of SUCCESS_NO_INFO -- indicates that the command was processed successfully but that the number of rows affected is unknown
        A value of EXECUTE_FAILED -- indicates that the command failed to execute successfully and occurs only if a driver continues to process commands after a command fails
         */
        System.out.println(Arrays.toString(resultOfExecution));

    }

    public void loadProps(Properties properties) throws IOException {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("jdbc/config/files/jdbc.properties");
        properties.load(in);
    }

    public static void printDataAboutUsers(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("SELECT * FROM USER");
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            System.out.printf(USER_INFO, resultSet.getString(1), resultSet.getString(2));
        }
    }
}
