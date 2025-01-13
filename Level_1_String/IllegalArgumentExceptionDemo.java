//Import java util package for Scanner class
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    
    public static void generateIllegalArgumentException(String str) {
       
        System.out.println(str.substring(5, 2));  // This will generate IllegalArgumentException
    }

   
    public static void handleIllegalArgumentException(String str) {
        try {
            // Trying to call substring with invalid indices
            System.out.println(str.substring(5, 2));  // This will generate IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: Invalid start or end index for substring.");
        } catch (RuntimeException e) {
            // Handling other RuntimeException cases
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        // Calling the method to generate the exception (this will cause the program to stop abruptly)
        System.out.println("Generating IllegalArgumentException:");
        generateIllegalArgumentException(inputString);

        // Calling the method to handle the exception using try-catch block
        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(inputString);
         // Closing the Scanner
        sc.close();
    }
}
