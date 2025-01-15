//Import java util package for sc class
import java.util.Scanner;

public class TextSplitter {

    // Implementing method to find the length of a String without using built-in length() method
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    //  Implementing method to split the text into words using charAt() without using split()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 1;

        // Counting words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
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

    // Implementing method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to provide input
        System.out.println("Enter a text:");
        String inputText = sc.nextLine();

        // Spliting using custom method
        String[] customSplitResult = customSplit(inputText);

        // Spliting using built-in split() method
        String[] builtInSplitResult = inputText.split(" ");

        // Comparing results
        boolean areEqual = compareArrays(customSplitResult, builtInSplitResult);

        // Display results
        System.out.println("Custom Split Result:");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInSplitResult) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (areEqual ? "Matched" : "Not Matched"));

        sc.close();
    }
}
