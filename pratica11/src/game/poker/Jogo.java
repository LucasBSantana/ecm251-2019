package game.poker;

import utilities.Carta;
import utilities.Deck;

public class Jogo {
    private Deck deck;
    private Crupiê crupiê;
    private Mao mao;

    public Jogo(){
        deck = new Deck();
        crupiê  = new Crupiê();
    }


    public void jogar(){
        mao = crupiê.entregar(deck);
        for (Carta carta : mao.getMao()){
            System.out.println("Carta: " + carta);
        }
    }
}
