package pl.sda.mg.zadanie4;

import java.util.Scanner;

public class SampleNumbers {
    public static void main(String[] args) {
        int x = getNumberFromUser();

        for(int i = 1; i < x; i++) {
            String text = "";
            if (i % 3 == 0) {
                text += "Pif";
            }

            if (i % 7 == 0) {
                if (text.length() > 0) {
                    text += " p";
                } else {
                    text += "P";
                }
                text += "af";
            }

            if (text.length() < 1) {
                text += i;
            }

            System.out.println(text);
        }

    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
