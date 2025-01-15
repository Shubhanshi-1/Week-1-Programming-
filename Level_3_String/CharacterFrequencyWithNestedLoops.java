//Import java package for Scanner class
import java.util.Scanner;

public class CharacterFrequencyWithNestedLoops {

    // Implement method to find the frequency of characters in a string using nested loops
    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray(); // Convert the string to a character array
        int[] frequency = new int[chars.length]; // Array to store frequency of each character
        StringBuilder result = new StringBuilder(); // StringBuilder to store the final result

        // Outer loop to iterate over each character in the text
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Check if the character is not already counted
                int count = 1;
                
                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) { // Found duplicate
                        count++;
                        chars[j] = '0'; // Set the duplicate character to '0' to avoid recounting
                    }
                }

                // Append the character and its frequency to the result
                result.append(chars[i]).append(": ").append(count).append(" times\n");
            }
        }

        return result.toString().split("\n"); // Return the result as a 1D string array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Finding the frequencies of characters
        String[] frequencies = findFrequencies(inputText);

        // Displaying the result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        sc.close();
    }
}
