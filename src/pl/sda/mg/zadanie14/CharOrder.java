package pl.sda.mg.zadanie14;

import java.util.Scanner;

public class CharOrder {
    public static void main(String[] args) {
        char firstCharacter = getTextFromUser();
        char secondCharacter = getTextFromUser();

        int charLength = Math.abs(firstCharacter - secondCharacter);
        System.out.println("Odleglosc miedzy znakiem '" + firstCharacter
                + "' a znakiem '" + secondCharacter + "': " + charLength);
    }

    private static char getTextFromUser() {
        System.out.println("Podaj znak:");
        Scanner in = new Scanner(System.in);
        return in.nextLine().charAt(0);
    }
}
