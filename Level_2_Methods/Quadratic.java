// Importing java util package for Scanner class
import java.util.*;

public class Quadratic {

    // Implementing method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculate the discriminant
        
        // There will be two distinct roots if delta is positive
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            return new double[] { root1, root2 };  // Return the two roots
        }
        // There will be no real root if delta is zero 
        else if (delta == 0) {
            double root = -b / (2 * a);  // Single root
            return new double[] { root };  // Return the one root
        }
        //There will be no real roots if delta is negative
        else {
            return new double[0];  // Return an empty array
        }
    }

    public static void main(String[] args) {
		// Creating object for Scanner
        Scanner sc = new Scanner(System.in);

        // Take input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Checking if 'a' is zero, as it would not be a quadratic equation
        if (a == 0) {
            System.out.println("Not a quadratic equation. 'a' cannot be zero.");
        } else {
            // Finding the roots
            double[] roots = findRoots(a, b, c);

            // Displaying the roots based on delta value
            if (roots.length == 0) {
                System.out.println("No real roots exist.");
            } else if (roots.length == 1) {
                System.out.println("One real root: " + roots[0]);
            } else {
                System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
            }
        }

           // Clossing the Scanner
        sc.close();
    }
}
