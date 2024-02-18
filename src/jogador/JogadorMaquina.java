package jogador;

import baralho.Carta;
import baralho.CartaNormal;

public class JogadorMaquina extends Jogador {
    public JogadorMaquina(String nome) {
        super(nome);
    }

    @Override
    public Carta jogarCarta() {
        // Implementação específica para um jogador controlado pelo computador
        // Escolhe a carta com maior valor de truco na mão do jogador
        Carta cartaAJogar = null;
        int maiorValorTruco = Integer.MIN_VALUE;

        for (Carta carta : mao) {
            if (carta instanceof CartaNormal) {
                CartaNormal cartaNormal = (CartaNormal) carta;
                if (cartaNormal.getValorTruco() > maiorValorTruco) {
                    maiorValorTruco = cartaNormal.getValorTruco();
                    cartaAJogar = cartaNormal;
                }
            }
        }

        if (cartaAJogar != null) {
            mao.remove(cartaAJogar);
            return cartaAJogar;
        } else {
            // Se não houver cartas normais na mão, joga a primeira carta disponível
            return mao.remove(0);
        }
    }
}
