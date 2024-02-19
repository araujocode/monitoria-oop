package jogador;

import baralho.Carta;
import java.util.Random;

public class JogadorMaquina extends Jogador {
    private Random random;

    public JogadorMaquina(String nome) {
        super(nome);
        random = new Random();
    }

    @Override
    public Carta jogarCarta() {
        // Escolhe uma carta aleatória da mão do jogador
        int indiceCarta = random.nextInt(mao.size());
        return mao.remove(indiceCarta);
    }
}
