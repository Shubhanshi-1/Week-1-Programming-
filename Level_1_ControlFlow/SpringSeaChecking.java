import java.util.Scanner;

public class SpringSeaChecking {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Checking if the input date falls within the Spring Season (March 20 to June 20)
        boolean isSpringSeason = (month == 3 && day >= 20) || // Late March
                                 (month > 3 && month < 6) ||  // April and May
                                 (month == 6 && day <= 20);   // Early June

        // Displaying  the result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        sc.close();
    }
}
