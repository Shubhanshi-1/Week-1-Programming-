import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversion formula: (°C × 9/5) + 32 = °F
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output the result
        System.out.printf("The %.2f Celsius is %.2f Fahrenheit.%n", celsius, fahrenheit);

        // Close scanner
        scanner.close();
    }
}
