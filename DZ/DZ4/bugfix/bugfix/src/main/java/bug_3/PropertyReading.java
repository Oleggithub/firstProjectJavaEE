package bug_3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReading {
    public static void main(String[] args) throws IOException {
        final String username = "admin";
        final String password = "1234";

        Properties properties = new Properties();
        InputStream inputStream = InputStream.class.getResourceAsStream("credentials.properties");
        //please use relative path, not absolute
        properties.getProperty(String.valueOf(inputStream));
        String adminUserName = properties.getProperty(username);
         String adminPassword = properties.getProperty(password);

        System.out.println("should be the same " + username == adminUserName);
        System.out.println("should be the same " + password == adminPassword);
    }
}
