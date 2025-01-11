// importing java util package for Scanner class

import java.util.*;

public class UnitConverter {

    // Implement ethod to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmtomiles = 0.621371;
        return km * kmtomiles;
    }

    // Implement method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milestokm = 1.60934;
        return miles * milestokm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meterstofeet = 3.28084;
        return meters * meterstofeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feettometers = 0.3048;
        return feet * feettometers;
    }

    public static void main(String[] args) {
		
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);

        // Testing conversion methods
        System.out.print("Enter kilometers to convert to miles: ");
        double km = sc.nextDouble();
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

        // closing the scanner
        sc.close();
    }
}
