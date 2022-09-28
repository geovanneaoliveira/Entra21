package classes;

public enum EMenuItem {
    VOLTAR(0,"Voltar"),
    VER_AVALIACOES(1,"Ver avaliações"),
    AVALIAR(2,"Avaliar"),
    MOSTRAR_DETALHES(3, "Mostrar detalhes");


    private final String descricao;
    private final int valorOpcao;
    EMenuItem(int valorOpcao, String descricao){
        this.descricao = descricao;
        this.valorOpcao = valorOpcao;
    }
    public static EMenuItem getByValorOpcao(int escolha){
        for (EMenuItem avaliaEscolha: EMenuItem.values()) {
            if(avaliaEscolha.getValorOpcao()==escolha){
                return avaliaEscolha;
            }
        }
        return null;
    }

    //GS

    public String getDescricao() {
        return descricao;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

}
