import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> cards;

    public Player(String name){
        this.cards = new ArrayList<Card>();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
