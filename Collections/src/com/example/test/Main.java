package com.example.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Comedy", 2,8);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A06")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry,seat is already taken");
        }

        if (theatre.reserveSeat("A06")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry,seat is already taken");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat is " + minSeat.getSeatNumber());
        System.out.println("Max seat is " + maxSeat.getSeatNumber());
    }
    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("********************************************************");
    }
}
