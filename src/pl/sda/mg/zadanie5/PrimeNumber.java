package pl.sda.mg.zadanie5;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = getNumberFromUser();

        System.out.println("Liczby naturalne z przedzialu <2-" + x + "):");
        for (int i = 2; i < x; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe dodatnia wieksza od 2:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static boolean isPrimeNumber(int numberToCheck) {
        for (int i = 2; i * i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }

        return true;
    }
}
