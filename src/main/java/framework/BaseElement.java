package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Has basic features for webElements
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public abstract class BaseElement extends BaseEntity {
    private List<String> labelList;
    private WebElement element;
    private Actions actions;
    private Action action;
    private String name;
    private By by;

    public BaseElement(By by) {
        this.by = by;
    }

    public BaseElement(String name, By by) {
        this.name = name;
        this.by = by;
    }

    public WebElement getElement(By by) {
        return by != null ? driver.findElement(by) : element;
    }

    public String getElementText(WebElement element) {
        element = getElement(by);
        if (isDisplayed()) {
            return element.getText();
        } else {
            return "";
        }
    }

    public List<WebElement> getElements(By by) {
        return driver.findElements(by);
    }

    public List<String> getTextElements(By by) {
        labelList = new ArrayList<>();
        for (WebElement webElement :
                getElements(by)) {
            labelList.add(getElementText(webElement));
        }
        return labelList;
    }

    public boolean isDisplayed() {
        try {
            element = getElement(by);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void moveToElementAndClick() {
        actions = new Actions(driver);
        actions.moveToElement(getElement(by)).click(getElement(by));
        action = actions.build();
        action.perform();
    }

}
