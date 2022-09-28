import classes.cliente.Cliente;
import classes.lanches.*;

import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Informe o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.print("Deseja mais algum lanche?(S/N): ");
            if(in.next().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.print("Cliente: "+cl.getNome());
        cl.getPedido().imprimirComanda();
    }
    public static Lanche montarLanche(){
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pízza");
        System.out.println("(6) - Pizza");
        System.out.print("Escolha: ");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;
        switch (escolha) {
            case 1 -> lanche = new XSalada();
            case 2 -> lanche = new XBurguer();
            case 3 -> lanche = new MistoQuente();
            case 4 -> lanche = new HotDog();
            case 5 -> lanche = new MiniPizza();
            case 6 -> lanche = new Pizza();
            default -> System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof Sanduiche) {
            System.out.print("Deseja informar adicionais?(S/N): ");
            String add = in.nextLine();
            if (add.equalsIgnoreCase("S")) {
                String adds;
                System.out.println("Informe no máximo 10 adicionais, digite (1) para parar.");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("Adicional %d: ", i + 1);
                    adds = in.nextLine();
                    System.out.print("Preço: R$");
                    double valor = in.nextDouble();
                    in.nextLine();
                    if (adds.equalsIgnoreCase("1")) {
                        break;
                    }
                    ((Sanduiche) lanche).adicionarAdicional(adds,valor);
                }
            }
        }
        if (lanche instanceof XBurguer) {
            System.out.print("Lanche aberto?(S/N): ");
            String aberto = in.next();
            ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
        } else if (lanche instanceof MiniPizza) {
            System.out.println("Qual o sabor da "+lanche.getTipo()+"?");
            System.out.println("(1) 4 Queijos");
            System.out.println("(2) Calabresa");
            System.out.println("(3) Frango c/ catupiry");
            System.out.println("(4) Marguerita");
            System.out.println("(5) Portuguesa");
            System.out.print("Escolha: ");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1 -> miniPizza.adicionarSaborEIngredientes("4 queijos");
                case 2 -> miniPizza.adicionarSaborEIngredientes("calabresa");
                case 3 -> miniPizza.adicionarSaborEIngredientes("frango c/ catupiry");
                case 4 -> miniPizza.adicionarSaborEIngredientes("marguerita");
                case 5 -> miniPizza.adicionarSaborEIngredientes("portuguesa");
                default -> System.err.println("Escolha um sabor válido!");
            }
            if(lanche instanceof Pizza){
                System.out.println("Qual o tamanho?");
                System.out.println("XS - BROTO");
                System.out.println("SM - PEQUENA");
                System.out.println("MD - MÉDIA");
                System.out.println("LG - GRANDE");
                System.out.println("XL - FAMÍLIA");
                System.out.print("Escolha: ");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }
            System.out.print("Borda recheada?(S/N): ");
            String recheado = in.nextLine();
            miniPizza.setBordaRecheada(recheado.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()) {
                System.out.print("Qual o sabor da borda?: ");
                miniPizza.setSaborBorda(in.nextLine());
            }
        }
        System.out.print("Informe o valor de " + lanche.getTipo() + " R$");
        lanche.setValor(in.nextDouble());
        return lanche;
    }
}
