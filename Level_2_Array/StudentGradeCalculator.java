// importing java util package for scanner class
import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Declaring arrays to store marks, percentages, and grades
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // taking marks for each student using for loop
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            // taking Physics marks from user
            System.out.print("Physics: ");
            physicsMarks[i] = sc.nextDouble();
            while (physicsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Physics: ");
                physicsMarks[i] = sc.nextDouble();
            }

            // taking Chemistry marks from user
            System.out.print("Chemistry: ");
            chemistryMarks[i] = sc.nextDouble();
            while (chemistryMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Chemistry: ");
                chemistryMarks[i] = sc.nextDouble();
            }

            // taking Maths marks from user
            System.out.print("Maths: ");
            mathsMarks[i] = sc.nextDouble();
            while (mathsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Maths: ");
                mathsMarks[i] = sc.nextDouble();
            }

            // Calculating percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            // Determining grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Displaying results for each student
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", 
                              (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
    }
}
