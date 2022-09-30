package Baralho;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<>();
        baralho.add(new Carta(Naipe.COPAS, ValorCarta.A));
        System.out.println(baralho);
    }
}
