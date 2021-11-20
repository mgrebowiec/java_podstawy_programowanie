package pl.sda.mg.validations;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Podaj wiek:");
            Scanner in = new Scanner(System.in);
            int age = in.nextInt();
            try {
                Person jan = new Person("jan", "85101011111", age);
                break;
            } catch (Exception e) {
                System.out.println("Poleciał blad: " + e.getMessage());
            }
        }

    }

    public static boolean validatePesel(String pesel) {
        return PeselUtil.isValidPesel(pesel);
    }
}
