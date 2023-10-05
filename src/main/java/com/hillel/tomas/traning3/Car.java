package com.hillel.tomas.traning3;

public class Car {

    private  String name;



    public static int counter = 0;

    private final int wheels = 4;


    private int sameIntVariable;

    public Car(String name) {
        this.name = name;
        counter++;
    }
    public int getWheels() {
        return wheels;
    }
    public int getSameIntVariable() {
        return sameIntVariable;
    }

    public void setSameIntVariable(int sameIntVariable) {
        this.sameIntVariable = sameIntVariable;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void start(){
        startElectricalSstem();
        startFUelSystem();
        startGPSSystem();

        System.out.println("car srarted");
        System.out.println();
    }

    private void startGPSSystem() {
        System.out.println(name + " start GPS system");
    }

    private void startFUelSystem() {
        System.out.println(name + " start fuel system");

    }

    private void startElectricalSstem() {
        System.out.println(name +  " start Electrical system");

    }

    public  void stop(){
        stopElectricalSstem();
        stopFUelSystem();
        stopGPSSystem();
        System.out.println("car stoped");
    }

    private void stopElectricalSstem() {
        System.out.println(name + " stop Electrical system");
    }

    private void stopFUelSystem() {
        System.out.println(name + " stop fuel system");

    }

    private void stopGPSSystem() {
        System.out.println(name + " stop GPS system");

    }
}
