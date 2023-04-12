package com.example.exerciciosspring.repositories;

import com.example.exerciciosspring.models.ContaEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository {
    List<ContaEntity> listaContas = new ArrayList<>();
    public List<ContaEntity> resgataContas() {
        return listaContas;
    }

    public ContaEntity resgataConta(Integer id) {
        return listaContas.get(id);
    }

    public void deletaConta(Integer id) {
        this.listaContas.remove(this.listaContas.get(id));
    }

    public void alteraConta(Integer id,ContaEntity novaConta) {
        this.listaContas.set(id, novaConta);
    }
}
