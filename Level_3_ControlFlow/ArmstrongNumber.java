
import java.util.*;
// Creating ArmstrongNumber Class to check if the given number is armstrong or not
public class ArmstrongNumber {
    public static void main(String[] args) {
		// Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        int originalNumber = number; // Storing the original number for comparison
        int sum = 0; // Initialize sum to store the sum of cubes of digits

        //  Extracting digits and compute the sum of their cubes
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Getting the last digit
            sum += Math.pow(digit, 3); 
            originalNumber /= 10; 
        }

        // Output: Comparing the sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
		
        sc.close();
    }
}
