package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

import java.util.concurrent.TimeUnit;

public class NotificationMessageTests extends BaseTest {
    @Test
    public void notificationSuccessfulByClickTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickClickHereButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String notificationMessage = notificationMessagePage.getNotificationMessage();
        Assert.assertEquals(notificationMessage.trim(), "Action successful");
    }
}
