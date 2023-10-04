package com.hillel.tomas.trening2;

public class main {

    public static void main(String[] args) {

        Box box = new Box(1,2,3);
        System.out.println(box.getVolume());

        ColorBox colorBox = new ColorBox(3,2,3);
        colorBox.color = "Blue";

        System.out.println(colorBox.getVolume() + " " + colorBox.color);
//        System.out.println(colorBox.color);
        colorBox.printColor();


    }
    static void demo1(){
        Person fen = new Person("fen", 32);
//
//        fen.car = new Car ("BMW");
////        Car car = new Car("BMW");
//        Car car1 = new Car("Mercedes");
//        fen.car1 = car1;
//
////        fen.car = car;
//
////
//////        fen.name = "Fen";
//////        fen.age = 32;
////
//        System.out.println(fen.name);
//        System.out.println(fen.age);
//        System.out.println(fen.car.modelName);
//        System.out.println();
//
//
//        System.out.println(fen.car1.modelName);
//        car1.modelName = "Lexus";
//        System.out.println(fen.car1.modelName);
//        System.out.println();
//        System.out.println(fen);
//        System.out.println(fen.car);
//
//
//
//        if (fen.car != null){
//            fen.car.startEngine();
//        }else{
//            System.out.println("Run");
//        }
////
////        fen.sayHello();
////        fen.move();
////
////        Person alex = new Person("alex", 2);
////
////
//////        alex.name = "alex";
//////        alex.age = 2;
////
////        System.out.println(alex.name);
////        System.out.println(alex.age);
////

    }

}
