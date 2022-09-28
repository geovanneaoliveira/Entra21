package classes;

import classes.avaliacao.Avaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.print("Nome: ");
        a.setNome(in.nextLine());
        System.out.print("Rating(0-10): ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Feedback(opcional): ");
        a.setFeedback(in.nextLine());
        avaliacoes.add(a);
    }

    public double getTotalRating() {
        double soma = 0;
        int totalAvaliacoes = 0;
        for (Avaliacao a : getAvaliacoes()) {
            if (a != null) {
                totalAvaliacoes++;
                soma += a.getRating();
            }
        }
        return soma / totalAvaliacoes;
    }

    public abstract void montarDetalhes(Scanner in);

    public abstract void mostrarDetalhes();

    //GETTERS & SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
