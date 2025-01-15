//Import java util package for Scanner class
import java.util.Scanner;

public class BMICalculator {

    // Implement method to calculate BMI and determine BMI status
    public static String[][] calculateBMI(double[][] heightWeightData) {
        String[][] bmiData = new String[heightWeightData.length][4];

        for (int i = 0; i < heightWeightData.length; i++) {
            double weight = heightWeightData[i][0];
            double heightCm = heightWeightData[i][1];
            double heightMeters = heightCm / 100.0; // Convert cm to meters
            double bmi = weight / (heightMeters * heightMeters); // BMI formula
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            // Determining BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Storing data in 2D array
            bmiData[i][0] = String.format("%.2f", heightCm);
            bmiData[i][1] = String.format("%.2f", weight);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }

        return bmiData;
    }

    // Implement method to display the BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("BMI Report:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }

        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store weight and height data for 10 persons
        double[][] heightWeightData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeightData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightData[i][1] = sc.nextDouble();
        }

        // Calculating BMI and status
        String[][] bmiData = calculateBMI(heightWeightData);

        // Displaying the results
        displayBMIData(bmiData);

        sc.close();
    }
}



