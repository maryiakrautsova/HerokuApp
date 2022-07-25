package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTests extends BaseTest {
    @Test
    public void checkboxOneCanBeCheckedTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        String lineOneText = typosPage.getLineOneText();
        String lineTwoText = typosPage.getLineTwoText();
        Assert.assertEquals(lineOneText, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        Assert.assertEquals(lineTwoText.trim(), "Sometimes you'll see a typo, other times you won't.");
    }
}
