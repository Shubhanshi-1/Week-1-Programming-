import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Createing a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking if the number is a natural number (0 or positive)
        if (number >= 0) {
            // Calculating the sum of the first n natural numbers using the formula
            int sum = number * (number + 1) / 2;

            // Displaying the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Displaying that the input is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        
        sc.close();
    }
}
