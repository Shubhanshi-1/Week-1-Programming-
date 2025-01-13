import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are identical
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.println("Enter the first string:");
        String str1 = scanner.next();

        System.out.println("Enter the second string:");
        String str2 = scanner.next();

        // Compare strings using charAt() method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare strings using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display the results
        System.out.println("Result using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        // Verify if both methods give the same result
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }

        scanner.close();
    }
}
