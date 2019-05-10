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

    public Button(By by) {
        super(by);
    }

    public Button(By by, String name) {
        super(name, by);
    }

    public void linkButton(int index) {
        moveToElementAndClick(index);
    }
}
