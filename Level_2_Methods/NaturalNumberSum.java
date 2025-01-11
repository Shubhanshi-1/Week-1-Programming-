// importing java util package for Scanner class
import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers 
    public static int sumRecur(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecur(n - 1);
    }

    // find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // asking user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Checking if the input is a natural number
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting...");
            return;
        }

        // Computing sum using recursion
        int sumRecur = sumRecur(n);

        // Computing sum using formula
        int sumFormula = sumFormula(n);

        // Displaying the results
        System.out.println("Sum using recursion: " + sumRecur);
        System.out.println("Sum using formula: " + sumFormula);

        // Comparing the results
        if (sumRecur == sumFormula) {
            System.out.println("The results match. Both computations are correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computations.");
        }

        // closing the scanner
        sc.close();
    }
}
