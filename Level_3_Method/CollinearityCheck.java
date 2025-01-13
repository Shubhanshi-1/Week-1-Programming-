import java.util.Scanner;
// Creating CollinearityCheck Class to check if points are collinear
public class CollinearityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the coodinates of first point
        System.out.println("Enter coordinates of first point (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Asking the user to enter the coodinates of second point
        System.out.println("Enter coordinates of second point (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Asking the user to enter the coodinates of third point
        System.out.println("Enter coordinates of third point (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Checking collinearity using slope formula
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if (slopeAB == slopeBC && slopeBC == slopeAC) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Checking collinearity using area formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (area == 0) {
            System.out.println("The points are collinear using the area formula.");
        } else {
            System.out.println("The points are not collinear using the area formula.");
        }

        // Closing the scanner
        scanner.close();
    }
}



