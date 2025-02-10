package org.example.interactions;

import org.example.elements.IndexPageElements;
import org.openqa.selenium.WebDriver;

public class IndexPage extends IndexPageElements {

    public IndexPage(WebDriver driver) {
        super(driver, "index.html");
    }

    public void clickAddCarButton() {
        clickElement(addCarButton());
    }

    public void writeInBrandSearchBox(String text) {
        writeInElement(brandSearchBar(), text);
    }

    public void clickBrandSearchButton() {
        clickElement(brandSearchButton());
    }

    public void clickBrandClearButton() {
        clickElement(brandClearButton());
    }

    public void writeInModelSearchBox(String text) {
        writeInElement(modelSearchBar(), text);
    }

    public void clickModelSearchButton() {
        clickElement(modelSearchButton());
    }

    public void clickModelClearButton() {
        clickElement(modelClearButton());
    }

    public void writeInYearSearchBox(String text) {
        writeInElement(yearSearchBar(), text);
    }

    public void clickYearSearchButton() {
        clickElement(yearSearchButton());
    }

    public void clickYearClearButton() {
        clickElement(yearClearButton());
    }
}