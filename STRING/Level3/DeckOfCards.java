import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "J", "Q", "K", "A"};

        // create deck
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // shuffle
        Collections.shuffle(deck);

        // distribute to 4 players, 9 cards each
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (int j = 0; j < 9; j++) {
                System.out.println(deck.get(i * 9 + j));
            }
            System.out.println();
        }
    }
}
