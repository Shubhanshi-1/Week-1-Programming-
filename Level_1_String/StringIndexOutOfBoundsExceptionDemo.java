//Import java util package for Scanner class
import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Writing a method to generate a StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Trying to access an index that is out of bounds will throw StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()));  // Accessing an index equal to the length will throw the exception
    }

    // Writing a method to demonstrate handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Trying to access an index beyond the length of the string
            System.out.println(str.charAt(str.length()));  // This will generate StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        // Calling the method to generate the exception (this will cause the program to stop abruptly)
        System.out.println("Generating StringIndexOutOfBoundsException:");
        generateStringIndexOutOfBoundsException(inputString);

        // Calling the method to handle the exception using try-catch block
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(inputString);
         
		 // Closimg the Scanner
        sc.close();
    }
}
