package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTests extends BaseTest {
    @Test
    public void checkboxOneCanBeCheckedTest() {
        driver.get(Urls.TYPOS_URL);

        //check line #1 of paragraph
        String lineOneText =
                driver.findElement(By.cssSelector("div[class='example']:nth-child(1) > p")).getText();

        //check line #2 of paragraph
        String lineTwoText =
                driver.findElement(By.cssSelector("#content > div > p:nth-child(3)")).getText();

        Assert.assertEquals(lineOneText, "This example demonstrates a typo being introduced. It does it randomly on each page load.");

        Assert.assertEquals(lineTwoText.trim(), "Sometimes you'll see a typo, other times you won't.");

    }
}
