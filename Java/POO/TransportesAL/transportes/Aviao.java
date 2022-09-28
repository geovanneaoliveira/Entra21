package transportes;

import transportes.assentos.Assento;
import transportes.assentos.AssentoVoo;
import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentosAviao = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        int linha = 1, posicao = 0, cadeira = 0;
        String colunas = "ABCDEF";
        for (int i = 1; i <= linhasCadeirasLuxo * 4; i++) {
            if (i > linha * 4) {
                linha++;
            }
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse(ClasseAssentoVoo.LUXO);
            if (cadeira < 9) {
                assentoVoo.setCodigo(colunas.charAt(posicao) + "0" + linha);
            } else {
                assentoVoo.setCodigo(colunas.charAt(posicao) + String.valueOf(linha));
            }
            posicao++;
            if (posicao > 3) {
                posicao = 0;
                cadeira++;
            }
            this.getAssentosAviao().add(assentoVoo);
        }
        linha = 1;
        posicao = 0;
        cadeira = 0;
        for (int i = 1; i <= linhasCadeirasEconomicas * 6; i++) {
            if (i > linha * 6) {
                linha++;
            }
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse(ClasseAssentoVoo.ECONOMICA);
            if (cadeira < 9) {
                assentoVoo.setCodigo(colunas.charAt(posicao) + "0" + linha);
            } else {
                assentoVoo.setCodigo(colunas.charAt(posicao) + String.valueOf(linha));
            }
            posicao++;
            if (posicao > 5) {
                posicao = 0;
                cadeira++;
            }
            this.getAssentosAviao().add(assentoVoo);
        }
    }

    //IMPLEMENTS

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo assentoAviao : assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int quantLivre = 0;
        for (AssentoVoo assentoAviao : assentosAviao) {
            if (!assentoAviao.isOcupado()) {
                quantLivre++;
            }
        }
        return quantLivre;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("---DIAGRAMA DE ASSENTOS DO AVIÃO---");
        System.out.println("------------CLASSE LUXO------------");
        int contador = 1;
        boolean printEco = false;
        for (AssentoVoo assentoVoo : assentosAviao) {
            if (assentoVoo.getClasse().equals(ClasseAssentoVoo.ECONOMICA) && !printEco) {
                System.out.println("----------CLASSE ECONÔMICA---------");
                contador = 1;
                printEco = true;
            }
            if ((contador - 1) % 4 == 0 && assentoVoo.getClasse().equals(ClasseAssentoVoo.LUXO)) {
                System.out.print("     ");
            }
            if (!assentoVoo.isOcupado()) {
                System.out.print("[" + assentoVoo.getCodigo() + "]");
            } else {
                System.out.print("[XX]");
            }
            if (assentoVoo.getClasse().equals(ClasseAssentoVoo.LUXO)) {
                if (contador % 2 == 0 && contador % 4 != 0) {
                    System.out.print(" | | ");
                }
                if (contador % 4 == 0) {
                    System.out.println();
                }
            } else {
                if (contador % 3 == 0 && contador % 6 != 0) {
                    System.out.print(" | | ");
                }
                if (contador % 6 == 0) {
                    System.out.println();
                }
            }
            contador++;
        }
    }

    @Override
    public Assento getAssento(String codigo) {
        for (AssentoVoo assentoAviao : this.assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(codigo)) {
                return assentoAviao;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo assentoAviao : this.assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)
                    && assentoAviao.getClasse().equals(classe)) {
                return assentoAviao;
            }
        }
        return null;
    }

    //GS

    public ArrayList<AssentoVoo> getAssentosAviao() {
        return assentosAviao;
    }

    public void setAssentosAviao(ArrayList<AssentoVoo> assentosAviao) {
        this.assentosAviao = assentosAviao;
    }
}
