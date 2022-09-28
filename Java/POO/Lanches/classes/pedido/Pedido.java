package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {
        for(Lanche lanche: this.getLanches()){
            if(lanche!=null){
                if (lanche instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) lanche);
                    System.out.println("====" + lanche.getTipo() + " - " + mp.getSabor().toUpperCase() + "====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("--BORDA RECHEADA: " + mp.getSaborBorda().toUpperCase() + "--");
                    }
                    if(lanche instanceof Pizza){
                        System.out.printf("Tamanho da pizza: %s\n", ((Pizza)lanche).getTamanho());
                    }
                } else {
                    System.out.println("====" + lanche.getTipo() + "====");
                }
                if(lanche instanceof XBurguer){
                    if (((XBurguer) lanche).isAberto()) {
                        System.out.println("--LANCHE ABERTO--");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", lanche.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : lanche.getIngredientes()) {
                    System.out.println(ingrediente);
                }
                if(lanche instanceof Sanduiche){
                    Sanduiche s = (Sanduiche)lanche;
                        System.out.println("-ADICIONAIS-");
                        int cont = 1;
                        for (String adicional: s.getAdicionais().keySet()) {
                            if (adicional == null) {
                                break;
                            }
                            System.out.printf("%d - %s - R$%.2f\n", cont, adicional,s.getAdicionais().get(adicional));
                            cont++;
                        }
                        System.out.println("----------------");
                }
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("----------------------------v");
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Lanche l : this.getLanches()){
            valorTotal += l.getValor();
        }
        return valorTotal;
    }
    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}
