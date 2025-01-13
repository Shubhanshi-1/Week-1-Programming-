import java.util.Scanner;

public class SubstringOccurrences {

    public static int countSubstringOccurrences(String mainString, String subString) {
        if (subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

      
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move index forward by the length of the substring
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to input main string
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        // Asking user to enter a substring to find 
        System.out.println("Enter the substring to find:");
        String subString = scanner.nextLine();

        // Counting the occurrences and display the result
        int occurrences = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + occurrences + " time(s) in the main string.");
          
		  // Closing the scanner
        scanner.close();
    }
}
