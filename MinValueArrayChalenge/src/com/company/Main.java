package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int[] lla= readIntegers(3);
    findMin(lla);
        System.out.println(findMin(lla));

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
