package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablesPage extends BasePage {

    @FindBy(xpath = "//*[@id='table1']//td[text()='fbach@yahoo.com']//parent::tr//td[1]")
    private WebElement lastNameOnPage;

    @FindBy(xpath = "//*[@id='table1']//td[text()='fbach@yahoo.com']//parent::tr//td[2]")
    private WebElement firstNameOnPage;

    @FindBy(xpath = "//*[@id='table2']//td[text()='fbach@yahoo.com']//parent::tr//td[4]")
    private WebElement dueValueOnPage;

    @FindBy(xpath = "//*[@id='table2']//td[text()='fbach@yahoo.com']//parent::tr//td[5]")
    private WebElement webSiteValueOnPage;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(Urls.DATA_TABLES_URL);
    }

    public String getLastName() {
        return lastNameOnPage.getText();
    }

    public String getFirstName() {
        return firstNameOnPage.getText();
    }

    public String getDueValueOnPage() {
        return dueValueOnPage.getText();
    }

    public String getWebSiteValueOnPage() {
        return webSiteValueOnPage.getText();
    }
}
