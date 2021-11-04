package pl.sda.mg.zadanie12;

import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        String text = getTextFromUser();
        int spaceCounter = 0;
        for (char textChar : text.toCharArray()) {
            if (textChar == ' ') {
                spaceCounter++;
            }
        }

        float spacePercent = spaceCounter * 100 / (float)text.length();
        System.out.println("Znak spacji to " + spacePercent + "% wszystkich zankow.");
    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
