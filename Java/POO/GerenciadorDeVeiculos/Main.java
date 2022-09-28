import veiculos.Manutencao;
import veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("----GERENCIAMENTO DE VEÍCULOS----");
        while (true) {
            System.out.println();
            System.out.println("(1) CADASTRAR NOVO VEÍCULO");
            System.out.println("(2) ANOTAR MANUTENÇÃO");
            System.out.println("(3) COMPARAR SUCATEAMENTO");
            System.out.println("(4) REPETIÇÃO DE SERVIÇO");
            System.out.println("(5) ÍNDICE DE SUCATEAMENTO");
            System.out.println("(6) CUSTO MÉDIO DE MANUTENÇÃO");
            System.out.println("(0) SAIR");
            System.out.print("Escolha: ");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    break;
                case 1:
                    System.out.println();
                    veiculos.add(new Veiculo());
                    break;
                case 2:
                    System.out.print("Informe a placa do veículo (ABC-1234): ");
                    String placa = in.nextLine();
                    if (procuraVeiculo(placa) == -1) {
                        break;
                    }
                    System.out.println("ANOTE OS DADOS DA MANUTENÇÃO");
                    veiculos.get(procuraVeiculo(placa)).getManutencoes().add(new Manutencao());
                    break;
                case 3:
                    System.out.print("Digite a placa do primeiro veículo: ");
                    String placa1 = in.nextLine().toUpperCase();
                    if (procuraVeiculo(placa1) == -1) {
                        break;
                    }
                    int compSucateamento = comparaSucateamento(veiculos.get(procuraVeiculo(placa1)));
                    if (compSucateamento == 1) {
                        System.out.println("O veículo de placa '" + placa1 + "' está menos sucateado!");
                    } else if (compSucateamento == 0) {
                        System.out.println("Ambos estão igualmente sucateados!");
                    } else if (compSucateamento == -1) {
                        System.out.println("O veículo de placa '" + placa1 + "' está mais sucateado!");
                    } else {
                        break;
                    }
                    break;
                case 4:
                    System.out.print("Em qual veículo deseja pesquisar a repetição?: ");
                    String placaRepete = in.nextLine().toUpperCase();
                    if (procuraVeiculo(placaRepete) == -1) {
                        break;
                    }
                    System.out.print("Informe a descrição da manutenção: ");
                    String descricao = in.nextLine();
                    System.out.println("O serviço '" + descricao + "' foi realizado "
                            + veiculos.get(procuraVeiculo(placaRepete)).repeteServico(descricao) + " vezes!");
                    break;
                case 5:
                    System.out.print("Deseja pesquisar o índice de sucateamento de qual veículo?: ");
                    String placaSucateamento = in.nextLine().toUpperCase();
                    if (procuraVeiculo(placaSucateamento) == -1) {
                        break;
                    }
                    System.out.println("O índice de sucateamento do veículo com placa " + placaSucateamento + " " +
                            "é de: " + veiculos.get(procuraVeiculo(placaSucateamento)).indiceSucateamento() + "!");
                    break;
                case 6:
                    System.out.print("Em qual veículo deseja pesquisar o custo médio de manutenção?: ");
                    String placaMedioManutencao = in.nextLine().toUpperCase();
                    if (procuraVeiculo(placaMedioManutencao) == -1) {
                        break;
                    }
                    System.out.printf("O custo médio de manutenção é de: R$%.2f!",
                            veiculos.get(procuraVeiculo(placaMedioManutencao)).custoMedioManutencoes());
                default:
                    System.out.print("Escolha inválida, tente novamente!");
            }
            if (escolha == 7) {
                break;
            }
        }
        System.out.println("-----Fim de execução!-----");
    }

    private static int comparaSucateamento(Veiculo veiculo) {
        System.out.print("Digite a placa do segundo veículo: ");
        String placa = in.nextLine().toUpperCase();
        if (procuraVeiculo(placa) == -1) {
            return 10;
        }
        if (veiculo.indiceSucateamento() > veiculos.get(procuraVeiculo(placa)).indiceSucateamento()) {
            return -1;
        } else if (veiculo.indiceSucateamento() == veiculos.get(procuraVeiculo(placa)).indiceSucateamento()) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int procuraVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculos.indexOf(veiculo);
            }
        }
        System.out.println("\nO veículo com placa '" + placa + "' não existe!");
        return -1;
    }
}