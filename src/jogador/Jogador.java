package jogador;

import baralho.Carta;
import java.util.ArrayList;
import java.util.List;

public abstract class Jogador {
    protected String nome;
    protected List<Carta> mao;
    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    // Método para retornar a lista de cartas na mão do jogador
    public List<Carta> getMao() {
        return mao;
    }

    // Método para jogar uma carta
    public abstract Carta jogarCarta();

    // Método para receber uma carta
    public void receberCarta(Carta carta) {
        mao.add(carta);
    }
}