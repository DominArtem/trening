package com.hillel.tomas.traning3;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void hello(){
        System.out.println(name + " say hello");
    }

}