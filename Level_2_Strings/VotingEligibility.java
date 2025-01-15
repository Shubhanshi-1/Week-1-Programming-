// Import java util package for random class
import java.util.Random;
// Import java util package for Scanner
import java.util.Scanner;

public class VotingEligibility {

    // Implement method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate a random number between 10 and 99
        }
        return ages;
    }

    // Implement method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Implement method to display the 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\nAge Voting Eligibility:");
        System.out.println("---------------------------");
        System.out.printf("%-10s %-20s\n", "Age", "Eligibility");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-20s\n", row[0], row[1]);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        // Generating random ages for students
        int[] ages = generateAges(numStudents);

        // Determining voting eligibility
        String[][] eligibilityResults = determineVotingEligibility(ages);

        // Displaying results
        displayResults(eligibilityResults);

        sc.close();
    }
}
