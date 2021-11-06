package pl.sda.mg.zadanie6;

import java.util.Scanner;

public class SeriesExample {
    public static void main(String[] args) {
        int x = getNumberFromUser();
        float sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += 1 / (float)i;
        }
        System.out.println("Suma szeregu: " + sum);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
