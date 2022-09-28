public class Carta {
    private Naipe naipe;
    private ValorCarta valor;
    public Carta(Naipe naipe, ValorCarta valorCarta){
        this.setNaipe(naipe);
        this.setValor(valorCarta);
    }

    //GS


    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }
}
