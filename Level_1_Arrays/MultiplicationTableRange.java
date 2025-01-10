//importing util package for scanner class
import java.util.*;

public class MultiplicationTableRange {
    public static void main(String[] args) {
		// creating sc as an object
        Scanner sc = new Scanner(System.in);

        //taking the number from the user
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[4];

        // Process: Store results in the array
        for (int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        // Output: Print the table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 6]);
        }
// closing of the scanner class
        sc.close();
    }
}
