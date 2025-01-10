import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number for the multiplication table: ");
        int num = sc.nextInt();

        // printing the multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (num * i));
        }

        sc.close();
    }
}
