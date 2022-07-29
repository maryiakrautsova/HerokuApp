package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

    @Test
    public void uploadFileTest() {

        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();

        fileUploadPage.sendFilePath();
        fileUploadPage.uploadFile();

        String confirmationMessageAfterFileUpload = fileUploadPage.getUploadConfirmationMessage();
        Assert.assertEquals(confirmationMessageAfterFileUpload, "breed-labrador-retriever.jpeg");
    }
}
