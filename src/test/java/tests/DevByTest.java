package tests;

import asserts.CustomAssert;
import org.testng.annotations.Test;
import pages.CompanyPage;
import pages.IndexPage;


public class DevByTest extends BaseTest {

    //TODO need to fix ajax request (POST https://companies.dev.by/recaptcha) waitAjax or explicitWait doesn't help, CapabilityGenerator and firefoxdriver too
    @Test
    public void devByTest() {
        IndexPage page = new IndexPage();

        CompanyPage comPage = page.goToCompanies().linkCompany(1);

        // TODO need to fix ajax request
        CustomAssert.verifyCompanyAdditionalInfo(comPage.getCompany());

        // TODO the last 5-th step
//        for (int i = 2; i < 12 ; i++) {
//            comPage.returnToCompanies().linkCompany(i);
//                CustomAssert.verifyCompanyAdditionalInfo(comPage.getCompany());
//        }
    }
}
