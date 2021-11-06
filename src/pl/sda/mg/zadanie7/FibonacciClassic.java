package pl.sda.mg.zadanie7;

import java.util.Scanner;

public class FibonacciClassic {

    public static void main(String[] args) {
        int n = getNumberFromUser();

        int previus = 1;
        int actual = 1;
        for (int i = 3; i <= n; i++) {
            int newElement = previus + actual;
            previus = actual;
            actual = newElement;
        }

        System.out.println("Szukany element ciągu: " + actual);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
