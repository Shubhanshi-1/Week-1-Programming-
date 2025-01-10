import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing the total sum
        double total = 0.0;

        // Infinite loop for taking user input
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userInput = sc.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (userInput <= 0) {
                break;
            }

            total += userInput; // Add the user input to the total
        }

        // Printing the total sum
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
