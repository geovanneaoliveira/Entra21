package classes.estante;

import classes.Item;

import java.util.ArrayList;
import java.util.Locale;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> items;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItems(new ArrayList<>());
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        int contador = 0;
        for (Item i : this.getItems()) {
            if (i != null) {
                contador++;
            }
        }
        return contador;
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItems()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;
    }

    public boolean adicionarItem(Item item) {
        if(this.items.size()<this.getCapMaxima()){
            return this.items.add(item);
        }
        return false;
    }

    public Item removerItem(int posicao) {
        if(posicao<=this.getCapMaxima()) {
            return this.items.remove(posicao);
        }
        return null;
    }

    //GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
