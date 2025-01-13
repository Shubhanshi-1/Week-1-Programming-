
// Importing Random class from util package
import java.util.Random;
// Creating EmployeeBonus Class to compute bonus
public class EmployeeBonus {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] employees = new int[10][2]; // [Salary, Years of Service]
        double[][] results = new double[10][3]; // [Old Salary, Bonus, New Salary]
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < 10; i++) {
            employees[i][0] = 30000 + random.nextInt(50000); // Random salary
            employees[i][1] = 1 + random.nextInt(10); // Random years of service

            double bonus = employees[i][1] > 5 ? employees[i][0] * 0.05 : employees[i][0] * 0.02;
            double newSalary = employees[i][0] + bonus;

            results[i][0] = employees[i][0];
            results[i][1] = bonus;
            results[i][2] = newSalary;

            totalOldSalary += employees[i][0];
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, employees[i][0], employees[i][1], bonus, newSalary);
        }

        System.out.printf("Total\t\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }
}



