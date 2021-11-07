package pl.sda.mg.zadanie16;

import pl.sda.mg.util.InUtil;

public class Sequence {

    public static void main(String[] args) {
        int[] numbers = getNumbersFromUser(10);
        System.out.println("Wejsciowa tablica z liczbami:");
        displayArray(numbers);

        System.out.println("Najdluzszy ciag rosnacy: " + getLongestSubsequnece(numbers));
    }

    private static int getLongestSubsequnece(int[] numbers) {
        int longestPath = 0;
        int tempCounter = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                tempCounter++;
                if (tempCounter > longestPath) {
                    longestPath = tempCounter;
                }
            } else {
                tempCounter = 1;
            }
        }

        return longestPath;
    }


    private static void displayArray(int[] numbers) {
        System.out.print("[");
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    private static int[] getNumbersFromUser(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = InUtil.getNumberFromUser();
        }
        return numbers;
    }
}
