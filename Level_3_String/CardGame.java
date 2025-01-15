//Importing java util package for Scanner, arraylist and list class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGame {

    // Imoplementing method to initialize the deck of cards
    public static List<String> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> deck = new ArrayList<>();

        // Initializing the deck with all cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        return deck;
    }

    // Implementing method to shuffle the deck
    public static List<String> shuffleDeck(List<String> deck) {
        int n = deck.size();
        for (int i = 0; i < n; i++) {
            // Generating a random card number between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swapping the current card with the random card
            String temp = deck.get(i);
            deck.set(i, deck.get(randomCardNumber));
            deck.set(randomCardNumber, temp);
        }
        return deck;
    }

    // Implementing method to distribute the deck to x players
    public static List<List<String>> distributeCards(List<String> deck, int numOfCards, int numOfPlayers) {
        // Checking if the cards can be distributed evenly
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }

        // Creating a 2D list to store the players and their cards
        List<List<String>> players = new ArrayList<>();
        int cardsPerPlayer = numOfCards / numOfPlayers;

        // Distributing the cards
        for (int i = 0; i < numOfPlayers; i++) {
            List<String> playerHand = new ArrayList<>();
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerHand.add(deck.remove(0)); // Take the top card from the deck
            }
            players.add(playerHand); // Add the player's hand to the players list
        }

        return players;
    }

    // Implementing method to print the players and their cards
    public static void printPlayerHands(List<List<String>> players) {
        int playerNum = 1;
        for (List<String> playerHand : players) {
            System.out.println("Player " + playerNum + "'s cards: " + playerHand);
            playerNum++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing the deck
        List<String> deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Getting user input for the number of players and cards to distribute
        System.out.print("Enter the number of players: ");
        int numOfPlayers = sc.nextInt();
        System.out.print("Enter the number of cards each player will receive: ");
        int numOfCards = sc.nextInt();

        // Distributing the cards to the players
        List<List<String>> players = distributeCards(deck, numOfCards * numOfPlayers, numOfPlayers);

        // Printing the players and their cards
        if (players != null) {
            printPlayerHands(players);
        }

        sc.close();
    }
}
