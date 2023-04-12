package com.example.exerciciosspring.services;

import com.example.exerciciosspring.models.ClienteEntity;
import com.example.exerciciosspring.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository listagem;
    public ClienteService (ClienteRepository cliente) {
        this.listagem = cliente;
    }

    public void cadastraClienteService(ClienteEntity cliente) {
        Integer novoId = listagem.resgatarClientes().size();
        cliente.setId(novoId);
        listagem.cadastraCliente(cliente);
    }
    public List<ClienteEntity> resgataClientesService(){
        return listagem.resgatarClientes();
    }
    public ClienteEntity resgataUmClienteService(Integer id) {
        return listagem.resgataCliente(id);
    }

    public void deletaClienteService(Integer id){
        this.listagem.deletarCliente(id);
    }

    public void alteraClienteService(Integer id, ClienteEntity novoCliente) {
        listagem.alterarCliente(id, novoCliente);
    }


}
