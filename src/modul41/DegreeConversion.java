package modul41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DegreeConversion {
    double fahrenheit;
    double celsius;

    public double convertCelsiusToFahrenheit() throws IOException {
        System.out.print("Temperature in Celsius: ");

        BufferedReader bReader = new BufferedReader ( new InputStreamReader(System.in));
        String cStr = bReader.readLine();
        celsius = Double.parseDouble(cStr);
        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        //return celsius;
        return fahrenheit;
    }

}
