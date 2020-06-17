package homeWork_3.HomeWork3_3;

public class ArithmeticTest {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.isEven(5));
        System.out.println(arithmetic.isEven(6));
        System.out.println(arithmetic.isEven(10));
        System.out.println(arithmetic.isEven(13));

        System.out.println(arithmetic.isOdd(5));
        System.out.println(arithmetic.isOdd(7));
        System.out.println(arithmetic.isOdd(8));
        System.out.println(arithmetic.isOdd(10));

        System.out.println(arithmetic.circleField(12.0));
        System.out.println(arithmetic.circleField(123.0));
        System.out.println(arithmetic.circleField(5433.0));
        System.out.println(arithmetic.circleField(1.2));

        System.out.println(arithmetic.power(5));
        System.out.println(arithmetic.power(53));
        System.out.println(arithmetic.power(23));
        System.out.println(arithmetic.power(432));
    }
}
