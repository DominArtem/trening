package com.hillel.tomas.trening2;

public class ColorBox extends Box {


    String color;


    public ColorBox(int a, int b, int c) {
        super(a, b, c);
    }

    void printColor(){
        System.out.println(color);
    }
}
