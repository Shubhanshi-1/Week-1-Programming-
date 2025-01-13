// Import java util package for Scanner class
import java.util.Scanner;

public class UppercaseConversionDemo {

    
    public static String convertToUppercaseUsingCharAt(String text) {
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
        
            if (ch >= 'a' && ch <= 'z') {
                res.append((char) (ch - 32)); 
            } else {
                res.append(ch);  // Keep the character as is if it's already uppercase or non-alphabetical
            }
        }
        
        return res.toString();
    }

    // Method to compare two strings and return a boolean res
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);  // Returns true if both strings are equal, false otherwise
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter the text:");
        String inputText = sc.nextLine();

        // Converting the text using the user-defined method
        String upperCaseUsingCharAt = convertToUppercaseUsingCharAt(inputText);

        // Converting the text using the String built-in method
        String upperCaseUsingBuiltIn = inputText.toUpperCase();

        // Comparing both ress
        boolean isEqual = compareStrings(upperCaseUsingCharAt, upperCaseUsingBuiltIn);

        // Displaying the ress
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Uppercase using charAt(): " + upperCaseUsingCharAt);
        System.out.println("Uppercase using built-in toUpperCase(): " + upperCaseUsingBuiltIn);
        System.out.println("\nAre both uppercase ress the same? " + isEqual);
          
		  // Closing the Scanner
        sc.close();
    }
}
