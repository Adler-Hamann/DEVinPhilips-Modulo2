package com.example.mercadinho.controllers;

public class ClienteDTO {
    private String nome;
    private String cpf;
    private String datanasc;

    public ClienteDTO() {
    }

    public ClienteDTO(String nome, String cpf, String datanasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
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
