import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();

        // Swapping logic
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped numbers
        System.out.printf("The swapped numbers are %d and %d.%n", number1, number2);

        // Close scanner
        scanner.close();
    }
}
