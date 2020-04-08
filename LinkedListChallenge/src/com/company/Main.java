package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("StormBringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Love don't mean a thing", 2.5);
        album.addSong("Holy man", 2.55);
        album.addSong("Lady double dealer", 5.22);
        album.addSong("You can't do it right", 3.84);
        album.addSong("High ball shooter", 7.44);
        album.addSong("The gypsy", 4.40);
        album.addSong("Soldier of fortune", 4.80);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 2.5);
        album.addSong("I put the finger on you", 2.55);
        album.addSong("Let's go", 5.22);
        album.addSong("Inject the venom", 3.84);
        album.addSong("Snowballed", 7.44);
        album.addSong("Evil walks", 4.40);
        album.addSong("C.O.D", 4.80);
        album.addSong("Breaking the rules", 4.80);
        album.addSong("Night of the knives", 4.80);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPLayList("You can't do it right", playList);
        albums.get(0).addToPLayList("Holy man", playList);
        albums.get(0).addToPLayList("Maria ", playList);
        albums.get(0).addToPLayList(5, playList);
        albums.get(1).addToPLayList(4, playList);
        albums.get(1).addToPLayList(1, playList);
        albums.get(1).addToPLayList(19, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }else{
                            System.out.println("Playlist is empty");
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - remove a song from the playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================");
    }

}
