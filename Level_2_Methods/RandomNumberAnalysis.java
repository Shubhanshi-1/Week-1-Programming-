// Importing java util package to get random number
import java.util.Random;

public class RandomNumberAnalysis {

    // Implementing method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            // Generating a random 4-digit number (between 1000 and 9999)
            numbers[i] = 1000 + rand.nextInt(9000);  // rand.nextInt(9000) generates a number between 0 and 8999, adding 1000 gives a 4-digit number
        }

        return numbers;
    }

    // Implementing method to find the average, min and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];  // To store average, min and max values

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);  // Find the minimum value
            max = Math.max(max, num);  // Find the maximum value
        }

        // Calculating the average
        double average = sum / numbers.length;

        // Storing the average, min, and max in the result array
        result[0] = average;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        int size = 5;  // Generate 5 random numbers
        int[] numbers = generate4DigitRandomArray(size);  // Generate 5 random 4-digit numbers

        // Finding average, min, and max of the generated numbers
        double[] result = findAverageMinMax(numbers);

        // Displaying the results
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
