package pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class CompanyPage extends BasePage {
    public CompanyPage() {
        super(By.xpath("//div[@class='t-search']"), "CompanyPage");
    }
}
