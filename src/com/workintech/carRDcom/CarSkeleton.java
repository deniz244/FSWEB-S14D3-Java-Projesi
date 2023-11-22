package com.workintech.carRDcom;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + "the car's engine is starting";
    }

    public String drive(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        runEngine(this);
        return getName() + "the car is driving";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName());

    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
