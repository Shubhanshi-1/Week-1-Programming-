// importing util package for scanner 
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
		// creating sc object
        Scanner sc = new Scanner(System.in);

        // Defining an array to store 5 numbers
        int[] numbers = new int[5];

        //Getting numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Comparing the first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }
// closing the scanner
        sc.close();
    }
}
