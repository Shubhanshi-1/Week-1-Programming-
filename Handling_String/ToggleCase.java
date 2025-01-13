// Import java util package for Scanner class
import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            // Checking the case of character and toggle its case
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                // Append non-alphabetic characters without change
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string as input from user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Toggle case and display the result
        String result = toggleCase(input);
        System.out.println("Toggled case string: " + result);
          
		  // Closing the Scanner
        sc.close();
    }
}
