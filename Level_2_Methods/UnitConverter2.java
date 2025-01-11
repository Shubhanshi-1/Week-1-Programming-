// importing java util package for Scanner class
import java.util.*;

public class UnitConverter2 {

    // Implementing method to convert kilometers to miles
    public static double convertKm2Miles(double km) {
        double kmtomiles = 0.621371;
        return km * kmtomiles;
    }

    // Implementing method to convert miles to kilometers
    public static double convertMiles2Km(double miles) {
        double milestokm = 1.60934;
        return miles * milestokm;
    }

    // Implementing method to convert meters to feet
    public static double convertMeters2Feet(double meters) {
        double meterstofeet = 3.28084;
        return meters * meterstofeet;
    }

    // Implementing method to convert feet to meters
    public static double convertFeet2Meters(double feet) {
        double feettometers = 0.3048;
        return feet * feettometers;
    }

    // Implementinh method to convert yards to feet
    public static double convertYards2Feet(double yards) {
        double yardstofeet = 3;
        return yards * yardstofeet;
    }

    // Implementing method to convert feet to yards
    public static double convertFeet2Yards(double feet) {
        double feettoyards = 0.333333;
        return feet * feettoyards;
    }

    // Implementing method to convert meters to inches
    public static double convertMeters2Inches(double meters) {
        double meterstoinches = 39.3701;
        return meters * meterstoinches;
    }

    // Implementing method to convert inches to meters
    public static double convertInches2Meters(double inches) {
        double inchestometers = 0.0254;
        return inches * inchestometers;
    }

    // Implementing method to convert inches to centimeters
    public static double convertInches2Centimeters(double inches) {
        double inchestocm = 2.54;
        return inches * inchestocm;
    }

    public static void main(String[] args) {
		
		// Creating scanner object as sc
        Scanner sc = new Scanner(System.in);

        // Testing all the conversion methods
        System.out.print("Enter kilometers to convert to miles: ");
        double km = sc.nextDouble();
        System.out.println(km + " kilometers is " + convertKm2Miles(km) + " miles.");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is " + convertMiles2Km(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeters2Feet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeet2Meters(feet) + " meters.");

        System.out.print("Enter yards to convert to feet: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is " + convertYards2Feet(yards) + " feet.");

        System.out.print("Enter feet to convert to yards: ");
        feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeet2Yards(feet) + " yards.");

        System.out.print("Enter meters to convert to inches: ");
        meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeters2Inches(meters) + " inches.");

        System.out.print("Enter inches to convert to meters: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInches2Meters(inches) + " meters.");

        System.out.print("Enter inches to convert to centimeters: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInches2Centimeters(inches) + " centimeters.");

        sc.close();
    }
}
