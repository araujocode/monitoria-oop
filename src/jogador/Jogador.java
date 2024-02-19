package jogador;

import baralho.Carta;
import java.util.ArrayList;
import java.util.List;

public abstract class Jogador { //1 - Abstração
    protected String nome; //2 - Modificador de acesso protected - encapsulamento
    protected List<Carta> mao; // Composição entre classes

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    // Método para retornar a lista de cartas na mão do jogador
    public List<Carta> getMao() {
        return mao;
    }

    // Método para jogar uma carta
    public abstract Carta jogarCarta(); // 1 - Método abstrato torna a classe abstrata tambem

    // Método para receber uma carta
    public void receberCarta(Carta carta) {
        mao.add(carta);
    }
}