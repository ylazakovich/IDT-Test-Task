package pages;

import framework.BasePage;
import framework.element.Button;
import org.openqa.selenium.By;

public class CompanyPage extends BasePage {
    private Button button;

    public CompanyPage() {
        super(By.xpath("//div[@class='t-search']"), "CompanyPage");
    }

    public void linkCompany(int index) {
        button = new Button(By.xpath("//tr[@class='odd']/td"), "Company linkButton");
        button.linkButton(index);
    }
}
