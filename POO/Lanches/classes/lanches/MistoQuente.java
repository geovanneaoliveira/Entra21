package classes.lanches;

public class MistoQuente extends Sanduiche {
    public MistoQuente() {
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.setTipo("Misto Quente");
    }

    @Override
    public void mostrarDetalhesComanda() {

    }
}
