package pages;

import framework.BasePage;
import framework.element.TextField;
import labels.TextBox;
import model.Company;
import org.openqa.selenium.By;

public class CompanyPage extends BasePage {
    private static Company company;
    private static TextBox infoBox;
    private TextField emailField;
    private TextField phoneField;
    private TextField websiteField;


    public CompanyPage(String nameCompany) {
        super(By.xpath("//div[@class='sidebar-for-companies']"), "The page of company [" + nameCompany + "]");
        company = new Company(nameCompany);
        emailField = new TextField(By.xpath("//ul/li[contains(text(),'почта')]/span"));
        phoneField = new TextField(By.xpath("//ul/li[contains(text(),'Телефон')]/span"));
        websiteField = new TextField(By.xpath("//ul/li[contains(text(),'Сайт')]/a"));
        infoBox.addTextField(emailField);
        infoBox.addTextField(phoneField);
        infoBox.addTextField(websiteField);
    }

    public static Company getCompany() {
        return company;
    }
}
