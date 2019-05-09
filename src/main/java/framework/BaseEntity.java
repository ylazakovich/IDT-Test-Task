package framework;

import framework.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Holds all main classes
 * (BrowserFactory, BaseTest, BasePage, BaseElement)
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public abstract class BaseEntity {
    //TODO Log field
    protected WebDriver driver;
    private static int step = 1;

    @BeforeClass
    public void before() {
        //TODO logger.initStep(step);
        driver = BrowserFactory.getInstance().getDriver();
        WebDriverManager.maximize(driver);
        //TODO Waiter.fluentWait(driver);


    }

    @AfterClass
    public void turnDown() {
        WebDriverManager.close(driver);
        //TODO logger.makeSeparator();
    }
}
