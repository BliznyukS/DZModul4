package modul41;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        double fahrenheit;
        double celsius;
        double resultDegree;

/*      double fahrenheit;
        double celsius;
        double result;
        System.out.print("Temperature in Celsius: ");

        BufferedReader bReader = new BufferedReader ( new InputStreamReader(System.in));
        String cStr = bReader.readLine();
        celsius = Double.parseDouble(cStr);
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
*/
        DegreeConversion getDegreeConversion = new DegreeConversion();
        resultDegree = getDegreeConversion.convertCelsiusToFahrenheit();

        //System.out.println(celsius + " Grad Celsius");
        System.out.println(resultDegree + " Grad Fahrenheit");
    }
}
