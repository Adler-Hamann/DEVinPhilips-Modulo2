package com.example.mercadinho.models;

import jakarta.persistence.*;

@Entity
@Table(name= "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String datanasc;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String datanasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
}
