package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.google.GoogleSearchPage;
import pages.google.SearchResultsPage;

import static utilities.ElementActions.clickKeyboardKey;

public class TestGoogleSearch extends TestBase {
    String app_url = "https://www.google.com";

    @DataProvider(name = "searchData")
    public static Object[][] data() {
        return new Object[][]{{2, 2, "https://www.javatpoint.com/selenium-tutorial"},
                {3, 2, "https://www.tutorialspoint.com/selenium/index.htm"}};
    }

    @Test(dataProvider = "searchData")
    public void verifySearchResults(int pageNumber, int position, String expectedLink) {
        driver.get(app_url);
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchGoogle("selenium tutorial");
        clickKeyboardKey(driver, Keys.ENTER);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.navigateToSecondResultsPage(pageNumber);
        String DesiredResultsLinkText = searchResultsPage.getLinkTextOfSearchResults(position);
        Assert.assertEquals(DesiredResultsLinkText, expectedLink);

    }


}
