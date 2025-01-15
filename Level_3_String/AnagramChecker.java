//Import java util package for Scanner class
import java.util.Scanner;

public class AnagramChecker {

    // Implement method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Removing spaces and convert to lowercase to handle case-insensitivity and spaces
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Checking if lengths are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are not equal, they cannot be anagrams
        }

        // Creating arrays to store the frequency of characters in the two texts
        int[] charFrequency1 = new int[256]; // For text1
        int[] charFrequency2 = new int[256]; // For text2

        // Loop to calculate the frequency of each character in text1
        for (int i = 0; i < text1.length(); i++) {
            charFrequency1[text1.charAt(i)]++;
        }

        // Loop to calculate the frequency of each character in text2
        for (int i = 0; i < text2.length(); i++) {
            charFrequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false; // If frequencies don't match, return false
            }
        }

        return true; // If all frequencies match, return true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for two texts
        System.out.println("Enter the first text:");
        String text1 = sc.nextLine();
        System.out.println("Enter the second text:");
        String text2 = sc.nextLine();

        // Checking if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Displaying the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
