import java.util.Scanner;

public class TrimString {

    // Method to find the starting and ending indices to trim leading and trailing spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from the string using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder trimmedText = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedText.append(text.charAt(i));
        }
        return trimmedText.toString();
    }

    // Method to compare two strings using charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
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

        // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputText = scanner.nextLine();

        // Trim spaces using charAt() method
        int[] trimIndexes = findTrimIndexes(inputText);
        String trimmedTextCharAt = createSubstring(inputText, trimIndexes[0], trimIndexes[1]);

        // Trim spaces using built-in trim() method
        String trimmedTextBuiltIn = inputText.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedTextCharAt, trimmedTextBuiltIn);

        // Display the results
        System.out.println("Trimmed text using charAt() method: '" + trimmedTextCharAt + "'");
        System.out.println("Trimmed text using built-in trim() method: '" + trimmedTextBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}
