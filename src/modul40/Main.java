package modul40;

public class Main {
    public static void main(String[] args) {
        int sideT = 6;
        int heightT = 7;

        int widthR = 5;
        int heightR = 7;

        //double pi = 3.14;
        int radius = 7;

        double resultTriangle;
        double resultRectangle;
        double resultCircle;
/*
        FigureSquare getAreaTriangle = new FigureSquare();
        resultTriangle = getAreaTriangle.calculateTriangle(sideT, heightT);

        FigureSquare getAreaRectangle = new FigureSquare();
        resultRectangle = getAreaRectangle.calculateRectangle(widthR, heightR);

        FigureSquare getAreaCircle = new FigureSquare();
        resultCircle = getAreaCircle.calculateCircle(radius);
*/
        FigureSquare figureSquare = new FigureSquare();
        resultTriangle = figureSquare.calculateTriangle(sideT, heightT);
        resultRectangle = figureSquare.calculateRectangle(widthR, heightR);
        resultCircle = figureSquare.calculateCircle(radius);

        System.out.println(resultTriangle);
        System.out.println(resultRectangle);
        System.out.println(resultCircle);

    }
}
