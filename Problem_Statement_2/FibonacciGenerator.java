// Import java util package for Scanner class
import java.util.Scanner;

public class FibonacciGenerator {

    // Implementing method to calculate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("The number of terms must be greater than 0.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // Calculating the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // For a newline after the sequence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user to ente3r number of terms
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = sc.nextInt();

        // Generating the Fibonacci sequence
        generateFibonacci(terms);
          
		  //Closing the Scanner
        sc.close();
    }
}
