// Import java util package for Scanner class
import java.util.Scanner;

public class StringCharacterComparison {

    // User-defined method to return characters of a string
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.println("Enter a string:");
        String input = sc.next();

        // Getting characters using user-defined method
        char[] userDefinedResult = getCharacters(input);

        // Getting characters using built-in toCharArray() method
        char[] builtInResult = input.toCharArray();

        // Comparing the two arrays
        boolean areEqual = compareCharArrays(userDefinedResult, builtInResult);

        // Displaying results
        System.out.println("Characters using user-defined method:");
        for (char c : userDefinedResult) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using built-in toCharArray() method:");
        for (char c : builtInResult) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are the results equal? " + areEqual);

        // Closing the Scanner
        sc.close();
    }
}
