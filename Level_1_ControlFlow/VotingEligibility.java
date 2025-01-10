import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Checking if the person is eligible to vote or not
        if (age >= 18) {
            // Displaying eligibility message
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Displaying non-eligibility message
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
