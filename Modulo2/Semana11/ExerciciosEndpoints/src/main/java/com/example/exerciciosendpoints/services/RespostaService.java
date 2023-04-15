package com.example.exerciciosendpoints.services;

import com.example.exerciciosendpoints.controllers.dtos.RespostaResponse;
import com.example.exerciciosendpoints.models.RespostaEntity;
import com.example.exerciciosendpoints.repositories.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RespostaService {
    @Autowired
    private RespostaRepository repository;

    public List<RespostaResponse> visualizarRespostas() {
        return repository.findAll().stream().map(
                        respostaEntity -> new RespostaResponse(respostaEntity.getTexto()))
                .collect(Collectors.toList());
    }
    public RespostaResponse visualizarResposta(Long id) {
        RespostaEntity entidade = repository.findById(id).orElse(null);
        return new RespostaResponse(entidade.getTexto());
    }
}
