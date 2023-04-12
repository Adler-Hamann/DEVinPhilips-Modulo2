package com.example.exerciciosspring.models;
import org.hibernate.validator.constraints.br.CPF;
public class ClienteEntity {
    private String nome;
    @CPF
    private String cpf;

    public ClienteEntity() {

    }
    public ClienteEntity(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;
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
}
