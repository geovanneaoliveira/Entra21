package classes;

import classes.estante.Estante;

import java.util.HashMap;

public class Loja {
    private HashMap<String, Estante> estantes = new HashMap<>();

    //GS

    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(HashMap<String, Estante> estantes) {
        this.estantes = estantes;
    }
}
