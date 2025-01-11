// importing java util package for Scanner class
import java.util.*;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) { // function 
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
		
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: "); //asking user to enter angle in degrees
        double angle = sc.nextDouble();
        double[] trignoValues = calculateTrigonometricFunctions(angle);
		System.out.println("The various Trigonometric Functions for given angle are : "+)
		System.out.println("Sine Value: "+ trignoValues[0]);
		System.out.println("Cosine Value: "+ trignoValues[1]);
		System.out.println("Tangent Value: "+ trignoValues[2]);
		
		// closing the scanner
		sc.close();
	}
}