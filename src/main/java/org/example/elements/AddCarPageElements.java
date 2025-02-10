package org.example.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCarPageElements extends BaseWebElementActions {
    public AddCarPageElements(WebDriver driver, String endpoint) {
        super(driver, endpoint);
    }

    protected WebElement backButton() {
        return getById("back-btn");
    }

    protected WebElement brandDropdown() {
        return getById("brand-dropdown");
    }

    protected Select brandSelectElement() {
        return new Select(brandDropdown());
    }

    protected WebElement modelTextbox() {
        return getById("model-textbox");
    }

    protected WebElement yearTextbox() {
        return getById("year-textbox");
    }

    protected WebElement readyCheckbox() {
        return getById("ready-checkbox");
    }

    protected WebElement saveCarButton() {
        return getById("save-car-btn");
    }
}