package org.example.compose;

import org.example.dto.TestDataModel;
import org.example.interactions.AddCarPage;
import org.openqa.selenium.WebDriver;

public class AddCarComposeActions extends AddCarPage {
    public AddCarComposeActions(WebDriver driver) {
        super(driver);
    }

    public void fillForm(TestDataModel newCar) {
        selectBrandWithText(newCar.getBrand());
        writeInModelSearchBox(newCar.getModel());
        writeInYearSearchBox(newCar.getYear());
        clickReadyCheckBox();
    }
}
