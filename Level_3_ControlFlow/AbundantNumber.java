// Importing Scanner class from util package for user input
import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Input: // Ask the user to enter numeber
        System.out.print("Enter an integer to check if it's an Abundant number: ");
        int number = sc.nextInt();

        int sum = 0; // Initializing sum to store the sum of divisors

        //Find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum += i;
            }
        }

        //Checking  if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
		
        scanner.close();
    }
}
