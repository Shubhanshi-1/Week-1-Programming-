
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //taking the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing the greatestFactor variable
        int greatestFactor = 1;

        //Starting Loop from number-1 to 1
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {  
                greatestFactor = i;  
                break;  
            }
        }

        // Printing the greatest factor
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        
        // Close the scanner
        sc.close();
    }
}
