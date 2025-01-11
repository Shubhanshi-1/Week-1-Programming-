// importing java util package for Scanner class
import java.util.Scanner;

public class ChocolatesDivision {
    public static int[] divideChocolates(int numOfChocolates, int numOfChildren) {
        return new int[]{numOfChocolates / numOfChildren, numOfChocolates % numOfChildren};
    }

    public static void main(String[] args) {
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");  // asking user to enter number of chocolates
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: "); // asking user to enter number of children
        int children = sc.nextInt(); // scanning input 
        int[] chocolatesResult = divideChocolates(chocolates, children);
        System.out.println("Each child gets " + chocolatesResult[0] + " chocolates, remaining: " + chocolatesResult[1]);
		
		// closing the scanner
        sc.close();
    }
}