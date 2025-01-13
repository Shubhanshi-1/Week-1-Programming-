//Import java util package for Scanner class
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    
    public static void generateNumberFormatException(String text) {
        
        int number = Integer.parseInt(text);  // This will generate NumberFormatException if text is not a valid number
        System.out.println("Parsed number: " + number);
    }


    public static void handleNumberFormatException(String text) {
        try {
            
            int number = Integer.parseInt(text);  // This will generate NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("Caught NumberFormatException: Invalid number format. Please enter a valid integer.");
        } catch (RuntimeException e) {
            // Handling other RuntimeExceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asking user to provide the input
        System.out.println("Enter a string to convert to a number:");
        String inputText = sc.nextLine();

        // Call the method to generate the exception (this will cause the program to stop abruptly)
        System.out.println("\nGenerating NumberFormatException:");
        generateNumberFormatException(inputText);

        // Call the method to handle the exception using try-catch block
        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(inputText);
   
        // Closing the Scanner
         sc.close();
    }
}
