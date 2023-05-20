package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.net.URISyntaxException;

import static utilities.ElementActions.*;

public class UploadPage {
    private WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }


    private By uploadBtn = By.id("file-upload");
    private By submitBtn = By.id("file-submit");
    private By successMessage = By.xpath("//div/h3");
    private By fileName = By.id("uploaded-files");

    public void uploadFiles(String filePath) {
        uploadFile(uploadBtn, driver, filePath);
        click(submitBtn, driver);
    }

    public String getSuccessMessage() {
        return getText(successMessage, driver);
    }

    public String getUploadedFilename() {
        return getText(fileName, driver);
    }

}