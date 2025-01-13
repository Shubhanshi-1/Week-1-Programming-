// Importing Scanner class from util package for user input
import java.util.Scanner;
// Creating DistanceAndLine Class to compute length of line
public class DistanceAndLine {
    public static void main(String[] args) {
        Scanner sc = new sc(System.in);

        // // Asking the user to enter the coodinates of first point
        System.out.println("Enter coordinates of first point (x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Asking the user to enter the coodinates of second point
        System.out.println("Enter coordinates of second point (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculating Euclidean distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Euclidean Distance: "+ distance);

        // Calculating line equation
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - (slope * x1);
        System.out.println("Line Equation: y ="+slope +", "+ yIntercept);
       
        // Closing the scanner
        sc.close();
    }
}




