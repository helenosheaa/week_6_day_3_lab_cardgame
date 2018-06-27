import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(){
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck.getCards());
    }

    public void dealCard(Player player) {
        Card removedCard = deck.removeCard();
        player.hand.add(removedCard);
    }

    public void play(Player player1, Player player2) {
        if (player1.hand.get(0).getRank().getValue() == player2.hand.get(0).getRank().getValue()) {
            System.out.println("It's a draw");
        }

        else if  (player1.hand.get(0).getRank().getValue()
                > player2.hand.get(0).getRank().getValue())

        {
            System.out.println("Player 1 wins");
        }

            else {
            System.out.println("Player 2 wins");
        }

    }
    }









