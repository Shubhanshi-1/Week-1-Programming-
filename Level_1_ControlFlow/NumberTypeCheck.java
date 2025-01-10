import java.util.Scanner;

public class NumberTypeCheck {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Determining whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

       
        sc.close();
    }
}
