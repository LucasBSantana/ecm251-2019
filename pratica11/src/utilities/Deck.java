package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Carta> cartas;

    public Deck(){
        cartas = new ArrayList<Carta>();
        for(NaipeCartas naipe : NaipeCartas.values()){
            for(ValorCartas valor : ValorCartas.values()){
                cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public List<Carta> mostrarCartas(){
        return cartas;
    }

    public List<Carta> getCartasAleatorias(int quantiaDeCartas) {
        List<Carta> cartasARetornar = new ArrayList<>();
        for (int i = 0; i<quantiaDeCartas; i++){
            Carta carta = cartas.remove(new Random().nextInt(cartas.size()));
            cartasARetornar.add(carta);
        }
        return cartasARetornar;
    }
}
