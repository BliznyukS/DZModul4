package modul42;
import static java.lang.Math.abs;
import static java.lang.StrictMath.cbrt;
import static java.lang.StrictMath.pow;

public class GetDistanceBetweenTwoDots {

    public GetDistanceBetweenTwoDots() {
    }

    public double calculateByCoordinates(int xx1, int xx2, int yy1, int yy2) {
        double methotResult = cbrt(pow(abs(xx2 - xx1), 2) + pow(abs(yy2 - yy1), 2));
        return methotResult;
    }
}
