package pl.sda.mg.zadanie7;

import java.util.Scanner;

public class FibonacciNumberRecursion {

    public static void main(String[] args) {
        int x = getNumberFromUser();
        int value = calculate(x);
        System.out.println(x + " liczba ciagu Fibonacciego to " + value);
    }

    private static int calculate(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return calculate(x - 1) + calculate(x - 2);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe ciagu Fibonacciego do policzenia:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
