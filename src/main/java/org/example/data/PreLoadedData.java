package org.example.data;

import org.example.dto.TestDataModel;

public class PreLoadedData {

    public static int getPreloadedDataLength()
    {
        return 4;
    }

    public static TestDataModel getPreloadedByIndex(int index){
        if(index == 0)
            return getPreloadedHyundai();
        else if (index == 1)
            return getPreloadedToyota();
        else if (index == 2)
            return getPreloadedAudi();
        else if (index == 3)
            return getPreloadedMazda();

        return new TestDataModel();
    }

    public static TestDataModel getPreloadedHyundai()
    {
        return new TestDataModel("Hyundai", "Kona", "2023");
    }
    public static TestDataModel getPreloadedToyota()
    {
        return new TestDataModel("Toyota", "Corolla", "2022");
    }
    public static TestDataModel getPreloadedAudi()
    {
        return new TestDataModel("Audi", "TT", "2025");
    }
    public static TestDataModel getPreloadedMazda()
    {
        return new TestDataModel("Mazda", "CX-5", "2021");
    }
}
