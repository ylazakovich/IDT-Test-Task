package pages;

import framework.BasePage;
import model.Company;
import org.openqa.selenium.By;

public class CompanyPage extends BasePage {
    private static Company company;

    public CompanyPage(String nameCompany) {
        super(By.xpath("//div[@class='sidebar-for-companies']"), "The page of company [" + nameCompany + "]");
    }



    public void verifyCompanyInfo() {
        String email;
        String phone;
        String site;
    }
}
