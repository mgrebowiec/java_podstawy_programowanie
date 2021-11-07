package pl.sda.mg.zadanie12;

import java.util.Scanner;

public class SpacesCounter {
    public static void main(String[] args) {
        String text = getTextFromUser();
        int spaceCounter = 0;
        for (char character : text.toCharArray()) {
            if (character == ' ') {
                spaceCounter++;
            }
        }

        System.out.println("Procent spacji: " + (spaceCounter / (float) text.length() * 100));

    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
