package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNo = 0;
        int minNo = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int num = scanner.nextInt();
                if (first) {
                    first = false;
                    minNo = num;
                    maxNo = num;
                }
                if (num > maxNo) {
                    maxNo = num;
                }
                if(num < minNo) {
                    minNo = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min Number: " + minNo);
        System.out.println("Max Number: " + maxNo);
        scanner.close();

    }
}
