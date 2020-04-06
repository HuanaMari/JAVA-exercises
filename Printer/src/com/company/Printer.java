package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplexOrNot;

    public Printer(int tonerLevel, boolean duplexOrNot) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;

        if (duplexOrNot == true) {
            System.out.println("Printer is duplex");
        } else {
            System.out.println("Printer is not a duplex");
        }
        this.duplexOrNot = duplexOrNot;
    }


    public int AddToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int page) {
        int pagesToPrint = (page / 2) + (page % 2);
        if (this.duplexOrNot) {
            pagesToPrint /= 2;
            System.out.println("Duplexxxxxxxxxxx");
        }
        this.pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }
//
//    public void printing(int page) {
//
//        tonerLevel -= usedToner;
//        System.out.println("toner level is " + tonerLevel);
//    }
//
//    public void fillUpToner() {
//        tonerLevel = 100;
//        System.out.println("Refill to " + tonerLevel);
//    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexOrNot() {
        return duplexOrNot;
    }
}
