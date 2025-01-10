import java.util.*;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number >= 0) {
            int factorial = 1; // Initializing factorial to 1

            // Computing the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiplying the current number
            }

            // printing the results
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
