package classes;

public enum EMenu {
    SAIR(0,"Sair"),
    ADICIONAR_ITEM(1,"Adicionar item à estante"),
    BUSCAR_ITEM(2,"Buscar item"),
    REMOVER_ITEM(3, "Remover item da estante"),
    MOSTRAR_ITENS(4,"Mostrar itens da estante");

    private final int valorOpcao;
    private final String descricao;
    EMenu(int valor, String descricao){
        this.valorOpcao=valor;
        this.descricao = descricao;
    }
    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }
    public int getValorOpcao(){
        return this.valorOpcao;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
