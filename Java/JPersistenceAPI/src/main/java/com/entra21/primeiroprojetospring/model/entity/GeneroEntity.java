package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "genero")
public class GeneroEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
}
