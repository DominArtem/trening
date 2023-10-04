package com.hillel.tomas.trening;

import javax.swing.*;
import java.util.*;
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

//        int[] array = new int[5];
//        int[] array2 = new int[] {1,2,3,4,5};
//        int[] array3 = {1,2,3,4,5};
//        int array4[] = new int[5];
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array4));



//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        int[] array2 = new int[] {1,2,3,4,5};
//
//        int sum = 0;
//
//        for ( int a: array2) {
//            System.out.println(a);
//           sum += a;
////
//        }



//        int [] array3 = new int[10];
//
//
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = (int) (Math.random() * 11);
//            if (i == array3.length - 1) {
//                System.out.print(array3[i]);
//
//            }else {
//                System.out.print(array3[i] + ", ");
//
//            }
//        }
//        int [] array3 = new int[10];
//
//
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = (int) (Math.random() * 11);
//            if (i < array3.length - 1) {
//                System.out.print(array3[i] + ", ");
//
//            } else {
//                System.out.print(array3[i]);
//
//            }
//        }
//        int [] array3 = new int[10];
//
//
//
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(array3));
//        int max = array [0];
//        int index = 0;
//        for (int i = 1; i < array3.length; i++) {
//
//            if (max < array3[i]) {
//                max = array3[i];
//                index = i;
//            }
//
//        }
//        System.out.print("index : " + index + ", chance " + max);

//        int [] array = {1,2,3,4,5};
//        int [] array2 = array;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 9;
//        array2 [4] = 8;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));

//        int [] team = new int [10];
//
//        int sumMain = 0;
//        int sumRes = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 10);
//            if (i % 2 == 0) {
//                sumMain += team[i];
//            }else{
//                sumRes += team[i];
//            }
////            for (int j = 0; j < team.length; j++) {
////                team[j] = (int) (Math.random() * 10);
//            }
//
//            System.out.println(Arrays.toString(team));
//        System.out.println(sumMain);
//        System.out.println(sumRes);

//        Scanner scanner = new Scanner(System.in);
//
//
//        int [] team1 = new int[5];
//        int [] team2 = new int[5];
//
//        for (int i = 0; i < team1.length; i++) {
//            System.out.println("Plese" + (i +1));
//            if (scanner.hasNextInt()){
//                team1[i] = scanner.nextInt();
//            }else {
//                System.out.println("wrong");
//                scanner.nextLine();
//                i--;
//            }
//
//
//        }
//        System.out.println(Arrays.toString(team1));
//
//        for (int i = 0; i < team2.length; i++) {
//            System.out.println("Plese" + (i +1));
//            if (scanner.hasNextInt()){
//                team2[i] = scanner.nextInt();
//            }else {
//                System.out.println("wrong");
//                scanner.nextLine();
//                i--;
//            }
//
//
//        }
//        System.out.println(Arrays.toString(team2));
//
//
//        int sumFrag1 = 0;
//        int sumFrag2 = 0;
//
//        for (int frag: team1) {
//            System.out.println(frag);
//            sumFrag1 +=frag;
//            System.out.println(sumFrag1);
//
//        }
//        int[] team = new int[25];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 23) + 18;
//
//        }
//        System.out.println(Arrays.toString(team));
//
//        for (int i = 0; i < team.length; i++) {
//            System.out.print(team[i] + ", ");
//
//        }

//        int couter = 4;
//        for (int i = 9; couter < 5 ; i--) {
//            if (!(String.valueOf(i).contains("4") || String.valueOf(i).contains("9"))) {
//                System.out.println("number " + i);
//                couter++;
//            }
//
//        }
//        System.out.println("counter = " + couter);


//        int [] array = {5,13,54,6,1,87,-7,3,7};

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

//        int b;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j]  > array[j + 1] ){
//                    b = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = b;
//            }
//
//            }
//            }
//        System.out.println(Arrays.toString(array));


//        int [] array = {5,13,54,6,1,87,-7,3,7};
//        int [] array3 = {2,2};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        int [] array2 = Arrays.copyOf(array3, 15);
//
//        System.out.println(Arrays.toString(array2));
//
//
//        System.arraycopy(array2, 7, array, 8, 1);
//
//        int N = -1;
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            if(scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N >= 0 & N % 2 == 0 ) {
//                    break;
//                }else{
//                    System.out.println("dsfsddsfsd");
//                }
//            }else{
//                System.out.println("Wrong data");
//                scanner.nextLine();
//            }
//        }while (true);
//
//        Integer[] sourse = new Integer[N];
//        for (int i = 0; i < sourse.length; i++) {
//            sourse[i] = (int) (Math.random() * 51);
//
//        }
//        int niddle = sourse.length / 2 ;
//
//        Integer[] array1 = Arrays.copyOf(sourse, niddle);
//        Integer[] array2 = Arrays.copyOfRange(sourse, niddle, sourse.length);
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println();
//
//        Arrays.sort(array1);
//        System.out.println(Arrays.toString(array1));
//        System.out.println();
//        Arrays.sort(array2, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array2));


//        boolean N = true;
//
//        int number = 1;
//
//        int[][] array = new int[5][5];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if ( i == j ){
//                    array[i][j] = number;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//

//        int number1 = 1;

//        int[][] array1 = {
//                {0,0,0,0,0},
//                {2,2,2,2,2},
//                {3,3,3,3,3},
//                {4,4,4,4,4},
//                {5,5,5,5,5}
//        };

//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length ; j++) {
//                    if (i + j == array1.length - 1){
//                        array1[i][j] = 1;
//                    }
//                }
//            }


//        for (int i = 0; i < array1.length; i++) {
//            array1[i][array1[i].length - i - 1] = 1;
//
//        }
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + " \t");
//
//            }
//            System.out.println();
//        }


//        String[][] buc = new String[8][8] ;
//        String a = "b";
//        String d = "w";



//        for (int i = 0; i < buc.length; i++) {
//            for (int j = 0; j < buc[i].length; j++) {
//                if ((i + j) % 2 == 0){
//                    buc[i][j] = a;
//                }else{
//                    buc[i][j] = d;
//                }System.out.print(buc[i][j] + " \t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < buc.length; i++) {
//            for (int j = 0; j < buc[i].length; j++) {
//                System.out.print(buc[i][j] + " \t");
//            }
//            System.out.println();
//        }
//
//        int[][] arr = new int[5][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 101);
//
//            }
//        }
//        System.out.println("After");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " \t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr[i].length; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " \t");
//            }
//            System.out.println();
////        }
//        String str = "Hello";
//        printHello();
//        printStr(str);
//        int k = 6;
//        int c = 3;
//        printSum(5, 2);
//        printSum(k, c);
//
        int d = 15;
        int y = 70;
//
//        System.out.println(y);
//
//        int y = 30;
//        System.out.println(y);
        doStuff(d);
        System.out.println(d);
//
//
//
//
//
    }
//
//    final  static void printHello(){
//        System.out.println("Hello world");
//    }
//
//
//    static void printStr(String str){
//        System.out.println("str: " + str);
//    }
//
//    static void printSum(int a, int b){
//        System.out.println("sum: " + (a+b));
//        a=10;
//        b=2;
//    }

    static void doStuff (int y){
        System.out.println(y);
    }

}
