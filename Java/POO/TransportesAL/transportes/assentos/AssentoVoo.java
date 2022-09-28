package transportes.assentos;

import transportes.ClasseAssentoVoo;

public class AssentoVoo extends Assento {
    private String codigo;
    private ClasseAssentoVoo classe;

    //GS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ClasseAssentoVoo getClasse() {
        return classe;
    }

    public void setClasse(ClasseAssentoVoo classe) {
        this.classe = classe;
    }
}
