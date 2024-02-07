package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final String PATH_FILE_APPLICATION_PROPERTIES = "src/test/resources/application.properties";
    private final Properties properties;
    private static String VALID_USER;
    private static String VALID_PASSWORD;
    private static String INVALID_USER;
    private static String INVALID_PASSWORD;
    private static String LOCKED_USER;

    public PropertiesReader() throws IOException {
        File file = new File(PATH_FILE_APPLICATION_PROPERTIES);
        String absolutePath = file.getAbsolutePath();
        this.properties = new Properties();
        this.properties.load(new FileInputStream(absolutePath));
    }

    public void initializeProperties() {
        loadProperties();
    }

    private void loadProperties() {
        VALID_USER = properties.getProperty("sauce.valid.user");
        VALID_PASSWORD = properties.getProperty("sauce.valid.password");
        INVALID_USER = properties.getProperty("sauce.invalid.user");
        INVALID_PASSWORD = properties.getProperty("sauce.invalid.password");
        LOCKED_USER = properties.getProperty("sauce.locked.user");
    }

    public static String getValidUser() {
        return VALID_USER;
    }

    public static String getValidPassword() {
        return VALID_PASSWORD;
    }

    public static String getInvalidUser() {
        return INVALID_USER;
    }

    public static String getInvalidPassword() {
        return INVALID_PASSWORD;
    }

    public static String getLockedUser() {
        return LOCKED_USER;
    }

}
