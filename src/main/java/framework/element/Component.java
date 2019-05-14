package framework.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Has basic features for Button element
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class Component extends BaseElement {

    public Component(By by) {
        super(by);
    }

    public Component(By by, String name) {
        super(name, by);
    }

}
