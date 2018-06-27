import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {


    Player player;
    Card card;


    @Before
    public void before(){
        player = new Player("John");
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void getName(){
    assertEquals("John", player.getName());
    }





}


