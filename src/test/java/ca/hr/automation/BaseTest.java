package ca.hr.automation;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeClass;
import ca.hr.automation.pages.HomePage;
import com.microsoft.playwright.options.*;
import com.microsoft.playwright.*;

public class BaseTest {

    private Browser browser;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(true)
                .setSlowMo(1000)
        );

        Page page = browser.newPage();
        page.navigate("https://www.microsoft.com/en-us/");
        homePage = new HomePage(page);

    }

}
