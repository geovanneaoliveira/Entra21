package transportes.assentos;

public class AssentoOnibus extends Assento{
    private String lugar;
    public boolean leito;
    //GS

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
}
