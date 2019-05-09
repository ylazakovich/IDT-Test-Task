package framework;

import framework.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseEntity {
    //TODO Log field
    private static int step = 1;
    private WebDriver driver;

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
