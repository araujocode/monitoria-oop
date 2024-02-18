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
            System.out.println((i + 1) + ": " + mao.get(i));
        }

        int escolha;
        while (true) {
            System.out.print("\nEscolha o número da carta que deseja jogar (entre 1 e 3): ");
            escolha = scanner.nextInt();
            if (validarEscolha(escolha)) {
                break;
            } else {
                System.out.println("Escolha uma carta válida entre as opções 1 e 3.");
            }
        }

        // Encontra a carta na mão com o número escolhido e a remove
        return mao.remove(escolha - 1);
    }

    // Método para validar se a escolha do jogador corresponde a uma carta em sua mão
    private boolean validarEscolha(int escolha) {
        return escolha >= 1 && escolha <= 3;
    }
}
