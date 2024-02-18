import baralho.Baralho;
import baralho.Carta;
import baralho.CartaNormal;
import jogador.Jogador;
import jogador.JogadorMaquina;
import jogador.JogadorUsuario;

public class JogoTruco {
    public static void main(String[] args) {
        // Criar os jogadores
        Jogador jogador1 = new JogadorUsuario("Jogador 1");
        Jogador jogador2 = new JogadorMaquina("Computador");

        // Criar o baralho e embaralhar
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        // Distribuir cartas para os jogadores
        for (int i = 0; i < 3; i++) {
            jogador1.receberCarta(baralho.darCarta());
            jogador2.receberCarta(baralho.darCarta());
        }

        // Exibir as cartas da máquina
        System.out.println("\nCartas do Computador:");
        for (Carta carta : jogador2.getMao()) {
            System.out.println(carta.getValor() + " de " + carta.getNaipe());
        }

        // Simulação do jogo (comparação das cartas jogadas)
        Carta cartaJogada1 = jogador1.jogarCarta();
        Carta cartaJogada2 = jogador2.jogarCarta();

        System.out.println("\nCarta jogada pelo Jogador 1: " + cartaJogada1.getValor() + " de " + cartaJogada1.getNaipe());
        System.out.println("Carta jogada pelo Computador: " + cartaJogada2.getValor() + " de " + cartaJogada2.getNaipe());

        // Verificar se as cartas jogadas são instâncias de CartaNormal e, caso sejam, compará-las
        if (cartaJogada1 instanceof CartaNormal && cartaJogada2 instanceof CartaNormal) {
            CartaNormal cartaNormal1 = (CartaNormal) cartaJogada1;
            CartaNormal cartaNormal2 = (CartaNormal) cartaJogada2;

            int resultado = cartaNormal1.compararTruco(cartaNormal2);

            if (resultado > 0) {
                System.out.println("O Jogador 1 venceu a rodada!");
            } else if (resultado < 0) {
                System.out.println("O Computador venceu a rodada!");
            } else {
                System.out.println("Empate na rodada!");
            }
        } else {
            System.out.println("Cartas especiais jogadas ou algum jogador não jogou uma carta normal.");
        }
    }
}
