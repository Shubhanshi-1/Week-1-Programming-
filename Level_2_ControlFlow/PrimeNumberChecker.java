import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing isPrime to true
        boolean isPrime = true;

        // Check if number is greater than 1 or not
        if (number > 1) {
            // Loop starting from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // Number is divisible by i, not a prime number
                    isPrime = false;
                    break;
                }
            }
        } else {
            // Numbers less than or equal to 1 are not prime
            isPrime = false;
        }

        // Printing result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}
