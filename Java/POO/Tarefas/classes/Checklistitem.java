package classes;

import java.util.UUID;

public class Checklistitem {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;

    public Checklistitem(){
        this.setUuid(UUID.randomUUID().toString());
    }
    public void completar(){
        this.setCompleta(true);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
