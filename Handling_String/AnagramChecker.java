// Import java util package for Arrays
import java.util.Arrays;
// Import java util package for Scanner class
import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Removing spaces and converting to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the length is different, they are not anagram of each other
        if (str1.length() != str2.length()) {
            return false;
        }

        // Converting strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sorting the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparing sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user to enter the first string
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        // Checking if strings are anagrams and displaying the result
        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
        // Closing the Scanner
        sc.close();
    }
}
