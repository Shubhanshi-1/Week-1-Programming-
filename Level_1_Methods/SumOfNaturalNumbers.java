// importing java util package for Scanner class
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {// function to get the sum
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
		// creating sc object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); // asking user to enter a number
        int n = sc.nextInt();
        System.out.println("The sum of the first " + n + " natural numbers is " + sumOfNaturalNumbers(n));
		
		// closing the Scanner
        sc.close();
    }
}
