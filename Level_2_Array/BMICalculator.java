// importing java util package for scanner class
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner class
        int numberOfPersons; // declare a variable
        System.out.print("Enter number of persons: ");
        numberOfPersons = sc.nextInt();// sc is object of scanner class

        double[][] personData = new double[numberOfPersons][3]; // 2d array
        String[] weightStatus = new String[numberOfPersons];
// for loop from 0 to less than number of persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            while (height <= 0) {
                System.out.print("Invalid height. Enter a positive value: ");
                height = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
// while loop
            while (weight <= 0) {
                System.out.print("Invalid weight. Enter a positive value: ");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
// for loop
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][0] + ", Weight: " + personData[i][1] +
                    ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
