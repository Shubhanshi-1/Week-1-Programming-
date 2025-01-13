//Import java util package for Scanner class
import java.util.Scanner;

public class SubstringComparison {

    
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the string:");
        String str = scanner.next();

        // Input start and end indices
        System.out.println("Enter the start index:");
        int start = scanner.nextInt();

        System.out.println("Enter the end index:");
        int end = scanner.nextInt();

        
        if (start < 0 || end > str.length() || start >= end) {
            System.out.println("Invalid indices. Please enter valid start and end indices.");
        } else {
            // Creating substring using charAt()
            String substringUsingCharAt = createSubstringUsingCharAt(str, start, end);

            // Creating substring using built-in substring() method
            String substringUsingBuiltIn = str.substring(start, end);

            // Comparing the two substrings
            boolean areEqual = compareUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

            // Displaying results
            System.out.println("Substring using charAt(): " + substringUsingCharAt);
            System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
            System.out.println("Are the substrings equal? " + areEqual);
        }
        
		// Closing the Scanner
        scanner.close();
    }
}
