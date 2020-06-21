package homeWork_5.trójkątProstokątny;

public class TriangleCheckerTest {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(11, 60, 61);
        Triangle triangle3 = new Triangle(12, 65, 76);


        TriangleChecker triangleChecker = new TriangleChecker();
        System.out.println(triangleChecker.isRightTriangle(triangle));
        System.out.println(triangleChecker.isRightTriangle(triangle2));
        System.out.println(triangleChecker.isRightTriangle(triangle3));
    }
}
