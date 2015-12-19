package modul42;
import static java.lang.Math.abs;
public class Main {

    //MAIN METHOD - RUNS APP
    public static void main(String[] args) {

        int x1 = 2;
        int x2 = 3;
        int y1 = 5;
        int y2 = 6;
        double result;

        //declare future creation of GetDistanceBetweenTwoDots class
        GetDistanceBetweenTwoDots getDistanceBetweenTwoDots;

        // instantiate GetDistanceBetweenTwoDots with default constructor
        getDistanceBetweenTwoDots = new GetDistanceBetweenTwoDots();

        result = getDistanceBetweenTwoDots.calculateByCoordinates(x1,x2,y1,y2);

        System.out.println(result);
    }
}
