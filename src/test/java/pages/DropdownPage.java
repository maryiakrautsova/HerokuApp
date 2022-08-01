package pages;

import constants.Urls;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdownField;

    @FindBy(css = "option:nth-child(2)")
    private WebElement optionOneFromDropdownList;

    @FindBy(css = "option:nth-child(3)")
    private WebElement optionTwoFromDropdownList;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownPage() {
        driver.get(Urls.DROPDOWN_LIST_URL);
    }

    public List<WebElement> getAllElementsFromDropdownList() {
        Select select = new Select(dropdownField);
        return select.getOptions();
    }

    public void selectOptionOne() {
        Select select = new Select(dropdownField);
        select.selectByVisibleText("Option 1");
    }

    public void selectOptionTwo() {
        Select select = new Select(dropdownField);
        select.selectByVisibleText("Option 2");
    }

    public boolean isOptionOneSelected() {
        Select select = new Select(dropdownField);
        return optionOneFromDropdownList.isSelected();
    }

    public boolean isOptionTwoSelected() {
        Select select = new Select(dropdownField);
        return optionTwoFromDropdownList.isSelected();
    }
}
