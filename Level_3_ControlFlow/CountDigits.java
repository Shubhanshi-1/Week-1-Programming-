
import java.util.*;
// Creating CountDigits Class to count number of digits
public class CountDigits {
    public static void main(String[] args) {
		// Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter an integer to count its digits: ");
        int number = sc.nextInt();

        int count = 0; // Initialize count to 0

        // Process: Count digits by removing one digit in each iteration
        while (number != 0) {
            number /= 10; 
            count++; 
        }

        // Displaying the number of digits
        System.out.println("The number of digits is: " + count);
		
        sc.close();
    }
}
