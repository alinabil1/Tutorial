package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static utilities.ElementActions.*;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    //          ************* Page LOCATORS  ************
    private By SEARCH_RESULTS_PAGE = By.xpath("//a[@aria-label='Page 2']");


    //          ************* METHODS  ************

    // Navigate To Second page of google search results
    public void navigateToSecondResultsPage(int pageNumber) {
        scrollToBottom(driver);
        By element = By.xpath("//a[@aria-label='Page "+pageNumber+"']");
        click(element, driver);
    }

    public String getLinkTextOfSearchResults(int position) {
        By element = By.xpath("(//div[@class='yuRUbf']/a[@jscontroller='M9mgyc'])[" + position + "]");
//        WebElement element = driver.findElement(By.xpath("(//div[@class='yuRUbf']/a[@jscontroller='M9mgyc'])[" + position + "]"));
        return driver.findElement(element).getAttribute("href");
    }

    // get link of each result from the page

    // return link of a given result by its index


}
