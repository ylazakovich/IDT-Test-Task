package framework.element;

import org.openqa.selenium.By;

public class TextField extends BaseElement {
    public TextField(By by) {
        super(by);
    }

    public TextField(String name, By by) {
        super(name, by);
    }

    public String getText() {
        return getElementText();
    }
}
