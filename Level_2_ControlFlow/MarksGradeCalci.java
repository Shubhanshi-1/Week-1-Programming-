import java.util.Scanner;

public class MarksGradeCalci {

    public static void main(String[] args) {
        Scanner sc = new Sc(System.in);

        // Input marks from user for Phy, Chem, and Maths
        System.out.print("Enter marks for Physics: ");
        int phy = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chem = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        // Calculating total, average, and percentage
        int total = phy + chem + maths;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Outstanding";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Average Marks: %.2f\n", average);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
