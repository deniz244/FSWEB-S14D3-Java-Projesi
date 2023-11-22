package com.workintech.pacificCarCom;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
       super.startEngine();
        return getName() + "'s engine is starting";
    }
    public String accelerate(){
        super.accelerate();
        return getName() +"'s engine is accelerating";
    }
    public String brake(){
        super.brake();
        return getName() +" is braking";
    }
}
