package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagePage extends BasePage {

    @FindBy(css = "a[href='/notification_message']")
    private WebElement clickHereButton;

    @FindBy(xpath = "//*[@id=\"flash\"]/text()")
    private WebElement notificationMessage;

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_MSG_URL);
    }

    public void clickClickHereButton(){
        clickHereButton.click();
    }

    public String getNotificationMessage() {
        return notificationMessage.getText();
    }
}
