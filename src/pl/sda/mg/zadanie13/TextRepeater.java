package pl.sda.mg.zadanie13;

import java.util.Scanner;

public class TextRepeater {

    public static void main(String[] args) {
        String text = getTextFromUser();
        String[] words = text.split(" ");
        for (String word: words) {
            System.out.print(word + " " + word + " ");
        }

    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
