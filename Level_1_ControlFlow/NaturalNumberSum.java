import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Computing the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Computing the sum using a while loop
            int loopSum = 0;
            int count = 1;
            while (count <= n) {
                loopSum += count; 
                count++; 
            }

            // Comparing the two results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Checking if both results are equal or not
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is an error in the computations.");
            }
        } else {
            System.out.println("The entered number is not a natural number.");
        }

        sc.close();
    }
}
