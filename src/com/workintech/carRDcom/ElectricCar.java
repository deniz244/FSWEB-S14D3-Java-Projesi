package com.workintech.carRDcom;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
}
