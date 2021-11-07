package pl.sda.mg.zadanie9;

import java.util.Scanner;

public class Wave {
    public static void main(String[] args) {
        String character = "*";
        int height = 7;
        int length = getNumberFromUser();

        for (int i = 1; i <= height; i++) { //i --> indeks pionowy
            for (int j = 1; j <= length; j++) { //j --> indeks poziomy
                int tempIndex = j % height;
                tempIndex = tempIndex == 0 ? height : tempIndex; // 1 ,2, 3, 4
                if (((j - 1) / height) % 2 == 1 ) {
                    //wznoszące
                    if (i == height - tempIndex + 1) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    //opadajace
                    if (i == tempIndex) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj dlugosc fali:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
