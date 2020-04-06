package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArr));
        reverse(myArr);
        reverseArr(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    private static void reverse(int[] array) {
        int[] reversedArr = new int[array.length];
        int integer = array.length-1;
        for (int i = 0; i < reversedArr.length; i++) {
            reversedArr[integer]=array[i];
            integer--;
        }
        System.out.println(Arrays.toString(reversedArr));
    }

    private static void reverseArr (int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}
