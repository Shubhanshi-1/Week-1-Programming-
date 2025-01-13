// Import java util package for Scanner class
import java.util.Scanner;

public class TextConversionDemo {

    
    public static String convertToLowercaseUsingCharAt(String text) {
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert to lowercase if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                res.append((char) (ch + 32));  // ASCII difference between uppercase and lowercase is 32
            } else {
                res.append(ch);  // Keep the character as is if it's already lowercase or non-alphabetical
            }
        }
        
        return res.toString();
    }

     
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);  // Returns true if both strings are equal, false otherwise
    }

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] splitTextIntoWords(String text) {
        // Split the text into words using space as delimiter
        String[] words = text.split(" ");
        String[][] wordWithLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordWithLengths[i][0] = words[i];  // Store the word
            wordWithLengths[i][1] = String.valueOf(words[i].length());  // Store the length of the word
        }
        
        return wordWithLengths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter the text:");
        String inputText = sc.nextLine();

        // Converting the text to lowercase using the user-defined method
        String lowerCaseUsingCharAt = convertToLowercaseUsingCharAt(inputText);

        // Converting the text to lowercase using the String built-in method
        String lowerCaseUsingBuiltIn = inputText.toLowerCase();

        boolean isEqual = compareStrings(lowerCaseUsingCharAt, lowerCaseUsingBuiltIn);

        
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Lowercase using charAt(): " + lowerCaseUsingCharAt);
        System.out.println("Lowercase using built-in toLowerCase(): " + lowerCaseUsingBuiltIn);
        System.out.println("\nAre both lowercase ress the same? " + isEqual);

        /
        String[][] wordWithLengths = splitTextIntoWords(inputText);
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordWithLengths.length; i++) {
            System.out.println("Word: " + wordWithLengths[i][0] + ", Length: " + wordWithLengths[i][1]);
        }
        
		// Closing the Scanner
        sc.close();
    }
}
