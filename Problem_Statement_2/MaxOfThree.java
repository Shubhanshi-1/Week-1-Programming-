//Import java util package for Scanner class
import java.util.Scanner;

public class MaxOfThree {

    // Implementing method to take input from user
    public static int getInput(String prompt, Scanner sc) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print(prompt);
            sc.next(); 
        }
        return sc.nextInt();
    }

    //Implementing method to find the maximum of three numbers
    public static int findMaxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to find the maximum:");
        int number1 = getInput("Enter the first number: ", sc);
        int number2 = getInput("Enter the second number: ", sc);
        int number3 = getInput("Enter the third number: ", sc);

        int maximum = findMaxOfThree(number1, number2, number3);
        System.out.println("The maximum of the three numbers is: " + maximum);

       //Closing the Scanner
        sc.close();
    }
}
