import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Creating a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Getting user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // starting the loop from 1 to number-1
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of the number
                System.out.println(i);  // Print the factor
            }
        }
    }
}
