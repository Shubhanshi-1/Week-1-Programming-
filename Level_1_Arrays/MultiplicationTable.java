// importing util package
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number to find its multiplication table: ");
        int number = sc.nextInt();

        // Defining an array to store multiplication results
        int[] table = new int[10];

        //Storing results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        //Printing the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
// closing the scanner
        sc.close();
    }
}
