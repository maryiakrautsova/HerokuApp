package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTest {
    @Test
    public void dragAndDropTest() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.performDragAndDrop();
        String changedText = dragAndDropPage.getChangedText();
        Assert.assertEquals(changedText, "Dropped!");
    }
}
