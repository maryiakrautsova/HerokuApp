package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTest {

    @Test
    public void clickForJSAlertAndClose() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickClickForJSAlertButton();
        String alertMessage = alertsPage.getAlertMessage();
        alertsPage.closeAlertAccept();
        Assert.assertEquals(alertMessage, "I am a JS Alert");
    }

    @Test
    public void clickForJSConfirmAndDismiss() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickClickForJSConfirmButton();
        String alertMessage = alertsPage.getAlertMessage();
        alertsPage.closeAlertDismiss();
        Assert.assertEquals(alertMessage, "I am a JS Confirm");
    }

    @Test
    public void clickForJSPromptAndSendMessage() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickClickForJSPromptButton();
        alertsPage.sendMessage();
        alertsPage.closeAlertAccept();
        String sentMessage = alertsPage.getSentMessageText();
        Assert.assertEquals(sentMessage, "You entered: My message.");
    }
}
