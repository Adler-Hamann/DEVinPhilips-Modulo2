package com.example.exerciciosspring.repositories;

import com.example.exerciciosspring.models.ClienteEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository{
    List <ClienteEntity> listaClientes = new ArrayList <>();
    public List<ClienteEntity> resgatarClientes(){
        return listaClientes;
    }
    public ClienteEntity resgataCliente(Integer id){
        return listaClientes.get(id);
    }

    public void deletarCliente(Integer id){
        this.listaClientes.remove(this.listaClientes.get(id));
    }

    public void alterarCliente(Integer id, ClienteEntity novoCliente) {
        this.listaClientes.set(id, novoCliente);

    }


}
