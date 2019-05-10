package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Allows manage current driver
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class WebDriverManager {
    private static final String URL = PropertyReader.getProperty("url");
    //TODO Log field

    public static void openUrl(WebDriver driver) {
        driver.get(URL);
    }

    public static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void refresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void close(WebDriver driver) {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (WebDriverException exception) {
        //TODO log.error("loc.err.wd.ex")
        } finally {
            driver.quit();
        }
    }
}
