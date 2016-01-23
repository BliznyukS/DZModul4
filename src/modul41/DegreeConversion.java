package modul41;
import java.io.IOException;

public class DegreeConversion {
    double celsius;
    public double convertCelsiusToFahrenheit() throws IOException {
        double fahrenheit;

        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        return fahrenheit;
    }

}
