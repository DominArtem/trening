package com.hillel.tomas.trening2;

public class Box {
    int a;
    int b;
    int c;
//    String color;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int getVolume(){
        return a*b*c;
    }


}
