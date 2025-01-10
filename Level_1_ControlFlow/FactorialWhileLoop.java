import java.util.*;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number >= 0) {
            int factorial = 1; // Initializing factorial to 1
            int counter = 1;

            // Computing the factorial using a while loop
            while (counter <= number) {
                factorial *= counter; // Multiplying the current counter
                counter++; // Incrementing the counter
            }

            // Displaying the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
