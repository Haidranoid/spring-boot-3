package com.example.myfirstwebapp.business;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessImpl {
    private DataService dataService;

    @Autowired
    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}

