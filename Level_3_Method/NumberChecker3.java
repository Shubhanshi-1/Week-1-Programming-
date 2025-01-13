// Import All class from util package
import java.util.*;
// Create NumberChecker3 Class to check the number on given conditions
public class NumberChecker3{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }



    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }


    // Method to find the frequency of each digit in the number
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
        int number = 121; // You can test with other numbers as well

        System.out.println("Count of digits: " + countDigits(number));

        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number)));

        int[] reversedDigits = reverseDigitsArray(getDigitsArray(number));
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        System.out.println("Is Palindrome: " + isPalindrome(number));

        System.out.println("Sum of digits: " + sumOfDigits(number));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies: ");
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
    }
}
