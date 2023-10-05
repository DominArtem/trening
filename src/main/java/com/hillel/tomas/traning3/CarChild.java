package com.hillel.tomas.traning3;

public class CarChild extends Car {


    public CarChild(String name) {
        super(name);
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("callad from child class");
    }
}
