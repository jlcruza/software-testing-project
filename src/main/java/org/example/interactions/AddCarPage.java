package org.example.interactions;

import org.example.elements.AddCarPageElements;
import org.openqa.selenium.WebDriver;

public class AddCarPage extends AddCarPageElements {
    public AddCarPage(WebDriver driver) {
        super(driver, "/pages/addCar.html");
    }

    public void clickBackButton() {
        clickElement(backButton());
    }

    public void selectBrandWithText(String brandName) {
        selectOptionInElement(brandDropdown(), brandSelectElement(), brandName);
    }

    public void writeInModelSearchBox(String text) {
        writeInElement(modelTextbox(), text);
    }

    public void writeInYearSearchBox(String text) {
        writeInElement(yearTextbox(), text);
    }

    public void clickReadyCheckBox() {
        clickElement(readyCheckbox());
    }

    public void clickSaveButton() {
        clickElement(saveCarButton());
    }
}
