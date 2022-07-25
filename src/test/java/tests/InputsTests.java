package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InputsTests extends BaseTest {
    @Test
    public void inputPositiveIntegerAndIncreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("123");

        //increase input digit
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys(Keys.ARROW_UP);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value

        WebElement ele = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('#content input[type=\"number\"]').shadowRoot.querySelector('#editing-view-port > div')");

//        WebElement shadowHost = driver.findElement(By.cssSelector("#content input[type=number]"));
//        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
//        WebElement shadowRoot = (WebElement) jsDriver.executeScript("return arguments[0].shadowRoot", shadowHost);
//        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#editing-view-port > div"));


        Assert.assertEquals(ele.getText(), "124");
    }

    @Test
    public void inputPositiveIntegerAndDecreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("123");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_DOWN);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "122");
    }

    @Test
    public void inputNegativeIntegerAndIncreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("-3");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_UP);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "-2");
    }

    @Test
    public void inputNegativeIntegerAndDecreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("-10");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_DOWN);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "-11");
    }

    @Test
    public void inputPositiveNonIntegerAndIncreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("1.2");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_UP);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "2");
    }

    @Test
    public void inputPositiveNonIntegerAndDereaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("5.5");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_DOWN);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "4");
    }

    @Test
    public void inputNegativeNonIntegerAndIncreaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("-1.2");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_UP);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "-1");
    }

    @Test
    public void inputNegativeNonIntegerAndDereaseValueTest() {
        driver.get(Urls.INPUTS_URL);

        //input digit (integer)
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys("-5.5");

        //increase input digit
        driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).sendKeys(Keys.ARROW_DOWN);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //check digit value
        String digitAfterArrowUp =
                driver.findElement(By.cssSelector("div > div:nth-child(1) > div")).getText();
        Assert.assertEquals(digitAfterArrowUp, "-6");
    }
}
