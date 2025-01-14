//Importing java util package for Scanner class
import java.util.Scanner;
// Importing java util package for random class
import java.util.Random;

public class NumberGuessingGame {

   
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low  + 1) + low;
    }

  
    public static String getFeedback(int guess) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
        return sc.nextLine().toLowerCase();
    }

    
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100 and I will try to guess it!");

        do {
           
            guess = generateGuess(low, high);

            // Get user feedback on the guess
            feedback = getFeedback(guess);

            // Adjust the range based on user feedback
            if (feedback.equals("high")) {
                high = guess - 1; 
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }

        } while (!feedback.equals("correct"));  

        System.out.println("Yay! I guessed your number correctly!");
    }

    public static void main(String[] args) {
		// Calling the playGame method;
        playGame();
    }
}
