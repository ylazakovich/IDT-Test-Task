package tests;

import framework.BaseTest;
import org.testng.annotations.Test;
import pageobjects.IndexPage;

public class MainTest extends BaseTest {
    private IndexPage page;

    @Test
    public void run() {
        page = new IndexPage();
    }
}
