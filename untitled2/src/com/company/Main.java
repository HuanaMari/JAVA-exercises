package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPLayer joe = new FootballPLayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <FootballPLayer>adelaideCrows = new Team<> ("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPLayer> melbourne = new Team<>("Melbourne");
        FootballPLayer banks = new FootballPLayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPLayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPLayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
//        adelaideCrows.matchResult(baseballTeam,1,1);

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
