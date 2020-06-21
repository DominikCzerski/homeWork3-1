package homeWork_5.trójkątProstokątny;

public class Triangle {

    private double cathetusALength;
    private double cathetusBLength;
    private double hypotenuseLength;

    public Triangle(double cathetusALength, double cathetusBLength, double hypotenuseLength) {
        this.cathetusALength = cathetusALength;
        this.cathetusBLength = cathetusBLength;
        this.hypotenuseLength = hypotenuseLength;
    }

    public double getCathetusALength() {
        return cathetusALength;
    }

    public double getCathetusBLength() {
        return cathetusBLength;
    }

    public double getHypotenuseLength() {
        return hypotenuseLength;
    }
}
