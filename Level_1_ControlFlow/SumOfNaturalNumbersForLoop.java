import java.util.*;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Computing the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Computing the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i; // Adding the current number to the sum
            }

            // Comparing the two results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Verifying both results
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
