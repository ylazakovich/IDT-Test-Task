package framework;

import framework.utils.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest extends BaseEntity {
    @BeforeClass
    public void before() {
        //TODO logger.initStep(step);
        driver = BrowserFactory.getInstance().getDriver();
        WebDriverManager.maximize(driver);
        Waiter.implicitWait(driver);
    }

    @AfterClass
    public void turnDown() {
        WebDriverManager.close(driver);
        //TODO logger.makeSeparator();
    }
}
