package baralho;

import java.util.*;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        Set<Carta> cartasSet = new HashSet<>();
        // Preencher o baralho com cartas
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        for (String naipe : naipes) {
            for (ValorCarta valor : ValorCarta.values()) { // Iterar sobre todos os valores do enum
                cartasSet.add(new CartaNormal(naipe, valor.name(), valor)); // Adicionar a carta ao HashSet, evitando repetições
            }
        }
        cartas = new ArrayList<>(cartasSet); // Converter o HashSet para ArrayList para utilizar funções específicas do AL
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta darCarta() {
        return cartas.remove(0);
    }
}

