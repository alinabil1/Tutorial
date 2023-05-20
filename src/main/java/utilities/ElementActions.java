package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ElementActions {
    private WebDriver driver;

    public ElementActions(WebDriver driver) {
        this.driver = driver;
    }


    public static void click(By element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }


    public static void clearText(By element, WebDriver driver) {
        driver.findElement(element).clear();
    }

    public static void setText(By element, String Text, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        clearText(element, driver);
        driver.findElement(element).sendKeys(Text);
    }

    public static void uploadFile(By element, WebDriver driver, String path) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        driver.findElement(element).sendKeys(path);
    }

    public static String getText(By element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).getText();
    }

    public static void scrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollToBottom");
    }

    public static void scrollIntoView(By element, WebDriver driver) {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement webelement = driver.findElement(element);
        actions.moveToElement(webelement);
        actions.perform();
    }

    public static void clickKeyboardKey(WebDriver driver, Keys key) {
        Actions builder = new Actions(driver);
        builder.sendKeys(key).perform();
    }


}
