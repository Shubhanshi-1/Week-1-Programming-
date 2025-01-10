// importing util package for scanner
import java.util.Scanner;

public class LargestDigitsDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        while (number <= 0) {
            System.out.print("Invalid input. Please enter a positive number: ");
            number = sc.nextInt();
        }

        // Initializing variables here
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extracting digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increasing the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            digits[index] = number % 10; // Get the last digit
            number /= 10;               // Remove the last digit
            index++;
        }

        // Initializing variables for largest and second largest digits
        int largest = -1, secondLargest = -1;

        // Finding the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Updating second largest
                largest = digits[i];     // Updating largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Updating second largest
            }
        }

        // Displaying results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}
