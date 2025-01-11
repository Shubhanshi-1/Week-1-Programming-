// importing java util package for Scanner class
import java.util.Scanner;

public class WindChill{ 
    public static double calculateWindChill(double temperature, double windSpeed) { // function for implementation
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
		
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");// asking user to enter temperature in fahrenheit
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");//asking user to enter wind speed in mph
        double windSpeed = sc.nextDouble();
		
		// printing the output
        System.out.println("The wind chill temperature is " + calculateWindChill(temperature, windSpeed));
		
		// closing the scanner
        sc.close();
    }
}