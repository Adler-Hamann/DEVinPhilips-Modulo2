package com.example.exerciciosspring.services;

import com.example.exerciciosspring.models.ContaEntity;
import com.example.exerciciosspring.repositories.ClienteRepository;
import com.example.exerciciosspring.repositories.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    private final ContaRepository listaConta;
    ClienteRepository clientes = ClienteRepository.getInstance();

    public ContaService (ContaRepository repositorio) {
        this.listaConta = repositorio;
    }

    public void criaContaService(Integer id){
        ContaEntity conta = new ContaEntity();
        conta.setSaldo(0.0);
        conta.setIdCliente(id);
        conta.setIdConta(listaConta.resgataContas().size());
        listaConta.criaConta(conta);
    }
    public List<ContaEntity> buscaContasService() {
        return listaConta.resgataContas();
    }

    public ContaEntity buscaContaService(Integer id) {
        return listaConta.resgataConta(id);
    }

    public void deletaContaService(Integer id) {
        listaConta.deletaConta(id);
    }

    public void alteraContaService(Integer id, ContaEntity novaConta) {
        listaConta.alteraConta(id, novaConta);
    }

    public void alteraSaldoService(Integer id, Double valor) throws Exception {
        listaConta.resgataConta(id).setIdCliente(this.clientes.resgataCliente(id).getId());
        Double saldoFinal = listaConta.resgataConta(id).getSaldo() + valor;
        if (saldoFinal >= 0) {
            listaConta.resgataConta(id).setSaldo(saldoFinal);
        }else{
            throw new Exception("Saldo negativo não permitido");
        }
    }
}
