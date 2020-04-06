package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.getPagesPrinted());
        int pages = printer.printPage(4);
        System.out.println(pages + printer.getPagesPrinted());
    }
}
