// importing java util package for scanner class
import java.util.Scanner;

public class UnitConverter3 {

    //Implementing method to convert kilometers to miles
    public static double convertKm2Miles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Implementing method to convert miles to kilometers
    public static double convertMiles2Km(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Implementing method to convert meters to feet
    public static double convertMeters2Feet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Implementing method to convert feet to meters
    public static double convertFeet2Meters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Implementing method to convert yards to feet
    public static double convertYards2Feet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Implementing method to convert feet to yards
    public static double convertFeet2Yards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Implemented method to convert meters to inches
    public static double convertMeters2Inches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Implementing method to convert inches to meters
    public static double convertInches2Meters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Implementing method to convert inches to centimeters
    public static double convertInches2Centimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Implementing method to convert Fahrenheit to Celsius
    public static double convertFahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Implementing method to convert Celsius to Fahrenheit
    public static double convertCelsius2Fahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Implementing method to convert pounds to kilograms
    public static double convertPounds2Kilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Implementing method to convert kilograms to pounds
    public static double convertKilograms2Pounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Implementing method to convert gallons to liters
    public static double convertGallons2Liters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Implementing method to convert liters to gallons
    public static double convertLiters2Gallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Testing all the conversion methods that we have implemented above
        System.out.print("Enter kilometers to convert to miles: "); // asking for input
        double km = sc.nextDouble();
        System.out.println(km + " kilometers is " + convertKm2Miles(km) + " miles.");

        System.out.print("Enter miles to convert to kilometers: ");// asking for input
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is " + convertMiles2Km(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");// asking for input
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeters2Feet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");// asking for input
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeet2Meters(feet) + " meters.");

        System.out.print("Enter yards to convert to feet: ");// asking for input
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is " + convertYards2Feet(yards) + " feet.");

        System.out.print("Enter feet to convert to yards: ");// asking for input
        feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeet2Yards(feet) + " yards.");

        System.out.print("Enter meters to convert to inches: ");// asking for input
        meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeters2Inches(meters) + " inches.");

        System.out.print("Enter inches to convert to meters: ");// asking for input
        double inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInches2Meters(inches) + " meters.");

        System.out.print("Enter inches to convert to centimeters: ");// asking for input
        inches = sc.nextDouble();
        System.out.println(inches + " inches is " + convertInches2Centimeters(inches) + " centimeters.");

        System.out.print("Enter Fahrenheit to convert to Celsius: ");// asking for input
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheit2Celsius(fahrenheit) + " Celsius.");

        System.out.print("Enter Celsius to convert to Fahrenheit: ");// asking for input
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius is " + convertCelsius2Fahrenheit(celsius) + " Fahrenheit.");

        System.out.print("Enter pounds to convert to kilograms: ");// asking for input
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is " + convertPounds2Kilograms(pounds) + " kilograms.");

        System.out.print("Enter kilograms to convert to pounds: ");// asking for input
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms is " + convertKilograms2Pounds(kilograms) + " pounds.");

        System.out.print("Enter gallons to convert to liters: ");// asking for input
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallons2Liters(gallons) + " liters.");

        System.out.print("Enter liters to convert to gallons: ");// asking for input
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is " + convertLiters2Gallons(liters) + " gallons.");

// closing the scannner
        sc.close();
    }
}
