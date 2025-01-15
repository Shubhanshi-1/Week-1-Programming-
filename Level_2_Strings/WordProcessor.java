//Import java util package for Scanner class
import java.util.Scanner;

public class WordProcessor {

    // Implementing method to find the length of a string without using length() method
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Implementing method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 1;

        // Counting words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create array to store words
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

    // Implement method to find shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordData) {
        String shortestWord = wordData[0][0];
        String longestWord = wordData[0][0];
        int shortestLength = Integer.parseInt(wordData[0][1]);
        int longestLength = shortestLength;

        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);

            if (currentLength < shortestLength) {
                shortestWord = wordData[i][0];
                shortestLength = currentLength;
            }

            if (currentLength > longestLength) {
                longestWord = wordData[i][0];
                longestLength = currentLength;
            }
        }

        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String inputText = sc.nextLine();

        // Splitting text into words
        String[] words = customSplit(inputText);

        // Getting words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Finding shortest and longest strings
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Displaying results
        System.out.println("\nShortest and Longest Words:");
        System.out.println("---------------------------");
        System.out.println("Shortest Word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest Word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");

        //Closing the Scanner
		sc.close();
    }
}
