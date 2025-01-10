import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter the countdown starting value: ");
        int counter = sc.nextInt();

        // Countdown using a while loop
        System.out.println("Countdown begins:");
        while (counter > 0) {
            System.out.println(counter); 
            counter--; 
        }
        System.out.println("Liftoff!");

        sc.close();
    }
}
