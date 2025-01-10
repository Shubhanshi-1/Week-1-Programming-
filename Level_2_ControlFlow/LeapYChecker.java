public class LeapYChecker {

    // Method containing a single if statement including logical operators
    public static String checkLeapYWithSingleIf(int year) {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return year + " is a Leap Year.";
        } else if (year >= 1582) {
            return year + " is not a Leap Year.";
        } else {
            return "Invalid year. The year must be >= 1582.";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Using a single if condition containing logical operators:");
        System.out.println(checkLeapYWithSingleIf(year));

        scanner.close();
    }
}

