import pacote.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VendaCarro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, ArrayList<Carro>> hashCarros = new HashMap<>();
        while (true) {
            System.out.println("1 - VER LISTA DE CARROS");
            System.out.println("2 - ADICIONAR CARRO A LISTA DE VENDAS");
            System.out.println("3 - VENDER CARRO");
            System.out.println("0 - SAIR");
            System.out.print("Escolha: ");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 1:
                    if(hashCarros.isEmpty()){
                        System.out.println("Lista vazia!");
                        break;
                    }
                    for (String chave: hashCarros.keySet()) {
                        System.out.print(chave+" - ");
                        ArrayList<Carro> carrosPrint = hashCarros.get(chave);
                        for(int i = 0; i<hashCarros.get(chave).size();i++){
                            Carro carro = carrosPrint.get(i);
                            System.out.print(carro.getModelo()+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Carro carro = new Carro();
                    System.out.print("Informe a marca do veículo: ");
                    String marca = in.nextLine().toUpperCase();
                    System.out.print("Informe o modelo: ");
                    carro.setModelo(in.nextLine());
                    System.out.print("Informe o valor de venda: R$");
                    carro.setValorVenda(in.nextDouble());
                    in.nextLine();
                    if (hashCarros.containsKey(marca)) {
                        hashCarros.get(marca).add(carro);
                    } else {
                        ArrayList<Carro> carrosVenda = new ArrayList<>();
                        carrosVenda.add(carro);
                        hashCarros.put(marca, carrosVenda);
                    }
                    break;
                case 3:
                    System.out.println("VENDA");
                    System.out.print("Marca do veículo: ");
                    String marcaVenda = in.nextLine();
                    if (hashCarros.containsKey(marcaVenda)) {
                        System.out.print("Modelo: ");
                        String modeloVenda = in.nextLine();
                        for (Carro carro1 : hashCarros.get(marcaVenda)) {
                            if (modeloVenda.equalsIgnoreCase(carro1.getModelo())) {
                                hashCarros.get(marcaVenda).remove(carro1);
                                System.out.printf("Valor de venda : R$%.2f", carro1.getValorVenda());
                                System.out.println("\nVenda concluída!");
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
            }
        }
    }
}
