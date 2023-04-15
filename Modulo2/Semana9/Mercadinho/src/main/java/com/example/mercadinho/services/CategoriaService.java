package com.example.mercadinho.services;

import com.example.mercadinho.models.Categoria;
import com.example.mercadinho.repositories.CategoriaRepository;

import java.util.List;

public class CategoriaService {
    private CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public void salvar(Categoria categoria) {
        repository.save(categoria);
    }

    public List<Categoria> visualizar() {
        return (List<Categoria>) repository.findAll();
    }

    public void deletar(Categoria categoria) {
        repository.delete(categoria);
    }
}
