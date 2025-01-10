// importing java util package for scanner class
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of persons as input
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [0] = weight, [1] = height, [2] = BMI
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // taking weight and height for each person from user
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Input weight
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid weight. Enter a positive value for weight: ");
                personData[i][0] = sc.nextDouble();
            }

            // Input height
            System.out.print("Height (m): ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid height. Enter a positive value for height: ");
                personData[i][1] = sc.nextDouble();
            }

            // Calculating BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determining weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < =39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Displaying results for each person
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n",
                              (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
