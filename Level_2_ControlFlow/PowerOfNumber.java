import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Creating a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Getting user input for the number and power
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initializing the result variable
        int result = 1;

        // starting the loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  
        }

        // Printing the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
