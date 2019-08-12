package game.poker;

import utilities.Carta;

import java.util.List;

public class Mao {
    private List<Carta> cartas;

    public Mao(List<Carta> cartaList) {
        cartas = cartaList;
    }

    public List<Carta> getMao() {
        return cartas;
    }
}
