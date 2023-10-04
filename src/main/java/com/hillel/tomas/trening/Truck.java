package com.hillel.tomas.trening;

import java.util.Arrays;

public class Truck {

    public static void main(String[] args) {

        int length = 10;
        int width = 15;
        int heigt = 2;

        int a = 5;
        int b = 2;

//        counteVolume(length,width,heigt);
//        int sum = getSum(a,b);
//        System.out.println(sum);

//        System.out.println(getRandomNamber(10,20));
//        System.out.println(getRandomNamber(10,20));
//        System.out.println(getRandomNamber(10,20));
//        System.out.println(getRandomNamber(10,20));

        int[] array = new int[10];

        fillArrayNamber(array);
        System.out.println(Arrays.toString(array));


    }

    static int getRandomNamber (int min, int max){
        int number = (int) (Math.random() * (max - min -1)) + min;
        return number;
    }

    static void fillArrayNamber (int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNamber(10,20);

        }
    }




  static void counteVolume(int length, int width, int heigt ){
        System.out.println(length+width+heigt);

    }

    static int getSum (int x, int y){
        int sum = x + y;
        return sum;
    }




}
