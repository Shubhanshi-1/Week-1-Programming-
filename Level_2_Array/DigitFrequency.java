// importing java util package for scanner class
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take the number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // taking input

        // Handling negative numbers
        if (number < 0) {
            number = -number;
        }

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Extracting digits and calculate frequency
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Displaying frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
