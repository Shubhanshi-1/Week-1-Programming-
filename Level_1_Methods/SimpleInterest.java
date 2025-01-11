// importing java util package for Scanner class
import java.util.*;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100; // implementing the formula to calculate simple interest
    }

    public static void main(String[] args) {
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");// asking user to enter principle
        double principal = sc.nextDouble();// taking input
        System.out.print("Enter Rate: ");// asking user to enter rate
        double rate = sc.nextDouble(); // taking input
        System.out.print("Enter Time: ");// asking user to enter time
        double time = sc.nextDouble();// taking input
        System.out.println("The Simple Interest is " + calculateSimpleInterest(principal, rate, time));
		
		// closing the scanner
        sc.close();   
    }
}