package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPLayer>> footballLeague = new League<>("AFL");
        Team<FootballPLayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPLayer> melbourne = new Team<>("Melbourne");
        Team<FootballPLayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPLayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        footballLeague.add(adelaideCrows);
        footballLeague.add(hawthorn);
        footballLeague.add(melbourne);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();
    }
}
