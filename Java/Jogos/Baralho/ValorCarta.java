package Baralho;

public enum ValorCarta {
    A(1),DOIS(2),TRES(3),QUATRO(4),CINCO(5),SEIS(6),SETE(7),OITO(8),NOVE(9),DEZ(10)
    ,VALETE(11),RAINHA(12),REI(13);
    private String valorCarta;

    ValorCarta(int valor) {
//        setValorCarta();
    }

    public String getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(String valorCarta) {
        this.valorCarta = valorCarta;
    }
}
