import java.util.Scanner;

public class TemperatureConversionn {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Conversion formula: (°F − 32) × 5/9 = °C
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsius);

        // Close scanner
        scanner.close();
    }
}
