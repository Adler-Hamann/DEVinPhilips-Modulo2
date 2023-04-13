package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.models.ContaEntity;
import com.example.exerciciosspring.services.ContaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {
    private final ContaService servicoConta;

    public ContaController (ContaService servico) {
        this.servicoConta = servico;
    }

    @PostMapping
    public void criarConta(@RequestParam Integer id) {
        servicoConta.criaContaService(id);
    }

    @GetMapping
    public List<ContaEntity> buscaContas() {
        return servicoConta.buscaContasService();
    }

    @GetMapping("/{id}")
    public ContaEntity buscaConta(@PathVariable Integer id) {
        return servicoConta.buscaContaService(id);
    }

    @DeleteMapping("/{id}")
    public void deletaConta(@PathVariable Integer id) {
        servicoConta.deletaContaService(id);
    }

    @PutMapping("/{id}")
    public void alteraConta(@PathVariable Integer id, @RequestBody ContaEntity novaConta) {
        servicoConta.alteraContaService(id, novaConta);
    }
    @PutMapping("/saldo/{id}")
    public void alterarSaldo(@PathVariable Integer id, @RequestParam Double valor) throws Exception {
        servicoConta.alteraSaldoService(id, valor);
    }
    @PutMapping("/transfere/{id1}/{id2}")
    public void transfereSaldo (@PathVariable Integer id1, @PathVariable Integer id2) {
        servicoConta.transfereSaldoService(id1, id2);
    }
}
