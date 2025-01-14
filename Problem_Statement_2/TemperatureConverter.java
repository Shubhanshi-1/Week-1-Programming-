//Importing java util package for sc class
import java.util.Scanner;

public class TemperatureConverter {


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(String conversionType, double input, double output) {
        System.out.println(input + " " + conversionType + " is equal to: " + output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        
        double inputTemp;
        double outputTemp;

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit:");
            inputTemp = sc.nextDouble();
            outputTemp = fahrenheitToCelsius(inputTemp);
            displayResult("Fahrenheit", inputTemp, outputTemp);
        } else if (choice == 2) {
            System.out.println("Enter temperature in Celsius:");
            inputTemp = sc.nextDouble();
            outputTemp = celsiusToFahrenheit(inputTemp);
            displayResult("Celsius", inputTemp, outputTemp);
        } else {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }

        sc.close();
    }
}
