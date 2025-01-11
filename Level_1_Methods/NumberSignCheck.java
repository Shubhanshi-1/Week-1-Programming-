// importing java util package for Scanner class
import java.util.Scanner;

public class NumberSignCheck { // number sign check function
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
		// creating sc as scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); // asking user to enter a number
        int number = sc.nextInt(); // Scanning the input
        System.out.println("The number is " + (checkNumberSign(number) == 1 ? "Positive" : checkNumberSign(number) == -1 ? "Negative" : "Zero"));
		
		// closing the scanner
        sc.close();
    }
}