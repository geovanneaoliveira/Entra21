package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

@Data
public class ItemDTO {
    private Long id;
    private String titulo;
    private Boolean emprestado;
    private String tipo;
}
