import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Salary and Bonus
        System.out.print("Enter your salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output the result
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence, Total Income is INR %.2f.%n", 
                          salary, bonus, totalIncome);

        // Close scanner
        scanner.close();
    }
}
