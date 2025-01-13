// Importing All class from util package
import java.util.*;
// Creating NumberChecker2 Class to check the number on given conditions
public class NumberChecker2 {

    // Implementing a method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Implementing a method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Implementing a method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Implementing a method to find the sum of the squares of the digits of a number using the digits array
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Implementing a method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Implementing a method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2]; // Array to store digit and its frequency

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Initialize digit
        }

        for (int digit : digits) {
            frequency[digit][1]++; // Increment frequency
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; // You can test with other numbers as well

        System.out.println("Count of digits: " + countDigits(number));

        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number)));

        System.out.println("Sum of digits: " + sumOfDigits(number));

        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies: ");
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
    }
}
