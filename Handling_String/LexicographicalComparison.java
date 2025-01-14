//Importing java util package for Scanner
import java.util.Scanner;

public class LexicographicalComparison {

    public static int compareStrings(String string1, String string2) {
        int len1 = string1.length();
        int len2 = string2.length();
        int minLength = Math.min(len1, len2);

        //Comparing character by character
        for (int i = 0; i < minLength; i++) {
            char ch1 = string1.charAt(i);
            char ch2 = string2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        
        return len1 - len2; 
    }

    public static void main(String[] args) {
		//Creat scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String string2 = sc.nextLine();

        // Compare strings and display result
        int result = compareStrings(string1, string2);
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" in lexicographical order.");
        }
         
		 // Closing the Scanner
        sc.close();
    }
}
