package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropPage extends BasePage {
    @FindBy(id = "draggable")
    private WebElement source;

    @FindBy(id = "droppable")
    private WebElement target;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Urls.DRAG_AND_DROP_URL);
    }

    public void performDragAndDrop() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(source);
        actions.moveToElement(target);
        actions.build();
        actions.perform();
        actions.release();
    }

    public String getChangedText(){
        return target.getText();
    }
}
