package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class FileUploadPage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadConfirmationText;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(Urls.FILE_UPLOAD_URL);
    }

    public void sendFilePath() {
        String path = System.getProperty("user.dir").concat("/src/test/resources/breed-labrador-retriever.jpeg");
        chooseFileButton.sendKeys(path);
    }

    public void uploadFile() {
        uploadButton.click();
    }

    public String getUploadConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        By confirmationTextLocator = By.id("uploaded-files");
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationTextLocator));
        return uploadConfirmationText.getText().trim();
    }
}
