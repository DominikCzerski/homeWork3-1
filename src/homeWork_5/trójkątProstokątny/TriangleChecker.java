package homeWork_5.trójkątProstokątny;

public class TriangleChecker {

    boolean isRightTriangle(Triangle triangle) {
        return Math.pow(triangle.getCathetusALength(), 2) + Math.pow(triangle.getCathetusBLength(), 2) == Math.pow(triangle.getHypotenuseLength(), 2);
    }
}
