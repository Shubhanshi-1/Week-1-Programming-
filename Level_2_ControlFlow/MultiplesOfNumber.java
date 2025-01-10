import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Creating a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Getting user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // starting the loop from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  
                System.out.println(i);  
            }
        }
    }
}
