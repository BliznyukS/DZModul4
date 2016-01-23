package modul40;

public class FigureSquare {

    public double calculateTriangle(int sideT, int heightT) {
        //        double areaTriangle = (sideT * heightT) / 2;
        //        return areaTriangle;
        return (sideT * heightT) / 2;
    }

    public double calculateRectangle(int widthR, int heightR) {
        //        double areaRectangle = widthR * heightR;
        //        return areaRectangle;
        return widthR * heightR;
    }

    public double calculateCircle(int radius) {
        //       double areaCircle = Math.PI * Math.pow(radius, 2);
        //       return areaCircle;
        return Math.PI * Math.pow(radius, 2);
    }
}
