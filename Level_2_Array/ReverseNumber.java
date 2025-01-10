// importing java util package for scanner class
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
		// implementing scanner class 
        Scanner sc = new Scanner(System.in);
        int number;// declaring a variable number

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int length = (int) Math.log10(number) + 1;// type conversion
        int[] digits = new int[length];
// for loop
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
		// for loop
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
