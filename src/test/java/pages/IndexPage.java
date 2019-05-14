package pages;

import framework.BasePage;
import framework.element.Component;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    private Component linkToCompanies;

    public IndexPage() {
        super(By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]"), "Index page");
    }

    public CompaniesPage goToCompanies() {
        logger.step("Go to Companies Page");
        linkToCompanies = new Component(By.xpath("//a[@href='//companies.dev.by']"), "Companies button");
        linkToCompanies.moveToElementAndClick();
        return new CompaniesPage();
    }
}
