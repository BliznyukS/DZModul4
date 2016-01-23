package modul40;

public class Main {
    public static void main(String[] args) {
        int sideT = 6;
        int heightT = 7;

        int widthR = 5;
        int heightR = 7;

        //double pi = 3.14;
        int radius = 7;

        double resultTriangleSquare;
        double resultRectangleSquare;
        double resultCircleSquare;
        /*
        FigureSquare getAreaTriangle = new FigureSquare();
        resultTriangle = getAreaTriangle.calculateTriangle(sideT, heightT);

        FigureSquare getAreaRectangle = new FigureSquare();
        resultRectangle = getAreaRectangle.calculateRectangle(widthR, heightR);

        FigureSquare getAreaCircle = new FigureSquare();
        resultCircle = getAreaCircle.calculateCircle(radius);
        */
        FigureSquare figureSquare = new FigureSquare();
        resultTriangleSquare = figureSquare.calculateTriangle(sideT, heightT);
        resultRectangleSquare = figureSquare.calculateRectangle(widthR, heightR);
        resultCircleSquare = figureSquare.calculateCircle(radius);

        System.out.println(resultTriangleSquare);
        System.out.println(resultRectangleSquare);
        System.out.println(resultCircleSquare);

    }
}
