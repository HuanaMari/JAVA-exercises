package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getInteger(5);
        for(int i=0; i<myIntArray.length;i++){
            System.out.println("Element " + i + " typed value was " + myIntArray[i]);
        };
        System.out.println("The average is " + getAverage(myIntArray));
//        int[] myIntArray = new int[10];
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9};
//
//        myIntArray[5] = 5;
//        int[] myIntArray = new int[10];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
    }
public static int[] getInteger(int number){
    System.out.println("Enter " + number + " integer values .\r");
    int[] values = new int[number];

    for(int i = 0; i<values.length;i++){
        values[i] = scanner.nextInt();
    }
    return values;
}

public static double getAverage(int[]array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }
        return (double) sum/(double)array.length;
}
//    public static void printArray(int[] array) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Element " + i + " values is " + array[i]);
//        }
//    }
}
