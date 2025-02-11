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

    public String getPopupCarBrand()
    {
        return getSelectedOption(popupSelectBrand());
    }
    public String getPopupCarModel()
    {
        return getTextFromElement(popupCardText());
    }
    public String getPopupCarYear()
    {
        return getTextFromElement(popupCardYear());
    }

    public void clickPopupUpdateButton(){
        clickElement(popupCardUpdateButton());
    }

    public void clickPopupDeleteButton(){
        clickElement(popupCardDeleteButton());
    }

    public void selectBrandInPopup(String brand){
        selectOptionInElement(popupCardHeader(), popupSelectBrand(), brand);
    }

    public void writeModelInPopup(String model){
        writeInElement(popupCardText(), model);
    }

    public void writeYearInPopup(String year){
        writeInElement(popupCardYear(), year);
    }
}