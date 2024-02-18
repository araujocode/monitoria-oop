package baralho;

public class CartaNormal extends Carta {
    private final ValorCarta valorCarta;

    public CartaNormal(String naipe, String valor, ValorCarta valorCarta) {
        super(naipe, valor);
        this.valorCarta = valorCarta;
    }


    @Override
    public int getValorTruco() {
        return valorCarta.getPrioridade();
    }
    public int compararTruco(CartaNormal outraCarta) {
        return Integer.compare(this.getValorTruco(), outraCarta.getValorTruco());
    }
}
