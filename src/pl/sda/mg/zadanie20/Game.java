package pl.sda.mg.zadanie20;

import pl.sda.mg.util.InUtil;

import java.util.Random;

public class Game {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(101);

        while (true) {
            int userNumber = InUtil.getNumberFromUser();
            if (userNumber == randomNumber) {
                System.out.println("Bingo!");
                break;
            }

            if (userNumber < randomNumber) {
                System.out.println("Za mało");
            } else {
                System.out.println("Za dużo");
            }
        }
    }
}
