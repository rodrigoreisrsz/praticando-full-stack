package com.reis.demo.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nullable
    private String nome;
    @Nullable
    private String senha;
    @Column(unique = true, nullable = false)
    private String email;



    public User(){}

    public User(@Nullable String nome, @Nullable String senha, @Nullable String email) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }
}
