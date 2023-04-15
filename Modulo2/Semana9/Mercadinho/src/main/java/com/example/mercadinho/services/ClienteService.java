package com.example.mercadinho.services;

import com.example.mercadinho.models.Cliente;
import com.example.mercadinho.models.Produto;
import com.example.mercadinho.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvar(Cliente cliente) {
        repository.save(cliente);
    }

    public List<Cliente> visualizar() {
        return (List<Cliente>) repository.findAll();
    }

    public void deletar(Cliente cliente) {
        repository.delete(cliente);
    }
}
