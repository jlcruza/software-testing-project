package org.example.tests;

import org.example.data.IndexTestData;
import org.example.data.PreLoadedData;
import org.example.dto.ResultCard;
import org.example.dto.TestDataModel;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IndexTests extends BaseTest {

    @Test
    public void testFilterByBrand() {
        // Arrange
        TestDataModel preLoadedCar = PreLoadedData.getPreloadedToyota();
        int expectedCardCount = 1;

        // Act
        indexComposeActions.clearAllSearchbar();
        indexComposeActions.writeInBrandSearchBox(preLoadedCar.getBrand());
        indexComposeActions.clickBrandSearchButton();

        // Assert
        Assert.assertEquals(expectedCardCount, indexComposeActions.getResultCardCount());
        Assert.assertEquals(preLoadedCar.getBrand(), indexComposeActions.getFirstCard().getTitle());
    }


    // BUG 1: No filter
    @Test
    public void testFilterByModel() {
        // Arrange
        TestDataModel preLoadedCar = PreLoadedData.getPreloadedMazda();
        int expectedCardCount = 1;

        // Act
        indexComposeActions.clearAllSearchbar();
        indexComposeActions.writeInModelSearchBox(preLoadedCar.getModel());
        indexComposeActions.clickModelSearchButton();

        // Assert
        Assert.assertEquals(expectedCardCount, indexComposeActions.getResultCardCount());
        Assert.assertEquals(preLoadedCar.getBrand(), indexComposeActions.getFirstCard().getTitle());
    }

    @Test
    public void testFilterByYear() {
        // Arrange
        TestDataModel preLoadedCar = PreLoadedData.getPreloadedAudi();
        int expectedCardCount = 1;

        // Act
        indexComposeActions.clearAllSearchbar();
        indexComposeActions.writeInYearSearchBox(preLoadedCar.getYear());
        indexComposeActions.clickYearSearchButton();

        // Assert
        Assert.assertEquals(expectedCardCount, indexComposeActions.getResultCardCount());
        Assert.assertEquals(preLoadedCar.getBrand(), indexComposeActions.getFirstCard().getTitle());
    }


    // BUG 2: Wrong Year
    @Test
    public void testAddNewCar() {
        // Arrange
        TestDataModel newCar = IndexTestData.getTestData1();
        int newCarIndex = 4;
        int expectedCardCount = PreLoadedData.getPreloadedDataLength() + 1;

        // Act
        indexComposeActions.clickAddCarButton();
        addCarComposeActions.fillForm(newCar);
        addCarComposeActions.clickSaveButton();
        indexComposeActions.goToEndOfPage();

        // Assert
        Assert.assertEquals(expectedCardCount, indexComposeActions.getResultCardCount());

        indexComposeActions.clickResultCardByIndex(newCarIndex);

        Assert.assertEquals(newCar.getBrand(), indexComposeActions.getPopupCarBrand());
        Assert.assertEquals(newCar.getModel(), indexComposeActions.getPopupCarModel());
        Assert.assertEquals(newCar.getYear(), indexComposeActions.getPopupCarYear());
    }

    @Test
    public void testCheckPopupCard() {
        // Arrange
        int carIndex = 0;
        TestDataModel car = PreLoadedData.getPreloadedByIndex(carIndex);

        // Act
        indexComposeActions.clickResultCardByIndex(carIndex);

        // Assert
        Assert.assertEquals(car.getBrand(), indexComposeActions.getPopupCarBrand());
        Assert.assertEquals(car.getModel(), indexComposeActions.getPopupCarModel());
        Assert.assertEquals(car.getYear(), indexComposeActions.getPopupCarYear());
    }

    @Test
    public void testUpdatingCar() {
        // Arrange
        int carIndex = 0;
        TestDataModel car = new TestDataModel("Chevrolet", "Edited", "2018");

        // Act
        indexComposeActions.clickResultCardByIndex(carIndex);
        indexComposeActions.fillForm(car);
        indexComposeActions.clickPopupUpdateButton();
        indexComposeActions.clickResultCardByIndex(carIndex);

        // Assert
        Assert.assertEquals(car.getBrand(), indexComposeActions.getPopupCarBrand());
        Assert.assertEquals(car.getModel(), indexComposeActions.getPopupCarModel());
        Assert.assertEquals(car.getYear(), indexComposeActions.getPopupCarYear());
    }

    // Bug 3: Doesn't delete
    @Test
    public void testDeletingCar() {
        // Arrange
        int carIndex = 0;
        TestDataModel car = PreLoadedData.getPreloadedByIndex(carIndex);
        int expectedCardCount = PreLoadedData.getPreloadedDataLength() - 1;

        // Act
        indexComposeActions.clickResultCardByIndex(carIndex);
        indexComposeActions.clickPopupDeleteButton();

        // Assert
        Assert.assertEquals(expectedCardCount, indexComposeActions.getResultCardCount());
        List<ResultCard> resultCardList = indexComposeActions.getCards();
        for (ResultCard card : resultCardList){
            String yearAndModel = String.format("%s %s", car.getYear(), car.getModel());
            Assert.assertNotEquals(car.getBrand(), card.getTitle());
            Assert.assertNotEquals(yearAndModel, card.getText());
        }
    }
}
