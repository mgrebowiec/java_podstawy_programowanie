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

            if ("".equals(text)) {
                System.out.println("Nie podano zadnego tekstu!");
                continue;
            }

            if (longestText.length() < text.length()) {
                longestText = text;
            }
        }

        System.out.println("najdluzszy wprowadzony tekst to: " + longestText);
    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
