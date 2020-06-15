package HomeWork3_3;

public class Arithmetic {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 > 0;
    }

    double circleField(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }

    int power(int number) {
        return (int) Math.pow(number, 2);
        //return number * number
    }


}
