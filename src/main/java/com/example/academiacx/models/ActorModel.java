package com.example.academiacx.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_actor")
public class ActorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;

    private String actor_movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getActor_movies() {
        return actor_movies;
    }

    public void setActor_movies(String actor_movies) {
        this.actor_movies = actor_movies;
    }
}