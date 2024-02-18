package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public abstract class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }
    public abstract int getValorTruco();
}