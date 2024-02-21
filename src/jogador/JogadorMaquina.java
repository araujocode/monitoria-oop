package jogador;

import baralho.Carta;
import java.util.Random;

public class JogadorMaquina extends Jogador { //2 - Herança
    private Random random; // 2 - Encapsulamento

    public JogadorMaquina(String nome) {
        super(nome);
        random = new Random();
    }

    @Override // 3 - Polimorfismo 1 (sobrescrita de método)
    public Carta jogarCarta() {
        // Escolhe uma carta aleatória da mão do jogador
        int indiceCarta = random.nextInt(mao.size());
        return mao.remove(indiceCarta);
    }
}
