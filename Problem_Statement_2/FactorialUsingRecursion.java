//Import java util package for Scanner class
import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursion to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; 
        }
        return number * calculateFactorial(number - 1); // Recursive call
    }

   
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.println("Enter a non-negative integer to calculate its factorial:");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
          
            long result = calculateFactorial(number);

            // Displaying the result
            displayResult(number, result);
        }
         
		 //Closing the scanner
        sc.close();
    }
}
