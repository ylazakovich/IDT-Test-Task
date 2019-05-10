package pages;

import framework.BasePage;
import framework.element.Button;
import org.openqa.selenium.By;

public class CompaniesPage extends BasePage {
    private Button button = new Button(By.xpath("//tbody[@role='alert']/tr[@class='odd' or @class='even']/td[1]"), "Company linkButton");;
    //TODO need Rest getText?
//    private List<String> companyList = button.getTextElements();

    public CompaniesPage() {
        super(By.xpath("//div[@class='t-search']"), "CompanyPage");
    }

    public CompanyPage linkCompany(int index) {
        logger.step("Link company [" + index + "]");
        button.linkButton(index);
        return new CompanyPage(String.valueOf(index));
    }
}
