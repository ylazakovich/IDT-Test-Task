package framework.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Has basic features for Button element
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class Button extends BaseElement {
    private static WebElement element;

    public Button(By by) {
        super(by);
    }

    public void click() {
        moveToElementAndClick();
    }

}
