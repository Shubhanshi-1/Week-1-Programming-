 // importing java util package for scanner class
import java.util.*;

public class Handshakes { // function Handshakes to calculate no of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2; // implementing the formula to calculate number of handshakes
    }

    public static void main(String[] args) {
		
		// creating sc object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: "); // asking user to enter the number of handshakes
        int students = sc.nextInt();
        System.out.println("The maximum number of handshakes is " + calculateHandshakes(students));
		
		// closing the sc
        sc.close();
    }
}