package classes;

public class Voo {
    public String[][] codificacaoAssento;
    public boolean[][] ocupacaoAssento;

    public Voo(int linhas, int colunas) {
        this.codificacaoAssento = new String[linhas][colunas];
        this.ocupacaoAssento = new boolean[linhas][colunas];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.codificacaoAssento[i][j] = String.valueOf(alfabeto.charAt(i)) + String.valueOf(j + 1) + " ";
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.ocupacaoAssento[i][j]=false;
            }
        }
    }

    public boolean verificaOcupacao(String assento) {

        for (int i = 0; i < this.ocupacaoAssento.length; i++) {
            for (int j = 0; j < this.ocupacaoAssento[0].length; j++) {
                if (this.codificacaoAssento[i][j].equalsIgnoreCase(assento+" ")) {
                    return this.ocupacaoAssento[i][j];
                }
            }
        }
        return false;
    }

    public void ocupar(String assento) {
        int poslinha = 0;
        int poscol = 0;
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[0].length; j++) {
                if (this.codificacaoAssento[i][j].equalsIgnoreCase(assento + " ")) {
                    poslinha = i;
                    poscol = j;
                    break;
                }
            }
        }
        this.codificacaoAssento[poslinha][poscol] = "-- ";
        this.ocupacaoAssento[poslinha][poscol] = true;
    }

    public int quantidadeLivre() {
        int contador = 0;
        for (int i = 0; i < this.ocupacaoAssento.length; i++) {
            for (int j = 0; j < this.ocupacaoAssento[0].length; j++) {
                if (!this.ocupacaoAssento[i][j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void mostrarAssentos() {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[0].length; j++) {
                System.out.print(this.codificacaoAssento[i][j]);
            }
            System.out.println();
        }
    }
}