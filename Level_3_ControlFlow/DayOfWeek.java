
import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
		// Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Asking the user to enter Date, Month and Year
        System.out.print("Enter date (1-31): ");
        int d = sc.nextInt();
		System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        //implementing formula to calculate day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        //printing the output
        System.out.println("Day of the week: " + d0 + " (0=Sunday, 1=Monday, ..., 6=Saturday)");
		// Closing the scanner
        sc.close();
    }
}
