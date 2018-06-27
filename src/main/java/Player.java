import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> hand;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
