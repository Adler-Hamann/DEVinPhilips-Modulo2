package com.example.mercadinho.services;

import com.example.mercadinho.models.Produto;
import com.example.mercadinho.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Produto produto) {
        repository.save(produto);
    }

    public List<Produto> visualizar() {
        return (List<Produto>) repository.findAll();
    }

    public void deletar(Produto produto) {
        repository.delete(produto);
    }
}
