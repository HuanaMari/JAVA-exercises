package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone marijasPhone;
        marijasPhone = new DeskPhone(123456);
        marijasPhone.powerOn();
        marijasPhone.callPhone(123456);
        marijasPhone.answer();

        System.out.println("=====Mobile phone info===");

        marijasPhone=new MobilePhone(555666);
//        marijasPhone.powerOn();
        marijasPhone.callPhone(555666);
        marijasPhone.answer();
    }
}
