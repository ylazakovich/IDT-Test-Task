package pages;

import framework.BasePage;
import framework.Waiter;
import framework.element.TextField;
import labels.TextBox;
import model.Company;
import org.openqa.selenium.By;


public class CompanyPage extends BasePage {
    private Company company;
    private TextField emailField;
    private TextField phoneField;
    private TextField websiteField;
    private TextBox infoBox = new TextBox();

    public CompanyPage(String nameCompany) {
        super(By.xpath("//ul/li[contains(text(),'Сайт')]/a"), "The page of company [" + nameCompany + "]");
        logger.step("get additional infomation about company[email,phone,website]");
        Waiter.waitForAjax();
        getAdditionalInfo();
        company = new Company(nameCompany);
        company.setEmail(infoBox.getTextFields().get(0));
        company.setPhone(infoBox.getTextFields().get(1));
        company.setWebsite(infoBox.getTextFields().get(2));
    }

    public Company getCompany() {
        return company;
    }

    public TextBox getInfoBox() {
        return infoBox;
    }

    private TextBox getAdditionalInfo() {
        emailField = new TextField(By.xpath("//ul/li[contains(text(),'почта')]/span"));
        phoneField = new TextField(By.xpath("//ul/li[contains(text(),'Телефон')]/span[contains(text(),'375')]"));
        websiteField = new TextField(By.xpath("//ul/li[contains(text(),'Сайт')]/a"));
        infoBox.addTextField(emailField);
        infoBox.addTextField(phoneField);
        infoBox.addTextField(websiteField);
        return infoBox;
    }
}
