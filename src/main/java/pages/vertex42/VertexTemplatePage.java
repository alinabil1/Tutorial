package pages.vertex42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utilities.ElementActions.*;

public class VertexTemplatePage {
    private WebDriver driver;

    public VertexTemplatePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By downloadButton = By.xpath("//a[@href='/Links/go2.php?urlid=file-GanttChart365']");
    private final By dismissAd = By.id("dismiss-button");
    private final By confirmDownloadButton = By.xpath("//a[contains(@href,'gantt-chart_L')]");
    private final By fileName = By.xpath("//span[@class='mono']");

    public void clickdownloadExcelFile() {
        scrollIntoView(By.xpath("//span[@class='sq xlsx']"), driver);
        click(downloadButton, driver);

    }

    public String getFileName() {
        return getText(fileName,driver);
    }

    public void closeAd() throws InterruptedException {
        driver.switchTo().frame("aswift_6");
        click(dismissAd, driver);

    }

    public void confirmDownload() {
        click(confirmDownloadButton, driver);
    }


}
