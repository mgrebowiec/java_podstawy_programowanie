package pl.sda.mg.zadanie10;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {
        int x = getNumberFromUser();
        int sum = 0;
        do {
            sum = sum + (x % 10);
            x = x / 10;
        } while (x > 0);

        System.out.println("Suma cyfr: " + sum);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
