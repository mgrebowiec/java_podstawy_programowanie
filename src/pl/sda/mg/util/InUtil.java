package pl.sda.mg.util;

import java.util.Scanner;

public class InUtil {

    public static String getTextFromUser() {
        System.out.println("Podaj tekst: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
