import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        populateDeck();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values())
            for (RankType rank: RankType.values()){
            Card card = new Card(suit, rank);
            this.cards.add(card);
        }

    }


    public int countDeck() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }
}
