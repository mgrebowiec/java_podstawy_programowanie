package pl.sda.mg.zadanie7;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int n = getNumberFromUser();
        System.out.println("Element ciągu: " + calculate(n));
    }

    private static int calculate(int elementIndex) {
        if (elementIndex == 1 || elementIndex == 2) {
            return 1;
        }

        return calculate(elementIndex - 1) + calculate(elementIndex -2);
    }


    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
