////importing util package for scanner class
import java.util.*;

public class ArrayCopy {
    public static void main(String[] args) {
		// sc is an object here
        Scanner sc = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Creating a 2D array
        int[][] matrix = new int[rows][columns];

        // Taking user input for the 2D array
        System.out.println("Enter the elements of the 2D array (matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Creating a 1D array to copy elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copyiing elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("The 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
