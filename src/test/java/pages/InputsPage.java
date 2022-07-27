package pages;

import constants.Urls;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FakeDataGenerator;

public class InputsPage extends BasePage {

    @FindBy(xpath = "//input")
    private WebElement inputField;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS_URL);
    }

    public void fillInWithPositiveValueInputField() {
        inputField.sendKeys(FakeDataGenerator.generatePositiveTreeDigitsNumber());
    }

    public void fillInWithNegativeValueInputField() {
        inputField.sendKeys(FakeDataGenerator.generateNegativeTwoDigitsNumber());
    }

    public void fillInWithPositiveNonIntValueInputField() {
        inputField.sendKeys(FakeDataGenerator.generatePositiveNonIntegerNumber());
    }

    public void fillInWithNegativeNonIntValueInputField() {
        inputField.sendKeys(FakeDataGenerator.generateNegativeNonIntegerNumber());
    }

    public void increaseInputValue() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void decreaseInputValue() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String getInputValue() {
        return inputField.getAttribute("value");
    }

    public Integer parseInputStringValueToInt() {
        String inputValue = this.getInputValue();
        try {
            int inputValueInt = Integer.parseInt(inputValue.trim());
            return inputValueInt;
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            return -1;
        }
    }

    public Double parseInputNonIntStringValueToDouble() {
        String inputValue = this.getInputValue();
        try {
            Double inputValueDouble = Double.parseDouble(inputValue);
            return inputValueDouble;
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            return null;
        }
    }
}
