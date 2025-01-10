import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num >= 1) {
            // Printing odd and even numbers from 1 to the number entered by user
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("Please enter a natural number>0");
        }

        sc.close();
    }
}
