package pages.w3schools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import static utilities.ElementActions.*;

public class W3Schools {
    private WebDriver driver;

    public W3Schools(WebDriver driver) {
        this.driver = driver;
    }


    public String getCountryNameByCompany(String company) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println(0);
        js.executeScript("window.scrollBy(0,300)");

        return getText(By.xpath("(//td[contains(text(),'" + company + "')]/following-sibling::td)[2]"), driver);
    }

}
