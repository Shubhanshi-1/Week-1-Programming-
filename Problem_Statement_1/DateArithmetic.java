import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
		// Creat object for Scanner
        Scanner sc = new Scanner(System.in);

        // Defining a date format for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // ASking user to input date
        System.out.println("Enter a date in the format (yyyy-MM-dd):");
        String inputDate = sc.nextLine();

        try {
            // Parsing the input date
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Performing date arithmetic
            LocalDate modifiedDate = date.plusDays(7)   // Add 7 days
                                         .plusMonths(1) // Add 1 month
                                         .plusYears(2); // Add 2 years

            // Subtracting 3 weeks
            LocalDate finalDate = modifiedDate.minusWeeks(3);

            // Displaying the results
            System.out.println("Original Date: " + date.format(formatter));
            System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));
            System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }

        //Closing the sc
        sc.close();
    }
}
