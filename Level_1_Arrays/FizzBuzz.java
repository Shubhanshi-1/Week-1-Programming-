//importing util package for scanner classimport java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Creating a String array to save the results
        String[] results = new String[number + 1];

        // Looping from 0 to the input number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiples of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiples of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; 
            } else {
                results[i] = Integer.toString(i);
            }
        }

        // Displaying the results with positions
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
