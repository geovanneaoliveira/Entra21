package classes.lanches;

public class HotDog extends Sanduiche {
    public HotDog() {
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Batata Palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo Cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.setTipo("Hot Dog");
    }

    @Override
    public void mostrarDetalhesComanda() {

    }
}
