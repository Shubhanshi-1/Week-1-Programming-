import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
		// Creating object for Scanner
        Scanner sc = new Scanner(System.in);

        // Defining a date format for input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Taking the first date input
            System.out.println("Enter the first date (yyyy-MM-dd):");
            String firstDateInput = sc.nextLine();
            LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

            // Taking the second date input
            System.out.println("Enter the second date (yyyy-MM-dd):");
            String secondDateInput = sc.nextLine();
            LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

            // Comparing the dates
            if (firstDate.isBefore(secondDate)) {
                System.out.println("The first date is before the second date.");
            } else if (firstDate.isAfter(secondDate)) {
                System.out.println("The first date is after the second date.");
            } else if (firstDate.isEqual(secondDate)) {
                System.out.println("The first date is the same as the second date.");
            }

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }
        
		// closing the Scanner
        sc.close();
    }
}
