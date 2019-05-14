package pages;

import framework.BasePage;
import framework.element.Component;
import org.openqa.selenium.By;

public class CompaniesPage extends BasePage {
    private Component link;
    private CompanyPage companyPage;

    public CompaniesPage() {
        super(By.xpath("//div[@class='t-search']"), "Companies Page");
    }

    public CompanyPage linkCompany(int index) {
        link = new Component(By.xpath("//tbody[@role='alert']/tr[" + index +"]/td/a"), "Company linkButton");
        String companyName = link.getElementText();
        logger.step("Link company [" + companyName + "]");
        link.moveToElementAndClick();
        companyPage = new CompanyPage(companyName);
        return companyPage;
    }


    public CompanyPage getCompanyPage() {
        return companyPage;
    }
}
