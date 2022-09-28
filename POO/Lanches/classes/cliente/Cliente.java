package classes.cliente;

import classes.pedido.Pedido;

public class Cliente {
    private String nome;
    private Pedido pedido;

    public Cliente(){
        this.setPedido(new Pedido());
    }

    //GETTERS E SETTERS

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
