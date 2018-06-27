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









}
