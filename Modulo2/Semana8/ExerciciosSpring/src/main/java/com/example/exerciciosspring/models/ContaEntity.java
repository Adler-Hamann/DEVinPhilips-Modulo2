package com.example.exerciciosspring.models;

import jakarta.validation.constraints.PositiveOrZero;

public class ContaEntity {
    @PositiveOrZero
    private Double saldo;
    private Integer idCliente;
    private Integer idConta;

    public ContaEntity(){

    }
    public ContaEntity(Integer idCliente, Double saldo) {
        this.saldo = saldo;
        this.idCliente = idCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
