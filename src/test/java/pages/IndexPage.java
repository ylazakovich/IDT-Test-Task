package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    //TODO Log logger

    public IndexPage() {
        super(By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]"), "Index Page");
    }

}
