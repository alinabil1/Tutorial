package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.w3schools.W3Schools;


public class W3schoolsTests extends TestBase {

    String W3school_url = "https://www.w3schools.com/html/html_tables.asp";


    @Test
    public void verifyCountryNameForCompany() {
        driver.get(W3school_url);
        W3Schools w3Schools = new W3Schools(driver);
        String x = w3Schools.getCountryNameByCompany("Ernst Handel");
        Assert.assertEquals(x, "Austria");
    }
}
