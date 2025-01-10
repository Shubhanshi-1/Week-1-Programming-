
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
		// Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Asking the user to enter two number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
		
		// Asking the user to enter operation
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();

        //Performing operation based on the operator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
		// Closing the scanner
        sc.close();
    }
}
