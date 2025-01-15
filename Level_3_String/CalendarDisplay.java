//Import ajva util package for Scanner class
import java.util.Scanner;

public class CalendarDisplay {

    // Implement method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Implement method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Checking if it's a leap year for February
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29; // Leap year
            } else {
                return 28; // Not a leap year
            }
        }
        return daysInMonth[month - 1];
    }

    // Leap year check method
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // Implement method to get the first day of the month (using Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0; // This will give the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    // Implement method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Getting month name
        String monthName = getMonthName(month);

        // Getting number of days in the month
        int numDays = getDaysInMonth(month, year);

        // Getting the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Printing the calendar header
        System.out.println("         " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Printing initial spaces based on the first day of the month
        int currentDay = 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print spaces for the first day
        }

        // Printing the days of the month
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", currentDay++);
        }
        System.out.println();

        // Printing the rest of the days in the month
        while (currentDay <= numDays) {
            for (int i = 0; i < 7 && currentDay <= numDays; i++) {
                System.out.printf("%3d ", currentDay++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Displaying the calendar
        displayCalendar(month, year);

        sc.close();
    }
}
