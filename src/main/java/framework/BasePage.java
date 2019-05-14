package framework;

import framework.element.Component;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Realizes PageObject pattern
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */

public abstract class BasePage extends BaseEntity {
    private By pageLocator;
    private String title;
    private Component component;

    public BasePage(By locator, String tittle) {
        init(locator, tittle);
        logger.info(logger.getLoc("loc.open.page") + " [" + tittle + "]");
        Assert.assertTrue(isOpen());
    }

    public boolean isOpen() {
        this.component = new Component(pageLocator);
        return component.isDisplayed();
    }

    private void init(By locator, String title) {
        this.pageLocator = locator;
        this.title = title;
    }
}
