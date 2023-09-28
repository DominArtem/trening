package com.hillel.tomas.trening;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicStampedReference;

public class main {

    public static void main(String[] args) {


//        System.out.println("Hello world");
//
//        System.out.println(5 & 7);
//        System.out.println(5 | 7);
//        System.out.println(5 ^ 7);
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(7));


//        int a = 5;
//        int b = 10;

//        boolean result = a<b;
//
//        if (result) {
//            System.out.println("a>b");
//        }else{
//            System.out.println("a<b");
//        }

//        System.out.println(a<b ? "yes" : " ebanutiy");


//        if (a>b){
//            System.out.println("a>b");
//        } else if (b>a) {
//            System.out.println("b>a");
//                    }else{
//            System.out.println("a == b");
//        }

//        int a = 1;
//
//        if (a == 1){
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        } else if (a == 5) {
//            System.out.println("5");
//        }
//
//
//        switch (a){
//            case 1:{
//                System.out.println("1");
////                System.exit(0);
//                break;
//            }
//            case 2:{
//                System.out.println("2");
////                System.exit(0);
//                break;
//            }
//            case 3:{
//                System.out.println("3");
////                System.exit(0);
//                break;
//            }
//            case 4:{
//                System.out.println("4");
////                System.exit(0);
//                break;
//            }
//            case 5:{
//                System.out.println("5");
//            }
//        }

//        String str1 = "HELLO";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equalsIgnoreCase(str3));
//
//        switch (str1){
//
//            case "fsdfds":{
//                System.out.println("1");
////                System.exit(0);
//                break;
//            }
//            case "Hello":{
//                System.out.println("2");
////                System.exit(0);
//                break;
//            }
//            case "3":{
//                System.out.println("3");
////                System.exit(0);
//                break;
//            }
//
//            case "HELO":{
//                System.out.println("HELLO");
////                System.exit(0);
//                break;
//            }
//            default:{
//                System.out.println("default");
//            }
//
//        System.out.println("fdsfsdsddsf");
//        Scanner scanner = new Scanner(System.in);
//
//        String value = scanner.nextLine();
//        System.out.println(value);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("please after Line");
//        String value = scanner.nextLine();
//        System.out.println(value);
//
//        System.out.println("please after intenger");
//
//        if(scanner.hasNextInt()) {
//            int a = scanner.nextInt();
//            System.out.println(a);
//
//        }else {
//            System.out.println("bad");
//
//            System.exit(0);
//        }
//        scanner.nextLine();
//
//        System.out.println("please after Line");
//        String value1 = scanner.nextLine();
//        System.out.println(value1);
//
//        scanner.close();

//        for(int i = 5 ; i >= 0; i--){
//
//            if (i == 2){
//                break;
//            }
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        int playre1 = 0;
//
//        for(  ;  ; ){
//
//            if (scanner.hasNextInt()){
//                playre1 = scanner.nextInt();
//                break;
//            }else {
//                System.out.println("wrog");
//                scanner.nextLine();
//            }


//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0){System.out.println(i);
//            }

//        0,1,1,2,3,5,8,13,21,34,55


//        int number1 = 0;
//        int number2 = 1;
//        int sum = -1;
//        System.out.print(number1 + " " + number2 + " " );
//        for (int i = 0; i < 9; i++) {
//
//
//            sum = number1 + number2;
//
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//
//        }


//        int i = 0;
//        while (true) {
//            System.out.print
//                    ("54445 ");
//            i++;
//        }

//        byte i = 10;
//        while (true) {
//            i++;
////            if ((i == 9) || (i == 5)) {
////                continue;
////            }
//            if (i == 9) {
//                break;
//            }
//            System.out.println(i);
//
//        }

//        do {
//            System.out.println( "hello");
//        } while (false) ;


//        int x = 10;
//
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        while (x >= 0) {
//            if (scanner.hasNextInt()){
//                int a = scanner.nextInt();
//                System.out.println(a + " bomb tra trata");
//                break;
//            }else{
//                System.out.println("bomb pizda");
//                x--;
//            }
//
//
//        }

//        int x = 10;
//
//        while (x >= 0) {
//            if ((int)(Math.random() * 101) >= 85){
//                System.out.println("defuse");
//                break;
//            }
//            System.out.println(x);
//            if (x == 0){
//                System.out.println( " boom");
//            }
//           x--;
//
//        }
//        Scanner scanner = new Scanner(System.in);
//        int n = -1;
//
//        while (true) {
//
//            if (scanner.hasNextInt()) {
//                n = scanner.nextInt();
//                if (n < 0 || n >11) {
//                    System.out.println("2132132131312");
//
//                }else {
//                    break;
//                }
//            } else {
//                System.out.println("dsfdsfsd");
//                scanner.nextLine();
//            }
//        }
//        int b = 1;
//        for (int i = 1; i <= n; i++) {
//            b *= i;
//        }
//        System.out.println(b);
//
//        int counter = 0;
//        for (int i = 0; i < 50; i++) {
//            if (4 == i || 9 == i){
//                continue;
//            }
//            System.out.println("shutlle number " + i);
//            counter++;
//
//        }

//

//        double number = 50;
//
//        System.out.println(number %2);
//        System.out.println(number /10);

//        int number = 1234;
//        int temp;
//        int i = 4;
//
//        while (i > 0){
//            temp = number % 10;
//            System.out.println(temp);
//            number /= 10;
//            i--;
//        }

//        int a = 123;
//        System.out.println(a % 10);

        int[] array = new int[5];
//        int[] array2 = new int[] {1,2,3,4,5};
//        int[] array3 = {1,2,3,4,5};
//        int array4[] = new int[5];
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array4));



        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }







        }
}
