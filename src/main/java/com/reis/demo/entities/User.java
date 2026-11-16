package com.reis.demo.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nullable
    private String nome;
    @Nullable
    private String senha;
    @Nullable
    private String email;



    public User(){}

    public User(@Nullable String nome, @Nullable String senha, @Nullable String email) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }
}
