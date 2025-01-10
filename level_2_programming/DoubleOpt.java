import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Variables a, b, c of double type
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Perform double operations
        double result1 = a + b * c;          // Multiplication first, then addition
        double result2 = a * b + c;          // Multiplication first, then addition
        double result3 = c + a / b;          // Division first, then addition
        double result4 = a % b + c;          // Modulus first, then addition

        // Output the results
        System.out.println("The results of Double Operations are:");
        System.out.printf("a + b * c = %.2f%n", result1);
        System.out.printf("a * b + c = %.2f%n", result2);
        System.out.printf("c + a / b = %.2f%n", result3);
        System.out.printf("a %% b + c = %.2f%n", result4);

        // Close scanner
        scanner.close();
    }
}
