package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.ElementActions.*;


public class GoogleSearchPage {

    public WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    //          ************* Page LOCATORS  ************
    private By SEARCH_BAR = By.id("APjFqb");


    //          ************* METHODS  ************

    // sending the search text
    public void searchGoogle(String searchText) {
        setText(SEARCH_BAR, searchText, driver);
    }
}
