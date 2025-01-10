// importing util package for scanner class
import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
		// sc is an object here
        Scanner sc = new Scanner(System.in);

        // Defining an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // taking input heights of players
        System.out.println("Enter the 
		heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculating and printing the Output: Mean height
        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);
// closing of the scanner class
        sc.close();
    }
}
