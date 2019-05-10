package framework;

import framework.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Holds all main classes
 * (BrowserFactory, BaseTest, BasePage, BaseElement)
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public abstract class BaseEntity {
    //TODO Log field
    protected static WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = BrowserFactory.getInstance().getDriver();
        WebDriverManager.maximize(driver);
        WebDriverManager.openUrl(driver);
        Waiter.implicitWait(driver);
    }

    @AfterMethod
    public void turnDown() {
        WebDriverManager.close(driver);
    }
}
