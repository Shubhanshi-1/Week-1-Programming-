// importing java util package for Scanner class
import java.util.*;

public class FactorAnalysis {

    // Function to find factors 
    public static int[] findFactors(int number) {
        int count = 0;

        // Counting the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initializing the array with the count
        int[] factors = new int[count];
        int index = 0;

        // saving the factors in an array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors; // returning factors to the function
    }

    // Method to find the sum of all the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of all the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of all the factors
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
		
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);

        // Taking the input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

      
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find and display the sum of factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);


        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);

     
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }
}
