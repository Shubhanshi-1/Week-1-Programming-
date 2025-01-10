// importing java util package for scanner
import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// assining values to the variable
        int number, index = 0;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        System.out.print("Enter a number: ");
        number = sc.nextInt();// taking number input from user
// while loop
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
        }
// assign -1 to largest and -1 to second largest
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
