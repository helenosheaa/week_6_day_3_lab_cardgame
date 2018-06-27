import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Player players;
    Game game;

    @Before
    public void before() {
        game = new Game();
        deck = new Deck();
        players = new Player("John");
    }

    @Test
    public void gameHasDeck() {
        assertEquals(52, this.deck.countDeck());
    }

    @Test
    public void removeCardFromDeck() {
        deck.removeCard();
        assertEquals(51, this.deck.countDeck());
    }

    @Test
    public void dealCard() {
        game.shuffleDeck();
        Card removedCard = deck.removeCard();
        players.hand.add(removedCard);
        assertEquals(1, players.hand.size());

    }


    }



