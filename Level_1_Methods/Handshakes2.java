 // importing java util package for scanner class
import java.util.*;

public class Handshakes2 {

    public static void main(String[] args) {
		
		// creating sc object as sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: "); // asking user to enter the number of handshakes
        int students = sc.nextInt();
		
		int handshakes = (students * (students - 1)) / 2; 
        System.out.println("The maximum number of handshakes is " + handshakes);
		
		// closing the sc
        sc.close();
    }
}