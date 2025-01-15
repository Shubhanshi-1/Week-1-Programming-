//Import ajva util package for Scanner class
import java.util.Scanner;

public class WordSplitter {

    //Implement method to find the length of a string without using the length() method
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    //Implement method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 1;

        // Counting words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //Create array to store words
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extracting words using space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int wordEnd = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Implement method to return a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String inputText = sc.nextLine();

        // Splitting text into words
        String[] words = customSplit(inputText);

        // Getting words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Displaying result in tabular format
        System.out.println("\nWords and Their Lengths:");
        System.out.println("-------------------------");
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.printf("%-15s %-10d\n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }
        //Closing the Scanner
        sc.close();
    }
}
