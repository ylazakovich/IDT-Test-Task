package framework;

import framework.utils.CapabilityGenerator;
import framework.utils.PropertyReader;
import framework.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.nio.file.Paths;

/**
 * Compares OS (Linux or Windows) and choose driver (current chrome)
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class BrowserFactory extends BaseEntity {
    private static final String OPERATION_SYSTEM_NAME = System.getProperty("os.name");
    private static final String PROPERTY_CHROME = "webdriver.chrome.driver";
    private static final String DRIVER_CHROME = "drivers/chromedriver";
    private static final String CHROME = "chrome";
    private static final String LINUX = "linux";
    private static final String BROWSER_NAME = PropertyReader.getProperty("browserName");
    private static final String DRIVER_PATH = "src/main/resources/";
    private static BrowserFactory instance;
    private WebDriver driver;

    public static BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    private BrowserFactory() {
        driver = initBrowser(BROWSER_NAME);
        logger.info(logger.getLoc("loc.open.browser"));
    }

    private static String initOs() {
        System.out.println("Current OS: " + System.getProperties().getProperty("os.name"));
        return OPERATION_SYSTEM_NAME.toLowerCase().equals(LINUX) ? "" : ".exe";
    }

    private void setPropertyBrowser(String prop, String driverName) {
        System.setProperty(prop, Paths.get(DRIVER_PATH, driverName.concat(initOs())).toString());
    }

    private WebDriver initBrowser(String browserName) {
        System.out.println("Current Browser: " + browserName);
        switch (browserName.toLowerCase()) {
            case CHROME:
                setPropertyBrowser(PROPERTY_CHROME, DRIVER_CHROME);
                driver = new ChromeDriver(CapabilityGenerator.getChromeCapability());
                break;
            default:
                setPropertyBrowser(PROPERTY_CHROME, DRIVER_CHROME);
                driver = new ChromeDriver();
        }
        return driver;
    }

}
