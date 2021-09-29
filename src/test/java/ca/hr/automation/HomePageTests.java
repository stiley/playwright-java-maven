package ca.hr.automation;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class HomePageTests extends BaseTest {
    @Test
    public void validateHomePageTitle() {
        String pTitle = homePage.getPageTitle();
        assertTrue(pTitle.contains("Cloud, Computers, App & Gaming"), "Page title did not include expected text - "+ pTitle);
    }
}