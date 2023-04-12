package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.models.ClienteEntity;
import com.example.exerciciosspring.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService servico;

    public ClienteController (ClienteService servico) {
        this.servico = servico;
    }

    @PostMapping
    public void cadastrarCliente(@RequestBody ClienteEntity cliente){
        servico.cadastraClienteService(cliente);
    }

    @GetMapping
    public List<ClienteEntity> buscarClientes(){
       return servico.resgataClientesService();
    }

    @GetMapping("/{id}")
    public ClienteEntity buscaCliente(@PathVariable Integer id){
        return servico.resgataUmClienteService(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Integer id){
        servico.deletaClienteService(id);
    }

    @PutMapping
    public void alterarCliente (@RequestParam Integer id, @RequestBody ClienteEntity novoCliente) {
        servico.alteraClienteService(id, novoCliente);
    }
}
