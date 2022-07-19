package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HerokuTests extends BaseTest {

    @Test
    public void addRemoveElementsTest() {
        driver.get(Urls.ADD_REMOVE_URL);

        //add element #1
        driver.findElement(By.cssSelector(".example > button")).click();

        //add element #2
        driver.findElement(By.cssSelector(".example > button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //remove element
        driver.findElement(By.cssSelector("button[class='added-manually']")).click();

        //get amount of remained elements
        List<WebElement> collection = driver.findElements(By.cssSelector(".added-manually"));
        Assert.assertEquals(collection.size(), 1);
    }

    @Test
    public void firstNameLastNameMatchTest() {
        driver.get(Urls.DATA_TABLES_URL);

        //check last name
        String lastNameOnPage =
                driver.findElement(By.xpath("//*[@id='table1']//td[text()='fbach@yahoo.com']//parent::tr//td[1]")).getText();
        Assert.assertEquals(lastNameOnPage, "Bach");

        //check first name
        String firstNameOnPage =
                driver.findElement(By.xpath("//*[@id='table1']//td[text()='fbach@yahoo.com']//parent::tr//td[2]")).getText();
        Assert.assertEquals(firstNameOnPage, "Frank");
    }

    @Test
    public void dueAndWebsiteMatchTest() {
        driver.get(Urls.DATA_TABLES_URL);

        //check due
        String dueValueOnPage =
                driver.findElement(By.xpath("//*[@id='table2']//td[text()='fbach@yahoo.com']//parent::tr//td[4]")).getText();
        Assert.assertEquals(dueValueOnPage, "$51.0");

        //check website
        String webSiteValueOnPage =
                driver.findElement(By.xpath("//*[@id='table2']//td[text()='fbach@yahoo.com']//parent::tr//td[5]")).getText();
        Assert.assertEquals(webSiteValueOnPage, "http://www.frank.com");
    }
}
