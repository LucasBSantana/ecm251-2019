package utilities;

public class Carta {
    private NaipeCartas naipe;
    private ValorCartas valor;

    public Carta(NaipeCartas naipe, ValorCartas valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "" + valor + " " + naipe;
    }
}
