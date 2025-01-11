// importing java util package for Scanner class
import java.util.Scanner;

public class LeapYChecker {

    // Method to check if a year is a leap year or not
    public static boolean isLeapY(int year) {
        if (year < 1582) {
            return false; 
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
		// creating scanner object as obj
        Scanner obj = new Scanner(System.in);

        // asking user to enter a year
        System.out.print("Enter a year: ");
        int year = obj.nextInt();

        // Checking if the year is valid or not
        if (year < 1582) {
            System.out.println("The year entered is before the Gregorian calendar system (1582). Exiting...");
            return;
        }

        // Determining if the year is a leap year
        if (isLeapY(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
            // closing the scanner
        obj.close();
    }
}
