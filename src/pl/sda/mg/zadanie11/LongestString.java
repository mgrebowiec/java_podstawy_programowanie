package pl.sda.mg.zadanie11;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        String longestText = "";
        while (true) {
            String text = getTextFromUser();
            if ("Starczy".equals(text)) {
                break;
            }

            if (text.isBlank()) {
                System.out.println("Nie podano zadnego tekstu!");
            } else {
                if (text.length() > longestText.length()) {
                    longestText = text;
                }
            }
        }

        System.out.println("Najdluzszy tekst to: \n" + longestText);

    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
