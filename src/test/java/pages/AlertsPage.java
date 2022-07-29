package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    @FindBy(css = "li:nth-child(1) > button")
    private WebElement clickForJSAlertButton;

    @FindBy(css = "li:nth-child(2) > button")
    private WebElement clickForJSConfirmButton;

    @FindBy(css = "li:nth-child(3) > button")
    private WebElement clickForJSPromptButton;

    @FindBy(id = "result")
    private WebElement sentText;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(Urls.ALERTS_URL);
    }

    public void clickClickForJSAlertButton() {
        clickForJSAlertButton.click();
    }

    public void clickClickForJSConfirmButton() {
        clickForJSConfirmButton.click();
    }

    public void clickClickForJSPromptButton() {
        clickForJSPromptButton.click();
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void closeAlertAccept() {
        driver.switchTo().alert().accept();
    }

    public void closeAlertDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void sendMessage() {
        driver.switchTo().alert().sendKeys("My message.");
    }

    public String getSentMessageText() {
        return sentText.getText();
    }
}
