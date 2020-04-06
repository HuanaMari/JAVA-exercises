package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
        ;
        System.out.println("**********************************");
        for (int i = 8; i >= 2; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
        ;
        System.out.println("***********************************");
        int count = 0;
        for(int x= 10;x<70;x++){
            if(isPrime(x)){
                count++;
                System.out.println(x + "is Prime No.");
                if(count==3){
                    break;
                }
            }
        }
    }





        public static boolean isPrime(int n){
            if(n==1){
                return false;
            }
            for (int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }

            }
            return true;
        }



    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }
}
