package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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

    public BasePage(By locator) {
        init(locator);
        //TODO Assert.assertEquals(true, isOpen(locator))
        //TODO info(log.getLogLoc("loc.open.page"))
    }
    //TODO need realize method isOpen(). Create BaseElement
//    public boolean isOpen(By titleLocator) {
//        this.button = new Button(titleLocator);
//        return button.isDisplayed();
//    }

    public void init(By pageLocator) {
        this.locator = pageLocator;
    }

    //TODO use for skip advertisment
    public void escapeFromADB() {
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.SPACE);
    }
}
