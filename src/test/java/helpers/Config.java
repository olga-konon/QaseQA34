package helpers;

public class Config {

    public static String getUser() {
        return System.getProperty("user", PropertyReader.getProperty("user"));
    }

    public static String getPassword() {
        return System.getProperty("password", PropertyReader.getProperty("password"));
    }
}
