package pl.sda.mg.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public static LocalDate getDateFromUser() {
        System.out.println("Podaj date: ");
        Scanner in = new Scanner(System.in);
        return LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
