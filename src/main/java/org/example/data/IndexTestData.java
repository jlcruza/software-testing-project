package org.example.data;

import org.example.constants.CarBrands;
import org.example.dto.TestDataModel;

public class IndexTestData {

    public static TestDataModel getTestData1() {
        return new TestDataModel(CarBrands.TOYOTA.toString(), "Rav4", "2019");
    }

    public static TestDataModel getTestData2() {
        return new TestDataModel(CarBrands.JEEP.toString(), "Wrangler", "2018");
    }

    public static TestDataModel getTestData3() {
        return new TestDataModel(CarBrands.MAZDA.toString(), "CX-5", "2022");
    }

    public static TestDataModel getTestData4() {
        return new TestDataModel(CarBrands.AUDI.toString(), "RS", "2016");
    }

    public static TestDataModel getTestData5() {
        return new TestDataModel(CarBrands.KIA.toString(), "Sorento", "2023");
    }
}
