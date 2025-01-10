import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input weight and height from user
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Converting  height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determining weight status
        String status;
        if (bmi < 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.4 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Displaying results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
