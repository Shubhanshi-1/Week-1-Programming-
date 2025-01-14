//Import java util package for Scanner class
import java.util.Scanner;

public class PalindromeChecker {

    // Implementing method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Implementing method to display the result
    public static void displayResult(String text, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a string
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if the string is a palindrome or not
        boolean result = isPalindrome(input);

        // Displaying the result
        displayResult(input, result);
          
		  //Closing the sc
        sc.close();
    }
}
