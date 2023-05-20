package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ElementActions;

import static utilities.ElementActions.click;

public class CheckboxesPage {
    private WebDriver driver;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }


    private By checkbox1 = By.xpath("(//form/input)[1]");
    private By checkbox2 = By.xpath("(//form/input)[2]");

    public void clickFirstCheckbox() {
        click(checkbox1, driver);
    }

    public boolean IsChecked(By checkbox) {
        WebElement input = driver.findElement(checkbox);
        return isAttribtuePresent(input, "checked");
    }

    public boolean AreBothCheckboxesClicked() {
        if (IsChecked(checkbox1) && IsChecked(checkbox2))
            return true;
        else return false;
    }

    private boolean isAttribtuePresent(WebElement element, String attribute) {
        boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }

        return result;
    }

}
