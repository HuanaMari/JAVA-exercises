package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(23));
        System.out.println(sumDigits(-122));
    }

//    public static int sumDigits(int number){
//        int iljadarki = 0;
//        int hundreds= 0;
//        int tens = 0;
//        int ones = 0;
//        if(number>=10){
//            iljadarki = number/1000;
//            hundreds= (number%1000)/100;
//            tens = (number%100)/10;
//            ones = number%10;
//
//        }else{
//            return -1;
//        }
//        return iljadarki+hundreds+tens+ones;
//    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>0){
            int digit = number%10;
            sum+=digit;

            number/=10;
        }
        return sum;
    }
}
