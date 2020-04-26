package com.example.test;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Comedy", 8, 12);

        if (theatre.reserveSeat("A06")) {
            System.out.println("Please pay for A06");
        } else {
            System.out.println("Sorry,seat is already taken");
        }
        if (theatre.reserveSeat("A06")) {
            System.out.println("Please pay for A06");
        } else {
            System.out.println("Sorry,seat is already taken");
        }
        if (theatre.reserveSeat("B02")) {
            System.out.println("Please pay for B02 ");
        } else {
            System.out.println("Sorry,seat is already taken");
        }

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat ("A00",22.00));
        priceSeat.add(theatre.new Seat("B00",16.00));
        priceSeat.sort(Theatre.PRICE_ORDER);
        printList(priceSeat);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("********************************************************");
    }
}

//        Theatre theatre = new Theatre("Comedy", 2, 8);
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//        if (theatre.reserveSeat("A06")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry,seat is already taken");
//        }
//
//        if (theatre.reserveSeat("A06")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry,seat is already taken");
//        }
//
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat is " + minSeat.getSeatNumber());
//        System.out.println("Max seat is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Print out sorted seatCopy");
//        printList(seatCopy);
//    }
//
//    public static void printList(List<Theatre.Seat> list) {
//        for (Theatre.Seat seat : list) {
//            System.out.print(" " + seat.getSeatNumber());
//        }
//        System.out.println();
//        System.out.println("********************************************************");
//    }
//
//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }

