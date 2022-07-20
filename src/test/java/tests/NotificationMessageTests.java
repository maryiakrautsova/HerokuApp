package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NotificationMessageTests extends BaseTest {
    @Test
    public void notificationSuccessfulByClickTest() {
        driver.get(Urls.NOTIFICATION_MSG_URL);

        //click on 'Click here'
        driver.findElement(By.cssSelector("a[href='/notification_message']")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //compare alert
        String notificationMessage =
                driver.findElement(By.xpath("//*[@id=\"flash\"]/text()")).getText();
        Assert.assertEquals(notificationMessage.trim(), "Action successful");
    }
}
