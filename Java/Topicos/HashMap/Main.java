import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        while (true) {
            System.out.println("MENU");
            System.out.println("1 - CADASTRAR PRODUTO");
            System.out.println("2 - BUSCAR PRODUTO");
            System.out.println("3 - MOSTRAR LISTA DE PRODUTOS");
            System.out.println("4 - REMOVER PRODUTO");
            System.out.println("0 - SAIR");
            System.out.print("Escolha: ");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.print("Informe o produto: ");
                    String chave = in.nextLine();
                    if (produtos.containsKey(chave)) {
                        System.out.print("Produto já existente! Deseja atualizar p valor(S/N): ");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.print("Informe o valor: ");
                    double valor = in.nextDouble();
                    in.nextLine();
                    produtos.put(chave, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.print("Informe o produto a ser buscado: ");
                        String busca = in.nextLine();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.out.println("Produto '" + busca + "' não encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(produtos);
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.print("Informe o produto a ser buscado: ");
                        String busca = in.nextLine();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                            System.out.println("O produto '"+busca+"' foi removido!");
                        } else {
                            System.out.println("Produto '" + busca + "' não encontrado!");
                        }
                    }
                    break;
                default:
                    System.out.println("INFORME UMA OPÇÃO VÁLIDA!");
                    break;
            }
        }
    }
}
