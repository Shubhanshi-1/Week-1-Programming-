import java.util.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // taking input from the user
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // checking if the number is divisible by 5 or not
        boolean isDivisible = (number % 5 == 0);

        // printing
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        
        sc.close();
    }
}
