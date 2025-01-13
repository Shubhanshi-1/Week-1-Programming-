// Import java util package for Scanner class
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

  
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
    
        System.out.println(names[10]);  // This will generate ArrayIndexOutOfBoundsException if the array size is less than 11
    }

  
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
       
            System.out.println(names[10]);  // This will generate ArrayIndexOutOfBoundsException if the array size is less than 11
        } catch (ArrayIndexOutOfBoundsException e) {
          
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (RuntimeException e) {
        
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		// Creat scanner Object
        Scanner sc = new Scanner(System.in);

        // Input: Number of names in the array
        System.out.println("Enter the number of names:");
        int size = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        // Create an array to store names based on user input
        String[] names = new String[size];

        // Input names from the user
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        // Calling the method to generate the exception (this will cause the program to stop abruptly)
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateArrayIndexOutOfBoundsException(names);

        // Calling the method to handle the exception using try-catch block
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

        // Closing the Scanner
        sc.close();
    }
}
