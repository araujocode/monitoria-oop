package baralho;

public enum ValorCarta {
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    Q(12, "Q"),
    J(11, "J"),
    K(13, "K"),
    A(14, "A"),
    DOIS(2),
    TRES(3);

    private final int prioridade;
    private final String letra;

    ValorCarta(int prioridade) {
        this.prioridade = prioridade;
        this.letra = null;
    }

    ValorCarta(int prioridade, String letra) {
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

