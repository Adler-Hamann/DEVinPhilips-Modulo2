package com.example.exerciciosendpoints.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PerguntaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String texto;
    private Long id_quiz;

    public PerguntaEntity() {
    }

    public PerguntaEntity(Long id, String titulo, String texto, Long id_quiz) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.id_quiz = id_quiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Long getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(Long id_quiz) {
        this.id_quiz = id_quiz;
    }
}
