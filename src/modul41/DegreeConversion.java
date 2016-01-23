package modul41;
import java.io.IOException;

public class DegreeConversion {
        public double convertCelsiusToFahrenheit(double celsius) throws IOException {
        double fahrenheit;

        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        return fahrenheit;
    }

}
