package pl.sda.mg.zadanie2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int height = getHeightFromUser();
        float weight = getWeightFromUser();

        double bmi = (double)weight / Math.pow(height / (double)100, 2);
        // 18.5 do 24.9
        System.out.println("Wyliczony BMI: " + bmi);
        if (bmi >= 15.5 && bmi <= 24.9) {
            System.out.println("Optymalny BMI");
        } else {
            System.out.println("Nieoptymalny BMI");
        }
    }

    private static int getHeightFromUser() {
        System.out.println("Podaj wzrost w cm: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static float getWeightFromUser() {
        System.out.println("Podaj wagę w kg: ");
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }
}
