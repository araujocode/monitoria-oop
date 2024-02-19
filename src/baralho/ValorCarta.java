package baralho;

public enum ValorCarta {
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    Q(8, "Q"),
    J(9, "J"),
    K(10, "K"),
    A(11, "A"),
    DOIS(12),
    TRES(13);

    private final int prioridade;
    private final String letra;

    ValorCarta(int prioridade) {
        this.prioridade = prioridade;
        this.letra = null;
    }

    ValorCarta(int prioridade, String letra) {//Sobrecarga de método construtor (privado implicitamente pois é enum)
        this.prioridade = prioridade;
        this.letra = letra;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getLetra() {
        return letra;
    }
}

