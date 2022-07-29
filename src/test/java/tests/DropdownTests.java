package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTest {
    @Test
    public void selectDropDownOptionTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        List<WebElement> fullList = dropdownPage.getAllElementsFromDropdownList();
        Assert.assertEquals(fullList.size(), 3);
        dropdownPage.selectOptionOne();
        Assert.assertEquals(dropdownPage.isOptionOneSelected(), true, "Option #1 isn't selected.");
        dropdownPage.selectOptionTwo();
        Assert.assertEquals(dropdownPage.isOptionTwoSelected(), true, "Option #1 isn't selected.");
    }
}
