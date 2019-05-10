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
    //TODO Log field
    public static void openUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void refresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void close(WebDriver driver) {
        try {
            if (driver != null) driver.quit();
        } catch (WebDriverException exception) {
        //TODO log.error("loc.err.wd.ex")
        } finally {
            if (driver != null) driver.quit();
        }
    }
}
