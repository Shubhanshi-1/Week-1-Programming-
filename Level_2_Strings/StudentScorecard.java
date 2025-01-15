//Import java util package for random class
import java.util.Random;
// Import java util package for Scanner class
import java.util.Scanner;

public class StudentScorecard {

    // Implement method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(51) + 50; // Physics score (50-100)
            scores[i][1] = random.nextInt(51) + 50; // Chemistry score (50-100)
            scores[i][2] = random.nextInt(51) + 50; // Math score (50-100)
        }
        return scores;
    }

    // Implement method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Implement method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Implement method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Scorecard:");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s %-10s %-10s %-6s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-8d %-8d %-8d %-8.0f %-10.2f %-10.2f %-6s\n",
                    i + 1,
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }

        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        // Generating random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculating total, average, and percentage
        double[][] results = calculateResults(scores);

        // Calculating grades
        String[] grades = calculateGrades(results);

        // Displaying the scorecard
        displayScorecard(scores, results, grades);

        sc.close();
    }
}
