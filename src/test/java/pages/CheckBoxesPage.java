package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage {
    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement checkBoxOne;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement checkBoxTwo;

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement checkBoxOneButton;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement checkBoxTwoButton;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxesPage() {
        driver.get(Urls.CHECKBOX_URL);
    }

    public boolean isCheckBoxOneUnchecked() {
        return checkBoxOne.isSelected();
    }

    public boolean isCheckBoxTwoChecked() {
        return checkBoxTwo.isSelected();
    }

    public void changeCheckBoxOneStatus() {
        checkBoxOneButton.click();
    }

    public void changeCheckBoxTwoStatus() {
        checkBoxTwoButton.click();
    }
}
