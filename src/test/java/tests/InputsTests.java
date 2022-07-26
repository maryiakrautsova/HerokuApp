package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTests extends BaseTest {

    @Test
    public void inputPositiveIntegerAndIncreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithPositiveValueInputField();
        Integer initialInputValueInt = inputsPage.parseInputStringValueToInt();
        inputsPage.increaseInputValue();
        Integer inputValueAfterArrowUpInt = inputsPage.parseInputStringValueToInt();
        Integer diffBetweenInputs = inputValueAfterArrowUpInt - initialInputValueInt;
        Assert.assertEquals(diffBetweenInputs.intValue(), 1);
    }

    @Test
    public void inputPositiveIntegerAndDecreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithPositiveValueInputField();
        Integer initialInputValueInt = inputsPage.parseInputStringValueToInt();
        inputsPage.decreaseInputValue();
        Integer inputValueAfterArrowDownInt = inputsPage.parseInputStringValueToInt();
        Integer diffBetweenInputs = initialInputValueInt - inputValueAfterArrowDownInt;
        Assert.assertEquals(diffBetweenInputs.intValue(), 1);
    }

    @Test
    public void inputNegativeIntegerAndIncreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithNegativeValueInputField();
        Integer initialInputValueInt = inputsPage.parseInputStringValueToInt();
        inputsPage.increaseInputValue();
        Integer inputValueAfterArrowUpInt = inputsPage.parseInputStringValueToInt();
        Integer diffBetweenInputs = initialInputValueInt - inputValueAfterArrowUpInt;
        Assert.assertEquals(diffBetweenInputs.intValue(), -1);
    }

    @Test
    public void inputNegativeIntegerAndDecreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithNegativeValueInputField();
        Integer initialInputValueInt = inputsPage.parseInputStringValueToInt();
        inputsPage.decreaseInputValue();
        Integer inputValueAfterArrowDownInt = inputsPage.parseInputStringValueToInt();
        Integer diffBetweenInputs = initialInputValueInt - inputValueAfterArrowDownInt;
        Assert.assertEquals(diffBetweenInputs.intValue(), 1);
    }

    @Test
    public void inputPositiveNonIntegerAndIncreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithPositiveNonIntValueInputField();
        Double initialInputValueDouble = inputsPage.parseInputNonIntStringValueToDouble();
        inputsPage.increaseInputValue();
        Double inputValueAfterArrowUpDouble = inputsPage.parseInputNonIntStringValueToDouble();
        Double potentiallyExpected = Math.floor(initialInputValueDouble) + 1;
        Assert.assertEquals(inputValueAfterArrowUpDouble, potentiallyExpected);
    }

    @Test
    public void inputPositiveNonIntegerAndDecreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithPositiveNonIntValueInputField();
        inputsPage.decreaseInputValue();
        Double inputValueAfterArrowDownDouble = inputsPage.parseInputNonIntStringValueToDouble();
        Double potentiallyExpected = Math.floor(inputValueAfterArrowDownDouble);
        Assert.assertEquals(inputValueAfterArrowDownDouble, potentiallyExpected);
    }

    @Test
    public void inputNegativeNonIntegerAndIncreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithNegativeNonIntValueInputField();
        Double initialInputValueDouble = inputsPage.parseInputNonIntStringValueToDouble();
        inputsPage.increaseInputValue();
        Double inputValueAfterArrowUpDouble = inputsPage.parseInputNonIntStringValueToDouble();
        Double potentiallyExpected = Math.floor(initialInputValueDouble) + 1;
        Assert.assertEquals(inputValueAfterArrowUpDouble, potentiallyExpected);
    }

    @Test
    public void inputNegativeNonIntegerAndDecreaseValueTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.fillInWithNegativeNonIntValueInputField();
        inputsPage.decreaseInputValue();
        Double inputValueAfterArrowDownDouble = inputsPage.parseInputNonIntStringValueToDouble();
        Double potentiallyExpected = Math.floor(inputValueAfterArrowDownDouble);
        Assert.assertEquals(inputValueAfterArrowDownDouble, potentiallyExpected);
    }
}
