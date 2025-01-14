// Import java util package for Scanner class
import java.util.Scanner;

public class RemoveCharacter {

    public static String removeCharacter(String input, char charToRemove) {
        StringBuilder result = new StringBuilder();

        
        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Asking the user to enter a character to remove
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.next().charAt(0);

        // Removing character and displaying the result
        String modifiedString = removeCharacter(input, charToRemove);
        System.out.println("Modified String: \"" + modifiedString + "\"");
         // Closing the Scanner
        sc.close();
    }
}
