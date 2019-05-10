package pages;

import framework.BasePage;
import framework.Waiter;
import framework.element.Button;
import framework.utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {
    //TODO Log logger

    public IndexPage() {
        super(By.xpath("//a[contains(@class, 'icon-button') and contains(@href, 'hello')]"), "Index page");
    }

    public CompanyPage goToCompanies() {
        logger.step("Go to Companies Page");
        Button companyB = new Button(By.xpath("//a[@href='//companies.dev.by']"), "Company button");
        companyB.moveToElementAndClick();
        return new CompanyPage();
    }
}
