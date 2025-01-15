//Import java util package for Scanner class
import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Check if the string is a palindrome by comparing characters from the start and end
    public static boolean isPalindromeByComparison(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the text and compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters are not equal, return false
            }
            start++;
            end--;
        }
        return true; // If all characters match, return true
    }

    // Logic 2: Check if the string is a palindrome using recursion
    public static boolean isPalindromeByRecursion(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index, return true
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursively check the next characters
        return isPalindromeByRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Check if the string is a palindrome using character arrays
    public static boolean isPalindromeByReversal(String text) {
        char[] originalArray = text.toCharArray(); // Convert the string to a character array
        char[] reversedArray = new char[originalArray.length];

        // Reverse the string using charAt() method
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Comparing the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; // If characters do not match, return false
            }
        }

        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Removing spaces and convert to lowercase to handle case-insensitivity and spaces
        String cleanedText = inputText.replaceAll("\\s+", "").toLowerCase();

        // Checking using Logic 1: Comparing start and end characters
        boolean isPalindrome1 = isPalindromeByComparison(cleanedText);

        // Checking using Logic 2: Using recursion
        boolean isPalindrome2 = isPalindromeByRecursion(cleanedText, 0, cleanedText.length() - 1);

        // Checking using Logic 3: Using string reversal and array comparison
        boolean isPalindrome3 = isPalindromeByReversal(cleanedText);

        // Displaying the results
        System.out.println("Palindrome check using Logic 1 (start and end comparison): " + isPalindrome1);
        System.out.println("Palindrome check using Logic 2 (recursion): " + isPalindrome2);
        System.out.println("Palindrome check using Logic 3 (string reversal and comparison): " + isPalindrome3);

        sc.close();
    }
}
