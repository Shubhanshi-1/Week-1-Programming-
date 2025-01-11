// Importing java util package for Scanner class
import java.util.*;

public class BMI_Calculator {

    // Implementing method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightInCm = data[i][1];  // Height in cm
            double heightInMeters = heightInCm / 100;  // Converting height into meters
            double bmi = weight / (heightInMeters * heightInMeters);  // Formula for BMI
            data[i][2] = bmi;  // Storing the BMI value in the third column of the array
        }
    }

    // Implementing method to determine BMI status for each person and return an array of statuses
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  // Get the BMI for each person
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
		// Creating object for scanner 
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];  // 10 persons, 3 columns (Weight, Height, BMI)

        // Taking input from user
        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();  // Weight input
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();  // Height input
        }

        // Calculating the BMI for each person
        calculateBMI(data);

        // Getting BMI status for each person
        String[] bmiStatus = getBMIStatus(data);

        // Displaying the results
        System.out.println("\nBMI Calculation and Status:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI     | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %12.2f | %11.2f | %7.2f | %s%n", (i + 1), data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}
