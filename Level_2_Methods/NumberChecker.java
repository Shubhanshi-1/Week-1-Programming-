// importing java util package for sc class
import java.util.Scanner;

public class NumberChecker {

    // Implementing method to check whether the number is positive or negative
    public static String isPositive(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Implementing method to check if the number is even or odd
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Implementing method to compare two numbers and return 1 if num1 > num2, 0 if both are equal, or -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
		
		// Making sc as scanner object
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Asking inputs from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking each number and printing the result
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String positivity = isPositive(num);
            
            // Checking if the number is positive
            if (positivity.equals("Positive")) {
                System.out.println(num + " is " + positivity + " and " + isEvenOrOdd(num));
            } else {
                System.out.println(num + " is " + positivity);
            }
        }

        // Comparing the first and last elements of the array
        int firstEle = numbers[0];
        int lastEle = numbers[numbers.length - 1];
        int comparisonResult = compare(firstEle, lastEle);

        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
            
			// Closing the scanner
        sc.close();
    }
}
