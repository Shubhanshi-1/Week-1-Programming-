import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Sides of the triangular park
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds required
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);

        // Close scanner
        scanner.close();
    }
}
