package pl.sda.mg.zadanie7;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int x = getNumberFromUser();
        int previousNumber = 1;
        int actualNumber = 1;
        int tempNumber;
        for (int i = 3; i <= x; i++) {
            tempNumber = previousNumber + actualNumber;
            previousNumber = actualNumber;
            actualNumber = tempNumber;
        }

        System.out.println(x + " liczba ciagu Fibonacciego to " + actualNumber);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe ciagu Fibonacciego do policzenia:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
