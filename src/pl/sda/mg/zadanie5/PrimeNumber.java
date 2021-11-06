package pl.sda.mg.zadanie5;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = getNumberFromUser();
        System.out.println("Liczby pierwsze: ");
        for (int i = 2; i <= x; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int testNumber) {
        for (int i = 2; i * i <= testNumber; i++) {
            if (testNumber % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
