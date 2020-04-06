package com.company;

public class Main {

    public static void main(String[] args) {
	float myMinFloatV = Float.MIN_VALUE;
	float myMaxFloatV = Float.MAX_VALUE;
//        System.out.println(myMinFloatV);
//        System.out.println(myMaxFloatV);

        double myMinDoubleV = Double.MIN_VALUE;
        double myMaxDoubleV = Double.MAX_VALUE;
//        System.out.println(myMinDoubleV);
//        System.out.println(myMaxDoubleV);

        int myIntValue = 5/2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5.00/2.00;
//        System.out.println(myFloatValue);
//        System.out.println(myDoubleValue);
//        System.out.println(myIntValue);

        double pound = 3.65d;
        double kg = 0.45359237d;
        double result = pound * kg;
        System.out.println(result);
    }
}
