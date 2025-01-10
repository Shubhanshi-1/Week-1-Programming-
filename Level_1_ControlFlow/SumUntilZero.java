import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializeing
        double total = 0.0;

        //while loop
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            double userInput = scanner.nextDouble();

            // Breaking the loop if the user enters 0
            if (userInput == 0) {
                break;
            }

            total += userInput; 
        }

        // Printing the total sum
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
