// Import java util package for Scanner class
import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String input) {
        int[] frequency = new int[256]; // Array to store frequencyuency of characters
        int maxFrequency = 0;
        char mostFrequentChar = '\0';

        // Counting frequencyuencies of each character
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asking user to enter a string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Finding and displaying the most frequencyuent character
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
         
		 // Closing the Scanner
        sc.close();
    }
}
