package homeWork_7.sumaKwadratów;

import java.util.Scanner;

public class SquareRootSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please state table size");
        int tableSize = input.nextInt();
        double[] numbers = new double[tableSize];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Provide numbers");
            numbers[i] = input.nextDouble();
        }
        double sum = 0.0;
        for (double number : numbers){
            sum += (number * number);
        }
        System.out.println("Sum value of array elements is " + sum);


    }
}
