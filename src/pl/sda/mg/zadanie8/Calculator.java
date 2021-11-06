package pl.sda.mg.zadanie8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float a = getNumberFromUser();
        float b = getNumberFromUser();
        String type = getCalcTypeFromUser();

        switch (type) {
            case "dodawanie":
            case "add":
            case "+":
                System.out.println((a + b));
                break;

            case "minus":
            case "-":
                System.out.println((a - b));
                break;
            case "*":
                System.out.println((a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Blad!");
                } else {
                    System.out.println((a / b));
                }
                break;
            default:
                System.out.println("Bledny znak!");
        }

    }

    private static String getCalcTypeFromUser() {
        System.out.println("Podaj dzialanie: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static float getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }
}
