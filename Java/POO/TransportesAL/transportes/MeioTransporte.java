package transportes;

import transportes.assentos.Assento;

public interface MeioTransporte {
    public boolean verificaOcupacao(String assento);
    public int quantidadeLivre();
    public void mostrarAssentos();
    public Assento getAssento(String codigo);
}
