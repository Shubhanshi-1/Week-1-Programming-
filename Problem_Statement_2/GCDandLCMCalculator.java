//Import java util package for sc class
import java.util.Scanner;

public class GCDandLCMCalculator {

    // Implementing method to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int num1, int num2) {
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

   
    public static int calculateLCM(int num1, int num2) {
        // Using the formula LCM(a, b) = (a * b) / GCD(a, b)
        int gcd = calculateGCD(num1, num2);
        return (num1 * num2) / gcd;
    }

    
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("For numbers " + num1 + " and " + num2 + ":");
        System.out.println("Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("Least Common Multiple (LCM) is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

       
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

  
        displayResults(num1, num2, gcd, lcm);

        sc.close();
    }
}
