package pages;

import constants.Urls;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FakeDataGenerator;

import java.security.Key;

public class InputsPage extends BasePage {

    @FindBy(css = "div > div:nth-child(1) > div")
    private WebElement inputField;

    @FindBy(css = "#content > div > div > div > input[type=number]")
    private WebElement transformedInputValue;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS_URL);
    }

    public void fillInInputField() {
        inputField.sendKeys(FakeDataGenerator.generateTreeDigitsNumber());
    }

    public void increaseInputValue() {
        inputField.sendKeys(Keys.ARROW_UP);
    }
}
