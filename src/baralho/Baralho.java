package baralho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        // Preencher o baralho com cartas
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        Set<String> cartasAdicionadas = new HashSet<>(); // Criar combinações únicas de valor e naipe
        for (String naipe : naipes) {
            for (ValorCarta valor : ValorCarta.values()) { // Iterar sobre todos os valores do enum
                String chave = valor.name() + " de " + naipe; // Combinação de valor e naipe
                if (cartasAdicionadas.add(chave)) { // Verificar se a combinação ainda não foi adicionada
                    cartas.add(new CartaNormal(naipe, valor.name(), valor));
                }
            }
        }
    }



    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta darCarta() {
        return cartas.remove(0);
    }
}

