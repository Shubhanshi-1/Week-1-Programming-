// importing java util package for sc class
import java.util.Scanner;

public class FriendsComparison {

    // Implementing method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];
          
		  // Loop from 1 to length od ages
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    //  Implementing method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double maximumHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maximumHeight) {
                maximumHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing data for the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input ages and heights
        System.out.println("Enter the age and height for Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": "); // taking input
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": "); // taking input
            heights[i] = sc.nextDouble();
        }

        // Determining youngest and tallest
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Displaying the output
        System.out.println("\nResults:");
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // closing the scanner
		sc.close();
    }
}
