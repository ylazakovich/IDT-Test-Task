package pages;

import framework.BasePage;
import framework.element.Component;
import org.openqa.selenium.By;

import java.util.List;

public class CompaniesPage extends BasePage {
    private Component component = new Component(By.xpath("//tbody[@role='alert']/tr[@class='odd' or @class='even']/td[1]"), "Company linkButton");;
    //TODO need Rest getText?
    private List<String> companyList = component.getTextElements();
    private CompanyPage companyPage;

    public CompaniesPage() {
        super(By.xpath("//div[@class='t-search']"), "Companies Page");
    }

    public CompanyPage linkCompany(int index) {
        logger.step("Link company [" + index + "]");
        component.linkButton(index);
        companyPage = new CompanyPage(companyList.get(index));
        return companyPage;
    }

    public List<String> getCompanyList() {
        return companyList;
    }

    public CompanyPage getCompanyPage() {
        return companyPage;
    }
}
