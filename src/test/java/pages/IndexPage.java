package pages;

import framework.BasePage;
import framework.element.Button;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    private Button button;

    public IndexPage() {
        super(By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]"), "Index page");
    }

    public CompaniesPage goToCompanies() {
        logger.step("Go to Companies Page");
        button = new Button(By.xpath("//a[@href='//companies.dev.by']"), "Company button");
        button.moveToElementAndClick();

        return new CompaniesPage();
    }
}
