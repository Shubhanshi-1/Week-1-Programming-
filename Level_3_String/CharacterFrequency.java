//Import java util package for Scanner
import java.util.Scanner;

public class CharacterFrequency {

    // Implement method to calculate character frequencies in a string
    public static String[][] calculateFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Determining the size of the 2D array (unique characters only)
        int uniqueCount = 0;
        for (int freq : charFrequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Creating a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(charFrequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    // Implement method to display the result in a tabular format
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

        //Closing the Scanner
        sc.close();
    }
}
