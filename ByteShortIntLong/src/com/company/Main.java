package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
       
        int myMaxIntTest = 2_147_483_647;
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println(myMinByteValue);
//        System.out.println(myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println(myMinShortValue);
//        System.out.println(myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println(myMinLongValue);
//        System.out.println(myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue/2);
        byte myNewMinByteValue = (byte)(myMaxByteValue/2);
        short myNewShortValue = (short)(myMinShortValue/2);

        byte myByte = 100;
        short  myShort=253;
        int myInt = 666;

        long  myLong= 50000 + (10*(myInt+myShort+myByte));
        System.out.println(myLong);



    }
}
