// Import java util package for sc class
import java.util.Scanner;

public class PrimeNumberChecker {

   // Method to check the number is prime
    public static boolean isPrime(int number) {
      
        if (number <= 1) {
            return false; 
        }

        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        // If no divisors are found, it's a prime number
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Createing a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Asking for input
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Calling the isPrime method and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
