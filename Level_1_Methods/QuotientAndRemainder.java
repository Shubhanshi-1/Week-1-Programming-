// importing java util package for Scanner class
import java.util.*;

public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) { // function to find reaminder and quotient
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
		
		// creating scanner object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");// asking the user to enter a number
        int dividend = sc.nextInt(); // Scanning input
        System.out.print("Enter divisor: ");// asking user to enter divisor 
        int divisor = sc.nextInt();
        int[] quotientRemainder = findRemainderAndQuotient(dividend, divisor);
        System.out.println("Quotient: " + quotientRemainder[0] + ", Remainder: " + quotientRemainder[1]);
		
		// closing the scanner
        sc.close();
    }
}