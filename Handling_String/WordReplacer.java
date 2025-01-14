//Import java util package for Scanner class
import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String target, String replacement) {
        // Replacing all occurrences of the target word with the replacement word
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Input word to replace
        System.out.println("Enter the word to replace:");
        String target = sc.nextLine();

        // Input replacement word
        System.out.println("Enter the replacement word:");
        String replacement = sc.nextLine();

        // Replacing word and displaying the result
        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + modifiedSentence);
        
		// Closing the Scanner
        sc.close();
    }
}
