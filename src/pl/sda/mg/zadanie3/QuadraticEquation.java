package pl.sda.mg.zadanie3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        int a = getParameterFromUser("a");
        int b = getParameterFromUser("b");
        int c = getParameterFromUser("c");

        //b2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta ujemna");
            return;
        }

        double x1 = (-b - Math.sqrt(delta)) / (double)(2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (double)(2 * a);

        System.out.printf("\nx1: %f\nx2: %f", x1, x2);

    }

    private static int getParameterFromUser(String parameterName) {
        System.out.printf("\nPodaj wartosc parametru %s: ", parameterName);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
