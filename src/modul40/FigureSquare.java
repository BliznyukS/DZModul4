package modul40;

public class FigureSquare {

    public double calculateTriangle(int sideT, int heightT) {
        double areaTriangle = (sideT * heightT) / 2;
        return areaTriangle;

    }

    public double calculateRectangle(int widthR, int heightR) {
        double areaRectangle = widthR * heightR;
        return areaRectangle;

    }

    public double calculateCircle(double pi, int radius) {
        double areaCircle = pi * Math.pow(radius, 2);
        return areaCircle;

    }
}
