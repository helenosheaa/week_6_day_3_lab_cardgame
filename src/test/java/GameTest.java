import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Player player1;
    Player player2;
    Game game;

    @Before
    public void before() {
        game = new Game();
        deck = new Deck();
        player1 = new Player("John");
        player2 = new Player("Jill");

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
        game.dealCard(player1);
        assertEquals(1, this.player1.hand.size());
    }

    @Test
    public void player1Wins(){
        game.dealCard(player1);
        game.dealCard(player2);
        assertEquals(player1, game.play(player1, player2));

    }


    }



