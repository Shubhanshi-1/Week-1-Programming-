// Import java util package for sc class
import java.util.Scanner;

public class VowelConsonantCounter {

    //  Implement method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char c) {
        // Converting the character to lowercase using ASCII values
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32); // Convert to lowercase
        }

        // Checking if the character is a letter
        if (c >= 'a' && c <= 'z') {
            // Checking if it's a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Implemeting method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            String result = checkVowelOrConsonant(c);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = sc.nextLine();

        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(inputText);

        // Displaying the result
        System.out.println("\nResult:");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

          //Closing the scanner
        sc.close();
   }
}