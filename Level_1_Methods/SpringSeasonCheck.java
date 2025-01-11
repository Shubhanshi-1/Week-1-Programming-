// importing java util package for Scanner class
import java.util.Scanner;

public class SpringSeasonCheckProgram { // Function for checking the season is spring or not
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
		
		// creating sc object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: "); // asking user to enter month
        int month = sc.nextInt();
        System.out.print("Enter day: ");// asking user to enter day
        int day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "It's Spring Season" : "Not a Spring Season");
		
		// closing the sc
        sc.close();
    }
}