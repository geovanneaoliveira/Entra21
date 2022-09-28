package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    private String placa;
    private String modelo;
    private String dataAquisicao;
    private ArrayList<Manutencao> manutencoes = new ArrayList<>();
    public Veiculo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a placa do veículo: ");
        this.setPlaca(in.nextLine());
        System.out.print("Modelo: ");
        this.setModelo(in.nextLine());
        System.out.print("Data de Aquisição (DD/MM/AAAA): ");
        this.setDataAquisicao(in.nextLine());
    }

    public int repeteServico(String descricao){
        int repeticoes = 0;
        for (Manutencao manutencao:this.getManutencoes()) {
            if(manutencao.getDescricao().equalsIgnoreCase(descricao)){
                repeticoes++;
            }
        }
        return repeticoes;
    }
    public double indiceSucateamento(){
        int tempo = 0;
        for (Manutencao manutencao:this.getManutencoes()) {
            tempo += manutencao.getTempoParado();
        }
        if(tempo<=20){
            return 0;
        } else if (tempo<=50) {
            return 0.5;
        } else if (tempo<=80){
            return 1.0;
        } else if (tempo<=120){
            return 1.5;
        } else {
            return 2;
        }
    }
    public double custoMedioManutencoes(){
        double custoTotal = 0;
        for (Manutencao manutencao:this.getManutencoes()) {
            custoTotal += manutencao.getCusto();
        }
        return custoTotal/this.getManutencoes().size();
    }

    //GETTERS E SETTERS

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }
}
