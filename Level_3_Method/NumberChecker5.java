
// Importing All class from util package
import java.util.*;
// Creating NumberChecker5 Class to check the number on given conditions
public class NumberChecker5{

    // Implementing a method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Implementing a method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last factor is the greatest proper factor
    }

    // Implementing method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Implementing method to find the product of the factors using the factors array
    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Implementing method to find the product of the cube of the factors using the factors array
    public static long productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Implementing method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Excluding the number itself
            sum += factors[i];
        }
        return sum == number;
    }

    // Implementing method to find if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum > number;
    }

    // Implementing method to find if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum < number;
    }

    // Implementing method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    // Helper method to store the digits of the number in a digits array
    private static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; // You can test with other numbers as well

        System.out.println("Factors: " + Arrays.toString(findFactors(number)));

        System.out.println("Greatest Factor: " + findGreatestFactor(number));

        System.out.println("Sum of Factors: " + sumOfFactors(number));

        System.out.println("Product of Factors: " + productOfFactors(number));

        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}



