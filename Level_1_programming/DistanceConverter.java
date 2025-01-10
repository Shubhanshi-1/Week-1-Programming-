import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Constants
        final double FEET_PER_YARD = 3.0;
        final double YARDS_PER_MILE = 1760.0;

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Calculations
        double distanceInYards = distanceInFeet / FEET_PER_YARD;
        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Output results
        System.out.printf("Distance in yards: %.2f yards%n", distanceInYards);
        System.out.printf("Distance in miles: %.4f miles%n", distanceInMiles);

        // Close scanner
        scanner.close();
    }
}