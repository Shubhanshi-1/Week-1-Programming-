//importing util package for scanner class
import java.util.Scanner;

public class factorsFinder
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a number from a user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initializing variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resize it
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];

                    // Copying elements to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assigning the temp array to factors
                    factors = temp;
                }

                // Adding factor to the array
                factors[index++] = i;
            }
        }

        // Displaying the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
