package framework.utils;

import java.io.*;
import java.util.Properties;

/**
 * Allows read config.properties
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class PropertyReader {
    private static PropertyReader instance;
    private static Properties properties;
    //TODO "src/test/resources/config.properties"
    private static final String propertyFilePath = "src/main/resources/config.properties";

    private PropertyReader() {
        BufferedReader reader;
        try {
            File file = new File(propertyFilePath);
            reader = new BufferedReader(new FileReader(file.getCanonicalPath()));
            properties = new Properties();
            initProperties(reader);
        } catch (FileNotFoundException e) {
            //TODO
           // log.error("loc.err.properties.not.found");
            throw new RuntimeException();
        } catch (IOException e) {
           // log.error("loc.err.properties.file.path");
        }
    }

    private void initProperties(BufferedReader reader) {
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
           // log.error("log.err.file.closed");
        }
    }

    public static String getProperty(String propertyName) {
        if (instance == null) {
            instance = new PropertyReader();
        }
        return properties.containsKey(propertyName) ? properties.getProperty(propertyName) : null;
    }

    public static String getPropertyOrDefault(String propertyName, String defaultValue) {
        String result = getProperty(propertyName);
        return (null == result) ? defaultValue : result;
    }
}

