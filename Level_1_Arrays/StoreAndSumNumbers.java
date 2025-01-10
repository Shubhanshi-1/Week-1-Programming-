//importing util package for scanner class
import java.util.*;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining an array to store up to 10 numbers and initialize variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (stop with 0 or a negative number):");

        // Storing numbers in the array
        while (true) {
            double input = scanner.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index++] = input;
        }

        // Calculating the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        //Displaying all numbers and the sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);
// closing of the scanner class
        sc.close();
    }
}
