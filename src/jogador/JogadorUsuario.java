package jogador;

import baralho.Carta;

import java.util.Scanner;

public class JogadorUsuario extends Jogador {
    private Scanner scanner;

    public JogadorUsuario(String nome) {
        super(nome);
        scanner = new Scanner(System.in);
    }

    @Override
    public Carta jogarCarta() {
        System.out.println("");
        System.out.println(nome + ", é sua vez de jogar");
        System.out.println("Suas cartas:");
        for (int i = 0; i < mao.size(); i++) {
            System.out.println((i + 1) + ": " + mao.get(i).getValor() + " de " + mao.get(i).getNaipe());
        }

        String escolha;
        do {
            System.out.print("\nEscolha o valor da carta que deseja jogar: ");
            escolha = scanner.next().toUpperCase();
        } while (!validarEscolha(escolha));

        // Encontra a carta na mão com o valor escolhido e a remove
        for (Carta carta : mao) {
            if (carta.getValor().equals(escolha)) {
                mao.remove(carta);
                return carta;
            }
        }

        // Se a carta não for encontrada, retorna null
        return null;
    }

    // Método para validar se a escolha do jogador corresponde a uma carta em sua mão
    private boolean validarEscolha(String escolha) {
        for (Carta carta : mao) {
            if (carta.getValor().equals(escolha)) {
                return true;
            }
        }
        System.out.println("Você não tem uma carta com esse valor na sua mão. Por favor, escolha novamente.");
        return false;
    }
}
