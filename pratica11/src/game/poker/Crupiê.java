package game.poker;

import utilities.Carta;
import utilities.Deck;

import java.util.List;

public class Crupiê {
    public Mao entregar(Deck deck){
        List<Carta> cartaList = deck.getCartasAleatorias(5);
        Mao mao = new Mao(cartaList);
        return mao;
    }
}
