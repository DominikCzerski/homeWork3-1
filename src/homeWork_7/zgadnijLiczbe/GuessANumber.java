package homeWork_7.zgadnijLiczbe;

import java.util.Scanner;

public class GuessANumber {

    boolean isInArray(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    boolean isDividableBy3(int value) {
        return value % 3 == 0;
    }


    public static void main(String[] args) {
        int[] numberArray = new int[101];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i + 100;
        }
        Scanner scanner = new Scanner(System.in);
        GuessANumber guessANumber = new GuessANumber();
        boolean answeredCorrectly = false;
        while (!answeredCorrectly) {
            System.out.println("State a number");
            int number = scanner.nextInt();

            if (guessANumber.isInArray(numberArray, number) && guessANumber.isDividableBy3(number)) {
                System.out.println("Number is ok");
                answeredCorrectly = true;
            } else if (number < 100) {
                System.out.println("Number is too small");
            } else if (number > 200) {
                System.out.println("Number is to big");
            } else if (!guessANumber.isDividableBy3(number)) {
                System.out.println("Number is not dividable by 3");
            }
        }
    }
}
