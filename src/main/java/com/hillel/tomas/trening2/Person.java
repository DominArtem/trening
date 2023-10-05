package com.hillel.tomas.trening2;

public class Person {

    public String name;
    int age;
    Car car;
    Car car1;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println(name + " say hello");
    }

    void move() {
        System.out.println(name + " moving");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car.modelName +
                '}';
    }
}
