import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Name, cities, and distances
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken in hours for the entire journey: ");
        double timeTaken = scanner.nextDouble();

        // Calculating total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Output the result
        System.out.println("Travel Details:");
        System.out.println("Name: " + name);
        System.out.println("Journey: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Total Time Taken: %.2f hours%n", timeTaken);

        // Close scanner
        scanner.close();
    }
}
