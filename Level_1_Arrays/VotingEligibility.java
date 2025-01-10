// importing scanner class from util package
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
		// implementing scanner
        Scanner sc = new Scanner(System.in);

        // Defining an array to store ages of 10 students
        int[] ages = new int[10];

        // Getting ages of students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
