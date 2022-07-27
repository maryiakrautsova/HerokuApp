package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TyposPage extends BasePage {

    @FindBy(css = "div[class='example']:nth-child(1) > p")
    private WebElement lineOneText;

    @FindBy(css = "#content > div > p:nth-child(3)")
    private WebElement lineTwoText;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Urls.TYPOS_URL);
    }

    public String getLineOneText() {
        return lineOneText.getText();
    }

    public String getLineTwoText() {
        return lineTwoText.getText();
    }
}
