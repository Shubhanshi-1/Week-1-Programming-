//importing java util package for scanner class
import java.util.Scanner;

public class TriangularPark {
    public static int calculateRounds(double side1, double side2, double side3) { // this is a function 
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
		// creating sc as scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle in meters: ");// asking the user to enter the three sides of the triangle in meters
        double side1 = sc.nextDouble();// taking the input
        double side2 = sc.nextDouble();// taking the input
        double side3 = sc.nextDouble();
        System.out.println("The athlete needs to complete " + calculateRounds(side1, side2, side3) + " rounds.");
		
		// closing of scanner class
        sc.close();
    }
}