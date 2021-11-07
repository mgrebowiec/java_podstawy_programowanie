package pl.sda.mg.zadanie15;

import pl.sda.mg.util.InUtil;

public class RepeatedNumbers {

    public static void main(String[] args) {
        int[] numbers = getNumbersFromUser(10);
        int[] repeatedNumbers = getRepeatedNumbers(numbers);
        displayArray(repeatedNumbers);
    }

    private static void displayArray(int[] numbers) {
        System.out.print("[");
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }

    private static int[] getRepeatedNumbers(int[] numbers) {
        int[] result = new int[numbers.length / 2];
        int resultIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (!arrayContainsElement(result, numbers[i])) {
                        result[resultIndex] = numbers[i];
                        resultIndex++;
                    }
                }
            }
        }

        return result;
    }

    private static boolean arrayContainsElement(int[] array, int element) {
        for (int e : array) {
            if (e == element) {
                return true;
            }
        }

        return false;
    }

    private static int[] getNumbersFromUser(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = InUtil.getNumberFromUser();
        }
        return numbers;
    }


}
