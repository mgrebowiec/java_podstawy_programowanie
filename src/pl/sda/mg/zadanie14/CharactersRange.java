package pl.sda.mg.zadanie14;

import pl.sda.mg.util.InUtil;

public class CharactersRange {
    public static void main(String[] args) {
        char firstChar = InUtil.getTextFromUser().charAt(0);
        char secondChar = InUtil.getTextFromUser().charAt(0);

        int distance = Math.abs((int) firstChar - (int) secondChar);
        System.out.println("Odleglosc: " + distance);
    }
}
