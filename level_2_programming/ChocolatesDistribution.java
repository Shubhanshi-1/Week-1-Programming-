// Import Scanner class for user input
import java.util.Scanner; 
public class ChocolatesDistribution {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of chocolates
        System.out.println("Enter the total number of chocolates:");
        int numberOfChocolates = scanner.nextInt();

        // Prompt the user to enter the number of children
        System.out.println("Enter the total number of children:");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
