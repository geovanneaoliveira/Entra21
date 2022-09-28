package transportes;

import transportes.assentos.Assento;
import transportes.assentos.AssentoOnibus;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {
    private ArrayList<AssentoOnibus> assentosOnibus = new ArrayList<>();

    public Onibus(int linhasCadeiras) {
        for (int i = 0; i < 4 * linhasCadeiras; i++) {
            AssentoOnibus assentoOnibus = new AssentoOnibus();
            assentoOnibus.setLugar(String.valueOf(i + 1));
            this.getAssentosOnibus().add(assentoOnibus);
        }
    }

    //IMPLEMENTS

    @Override
    public boolean verificaOcupacao(String assento) {
        AssentoOnibus assentoOnibus = (AssentoOnibus) getAssento(assento);
        if(assentoOnibus!=null){
            return assentoOnibus.isOcupado();
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int qntLivre = 0;
        for (AssentoOnibus assentoOnibus : this.assentosOnibus) {
            if (!assentoOnibus.isOcupado()) {
                qntLivre++;
            }
        }
        return qntLivre;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println(" -ASSENTOS DO ÔNIBUS-");
        for (int i = 0; i < this.assentosOnibus.size(); i++) {
            if (this.getAssentosOnibus().get(i).isOcupado()) {
                System.out.print("[XX]");
            } else {
                if (i < 9) {
                    System.out.print("["+"0" + this.assentosOnibus.get(i).getLugar()+"]");
                } else {
                    System.out.print("["+this.assentosOnibus.get(i).getLugar()+"]");
                }
            }
            if ((i + 1) % 2 != 0) {
                System.out.print(" ");
            } else if ((i + 1) % 2 == 0 && (i + 1) % 4 != 0) {
                System.out.print(" | | ");
            } else {
                System.out.println();
            }
        }
    }

    @Override
    public Assento getAssento(String lugar) {
        for (AssentoOnibus assentoOnibus : this.assentosOnibus) {
            if (assentoOnibus.getLugar().equalsIgnoreCase(lugar)) {
                return assentoOnibus;
            }
        }
        return null;
    }

    //GS

    public ArrayList<AssentoOnibus> getAssentosOnibus() {
        return assentosOnibus;
    }

    public void setAssentosOnibus(ArrayList<AssentoOnibus> assentosOnibus) {
        this.assentosOnibus = assentosOnibus;
    }
}
