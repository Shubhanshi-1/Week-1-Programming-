//Import java util package for Scanner class
import java.util.Scanner;

public class UniqueCharactersFinder {

    // Implementing method to find the length of the string without using length()
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Implementing method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Finding unique characters
        char[] uniqueCharacters = findUniqueCharacters(inputText);

        // Display the result
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
