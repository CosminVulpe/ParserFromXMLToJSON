package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {
    private static final String configPropertiesPathFile = "src/main/resources/config.properties";

    public static String readConfigProperties(String propertyName) throws IOException {
        FileReader fileReader;
        try {
            fileReader = new FileReader(configPropertiesPathFile);
        } catch (FileNotFoundException e) {
            throw new IOException("The file does not exist", e);
        }

        Properties properties = new Properties();
        properties.load(fileReader);
        return properties.getProperty(propertyName);
    }
}
