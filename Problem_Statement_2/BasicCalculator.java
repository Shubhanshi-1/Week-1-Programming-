//Importing java util package for sc class
import java.util.Scanner;

public class BasicCalculator {

    // Perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    //Perform substraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; // Return NaN for division by zero
        }
        return num1 / num2;
    }

    // Displaying result
    public static void displayResult(String operation, double num1, double num2, double result) {
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        // Displaying the menu for selecting the operation
        System.out.println("Select the operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int choice = sc.nextInt();

        double result = 0;

        // Performing the selected operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                displayResult("addition", num1, num2, result);
                break;
            case 2:
                result = subtract(num1, num2);
                displayResult("subtraction", num1, num2, result);
                break;
            case 3:
                result = multiply(num1, num2);
                displayResult("multiplication", num1, num2, result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    displayResult("division", num1, num2, result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }

        sc.close();
    }
}
