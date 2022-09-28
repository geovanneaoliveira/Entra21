import transportes.Aviao;
import transportes.Enum;
import transportes.Onibus;

public class Main {
    public static void main(String[] args) {
        boolean executa = true;
        Aviao aviao = new Aviao(15,21);
        Onibus onibus = new Onibus(12);
        aviao.mostrarAssentos();
        onibus.mostrarAssentos();
    }
}
