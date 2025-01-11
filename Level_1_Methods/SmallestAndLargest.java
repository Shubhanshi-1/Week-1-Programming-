// importing java util package for Scanner class
import java.util.Scanner;

public class SmallestAndLargestProgram {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) { // function to find which number is smallest and which number is largest
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest}; // returning the smallest and largest number to main function
    }

    public static void main(String[] args) {
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: "); // asking user to enter the numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("The smallest is " + result[0] + " and the largest is " + result[1]);
		// closing the scanner
        sc.close();
    }
}