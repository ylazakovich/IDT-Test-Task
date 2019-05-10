package framework;

import framework.element.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
    private Button button;

    public BasePage(By locator, String tittle) {
        init(locator, tittle);
        logger.info(logger.getLoc("loc.open.page") + " [" + tittle + "]");
        Assert.assertTrue(isOpen());
    }

    public boolean isOpen() {
        this.button = new Button(pageLocator);
        return button.isDisplayed();
    }

    private void init(By locator, String title) {
        this.pageLocator = locator;
        this.title = title;
    }
}
