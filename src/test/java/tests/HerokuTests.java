package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;
import pages.TablesPage;


public class HerokuTests extends BaseTest {

    @Test
    public void addRemoveElementsTest() {

        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickDeleteElement();
        Assert.assertEquals(addRemoveElementsPage.getAmountOfRemainedElements(), 1);
    }

    @Test
    public void firstNameLastNameMatchTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        String lastNameOnPage = tablesPage.getLastName();
        String firstNameOnPage = tablesPage.getFirstName();
        Assert.assertEquals(lastNameOnPage, "Bach");
        Assert.assertEquals(firstNameOnPage, "Frank");
    }

    @Test
    public void dueAndWebsiteMatchTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        String dueValueOnPage = tablesPage.getDueValueOnPage();
        String webSiteValueOnPage = tablesPage.getWebSiteValueOnPage();
        Assert.assertEquals(dueValueOnPage, "$51.0");
        Assert.assertEquals(webSiteValueOnPage, "http://www.frank.com");
    }
}
