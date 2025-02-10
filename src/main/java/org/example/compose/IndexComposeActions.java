package org.example.compose;

import org.example.interactions.IndexPage;
import org.openqa.selenium.WebDriver;

public class IndexComposeActions extends IndexPage {
    public IndexComposeActions(WebDriver driver) {
        super(driver);
    }

    public void searchBrand(String brandName) {
        writeInBrandSearchBox(brandName);
        clickBrandSearchButton();
    }

    public void searchModel(String modelName) {
        writeInModelSearchBox(modelName);
        clickModelSearchButton();
    }

    public void searchYear(String year) {
        writeInYearSearchBox(year);
        clickYearSearchButton();
    }

    public void clearAllSearchbar(){
        clickBrandClearButton();
        clickModelClearButton();
        clickYearClearButton();
    }
}
