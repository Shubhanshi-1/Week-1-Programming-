//Import java util package for Scanner class
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Implement method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters (256 ASCII values)

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Finding the first non-repeating character
        char firstNonRepeating = findFirstNonRepeating(inputText);

        // Displaying the result
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
}
