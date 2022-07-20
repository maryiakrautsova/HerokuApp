package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxesTests extends BaseTest {
    @Test
    public void checkboxOneCanBeCheckedTest() {
        driver.get(Urls.CHECKBOX_URL);

        //checkbox one is unchecked
        Boolean checkBoxOneUnchecked =
                driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
        Assert.assertFalse(false);

        //checkbox two is checked
        Boolean checkBoxTwoChecked =
                driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertTrue(true);

        //set checkbox one to checked
        driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //checkbox one is checked
        Boolean checkBoxOneAfterSettingChecked =
                driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
        Assert.assertFalse(false);
    }

    @Test
    public void checkboxTwoCanBeUncheckedTest() {
        driver.get(Urls.CHECKBOX_URL);

        //checkbox two is checked
        Boolean checkBoxTwoChecked =
                driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertTrue(true);

        //set checkbox two to unchecked
        driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //checkbox two is unchecked
        Boolean checkBoxTwoAfterSettingUnchecked =
                driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertFalse(false);
    }
}
