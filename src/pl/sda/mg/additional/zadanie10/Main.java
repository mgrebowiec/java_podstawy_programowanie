package pl.sda.mg.additional.zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc pieter");
        int floursCount = in.nextInt();
        Room[][] houseRooms = new Room[floursCount][];
        for (int i = 0; i < floursCount; i++) {
            System.out.println("Podaj ilosc pokoi dla pietra " + (i + 1));
            int roomsCount = in.nextInt();
            houseRooms[i] = getRooms(roomsCount, in);
        }

        House house = new House(houseRooms);
        house.showAllRooms();

        showRoomsFromLevel(house, in);
        showAreaForLevel(house, in);
    }

    private static void showAreaForLevel(House house, Scanner in) {
        System.out.println("Dla ktorego pietra policzyc pole wszystkich pokoi?");
        int level = in.nextInt();
        System.out.println("Powierzchnia pokoi: " + house.getAreaForLevel(level));
    }

    private static void showRoomsFromLevel(House house, Scanner in) {
        System.out.println("Ktore pietro wyswietlic?");
        int level = in.nextInt();
        house.showLevel(level);
    }


    private static Room[] getRooms(int roomsCount, Scanner in) {
        Room[] rooms = new Room[roomsCount];
        for (int i = 0; i < roomsCount; i++) {
            // String name, int height, int length, int width, int doorsCount, int windowsCount
            System.out.println("Podaj nazwe pokoju");
            String name = in.next();
            System.out.println("Podaj wysokosc");
            int height = in.nextInt();
            System.out.println("Podaj dlugosc pokoju");
            int length = in.nextInt();
            System.out.println("Podaj szerokosc pokoju");
            int width = in.nextInt();
            System.out.println("Podaj ilosc drzwi");
            int doorsCount = in.nextInt();
            System.out.println("Podaj ilosc okien");
            int windowsCount = in.nextInt();

            rooms[i] = new Room(name, height, length, width, doorsCount, windowsCount);
        }
        return rooms;
    }
}
