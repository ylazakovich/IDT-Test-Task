package classes;

import framework.BaseTest;
import org.testng.annotations.Test;
import pages.IndexPage;

public class MainTest extends BaseTest {
    private IndexPage page;

    @Test
    public void run() {
        page = new IndexPage();
    }
}
