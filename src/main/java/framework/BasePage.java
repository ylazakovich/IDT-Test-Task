package framework;

import framework.pageElements.Button;
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
    //TODO Log field
    //TODO private Button button;
    private By locator;
    private Button button;

    public BasePage(By locator) {
        init(locator);
        Assert.assertEquals(true, isOpen(locator));
        //TODO info(log.getLogLoc("loc.open.page"))
    }

    public boolean isOpen(By titleLocator) {
        this.button = new Button(titleLocator);
        return button.isDisplayed();
    }

    private void init(By pageLocator) {
        this.locator = pageLocator;
    }

    //TODO use for skip advertisment
    public void escapeFromADB() {
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.SPACE);
    }
}
