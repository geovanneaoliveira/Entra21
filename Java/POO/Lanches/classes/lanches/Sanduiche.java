package classes.lanches;

import java.util.HashMap;

public abstract class Sanduiche extends Lanche {
    private HashMap<String, Double> adicionais = new HashMap<>();

    public Sanduiche() {
        this.adicionarIngrediente("Pão");
    }

    public void adicionarAdicional(String adicional, double valor) {
        this.adicionais.put(adicional,valor);
    }

    public HashMap<String,Double> getAdicionais() {
        return adicionais;
    }

    @Override
    public double getValor() {
        double valorAdicionais = 0;
        for (double valores:this.getAdicionais().values()) {
            valorAdicionais+=valores;
        }
        return valorAdicionais;
    }
}
