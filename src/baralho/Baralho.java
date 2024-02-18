package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        // Preencher o baralho com cartas
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        ValorCarta[] valores = {ValorCarta.QUATRO, ValorCarta.CINCO, ValorCarta.SEIS, ValorCarta.SETE,
                ValorCarta.Q, ValorCarta.J, ValorCarta.K, ValorCarta.A,
                ValorCarta.DOIS, ValorCarta.TRES};
        for (String naipe : naipes) {
            for (ValorCarta valor : valores) {
                cartas.add(new CartaNormal(naipe, valor.name(), valor));
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

