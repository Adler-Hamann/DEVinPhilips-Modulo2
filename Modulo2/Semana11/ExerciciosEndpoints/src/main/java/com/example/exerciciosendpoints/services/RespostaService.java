package com.example.exerciciosendpoints.services;

import com.example.exerciciosendpoints.controllers.dtos.RespostaRequest;
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

    public void salvarResposta(RespostaRequest resposta) {
        RespostaEntity entidade = new RespostaEntity();
        entidade.setTexto(resposta.getTexto());
        repository.save(entidade);
    }
    public List<RespostaResponse> visualizarRespostas() {
        return repository.findAll().stream().map(
                        respostaEntity -> new RespostaResponse(respostaEntity.getTexto()))
                .collect(Collectors.toList());
    }
    public RespostaResponse visualizarResposta(Long id) {
        RespostaEntity entidade = repository.findById(id).orElse(null);
        return new RespostaResponse(entidade.getTexto());
    }

    public List<RespostaResponse> pegarRespostasQuiz(Long id) {
        return repository.findAllById_pergunta(id).stream().map(
                        respostaEntity -> new RespostaResponse(respostaEntity.getTexto()))
                .collect(Collectors.toList());
    }
    public void atualizaResposta(Long id, RespostaRequest resposta) {
        RespostaEntity entidade = repository.findById(id).orElse(null);
        entidade.setTexto(resposta.getTexto());
        entidade.setId_pergunta(resposta.getId_pergunta());
        repository.save(entidade);
    }

    public void deletaResposta(Long id) {
        RespostaEntity entidade = repository.findById(id).orElse(null);
        repository.delete(entidade);
    }
}
