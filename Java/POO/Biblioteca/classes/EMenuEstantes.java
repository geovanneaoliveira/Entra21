package classes;

public enum EMenuEstantes {
    CRIAR_ESTANTE(1,"Criar nova estante"),
    REMOVER_ESTANTE(2, "Remover estante"),
    BUSCAR_ESTANTE(3,"Buscar estante"),
    FINALIZAR_EXECUCAO(0, "Finalizar execução");
    private final int valorOpcao;
    private final String descricao;
    EMenuEstantes(int valorOpcao, String descricao){
        this.descricao = descricao;
        this.valorOpcao = valorOpcao;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }
}
