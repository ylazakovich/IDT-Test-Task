package framework;

import org.openqa.selenium.WebDriver;

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
}
