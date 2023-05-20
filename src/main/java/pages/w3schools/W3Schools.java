package pages.w3schools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static utilities.ElementActions.*;

public class W3Schools {
    private WebDriver driver;

    public W3Schools(WebDriver driver) {
        this.driver = driver;
    }


    public String getCountryNameByCompany(String company) {
        scrollIntoView(By.xpath("//a[@href='tryit.asp?filename=tryhtml_table_intro']"), driver);
        return getText(By.xpath("(//td[contains(text(),'" + company + "')]/following-sibling::td)[2]"), driver);
    }

}
