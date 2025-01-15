//Import java util package for Scanner class
import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Implement method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Outer loop iterates through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop checks if the character is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Creating a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Implement method to calculate frequency of unique characters in a string
    public static String[][] calculateFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Finding unique characters in the string
        char[] uniqueChars = uniqueCharacters(text);

        // Creating a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through unique characters to store their frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(charFrequency[uniqueChars[i]]);
        }

        return result;
    }

    // Implement method to display the result in tabular format
    public static void displayFrequencies(String[][] frequencies) {
        System.out.println("Character Frequencies:");
        System.out.println("-----------------------");
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("-----------------------");

        for (String[] entry : frequencies) {
            System.out.printf("%-10s %-10s\n", entry[0], entry[1]);
        }

        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Calculating character frequencies
        String[][] frequencies = calculateFrequencies(inputText);

        // Displaying the result
        displayFrequencies(frequencies);

        sc.close();
    }
}
