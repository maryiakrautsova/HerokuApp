package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        String useDriver = propertyManager.get("useDriver");
        if (Objects.equals(useDriver, "safari")) {
            System.setProperty("webdriver.Safari.driver", propertyManager.get("PATH_TO_DRIVER_MAC_SAFARI"));
            driver = new SafariDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_DRIVER_MAC_CHROME"));
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
