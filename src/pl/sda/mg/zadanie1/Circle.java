package pl.sda.mg.zadanie1;

import java.util.Scanner;

public class Circle {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        double diameter = getDiameterFromUser();
        System.out.println("Obwod kola: " + calculate(diameter));
    }

    private static double calculate(double diameter) {
        return PI * diameter;
    }

    private static double getDiameterFromUser() {
        System.out.println("Podaj srednice kola: ");
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
