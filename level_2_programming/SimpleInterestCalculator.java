// Import Scanner class from util package for user input
import java.util.Scanner; 

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.println("Enter the Principal amount:");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.println("Enter the Rate of Interest (in %):");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period
        System.out.println("Enter the Time (in years):");
        double time = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
