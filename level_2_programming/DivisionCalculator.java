import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculations
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the result
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", 
                          quotient, remainder, number1, number2);

        // Close scanner
        scanner.close();
    }
}
