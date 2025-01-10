import java.util.*;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the countdown starting value: ");
        int counter = sc.nextInt();

        // Countdown using a for loop
        System.out.println("Countdown begins:");
        for (int i = counter; i > 0; i--) {
            System.out.println(i); // Printing the current value
        }
        System.out.println("Liftoff!");

        sc.close();
    }
}
