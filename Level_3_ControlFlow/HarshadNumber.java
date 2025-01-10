// Importing Scanner class from util package for user input
import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
		// Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Input: // Ask the user to enter numeber
        System.out.print("Enter an integer to check if it's a Harshad number: ");
        int number = sc.nextInt();

        int sum = 0; // Initializing sum to store the sum of digits
        int originalNumber = number; // Store the original number

        //  Extracting digits and calculate their sum
        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += digit; 
            originalNumber /= 10; 
        }

        // Checking if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
		
        sc.close();
    }
}
