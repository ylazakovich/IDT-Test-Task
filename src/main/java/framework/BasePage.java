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
    private By locator;
    private String tittle;
    private Button button;

    public BasePage(By locator, String tittle) {
        init(locator, tittle);
        Assert.assertTrue(isOpen(locator));
        logger.info(logger.getLoc("loc.open.page"));
    }

    public boolean isOpen(By titleLocator) {
        this.button = new Button(titleLocator);
        return button.isDisplayed();
    }

    private void init(By pageLocator, String tittle) {
        this.locator = pageLocator;
        this.tittle = tittle;
    }
}
