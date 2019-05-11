package pages;

import framework.BasePage;
import framework.element.Component;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    private Component component;

    public IndexPage() {
        super(By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]"), "Index page");
    }

    public CompaniesPage goToCompanies() {
        logger.step("Go to Companies Page");
        component = new Component(By.xpath("//a[@href='//companies.dev.by']"), "Company button");
        component.moveToElementAndClick();

        return new CompaniesPage();
    }
}
