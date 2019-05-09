package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    //TODO Log logger
    private static By indexPageLocator = By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]");

    public IndexPage() {
        super(indexPageLocator);
    }

    public static By getIndexPageLocator() {
        return indexPageLocator;
    }
}
