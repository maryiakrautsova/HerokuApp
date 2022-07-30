package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

    @Test
    public void uploadFileTest() throws InterruptedException {

        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();

        fileUploadPage.sendFilePath();
        fileUploadPage.uploadFile();
        removeImplicitlyWait();
        String confirmationMessageAfterFileUpload = fileUploadPage.getUploadConfirmationMessage();
        setImplicitlyWait();
        Assert.assertEquals(confirmationMessageAfterFileUpload, "breed-labrador-retriever.jpeg");
    }
}
