package com.example.exerciciosendpoints.services;

import com.example.exerciciosendpoints.controllers.dtos.PerguntaRequest;
import com.example.exerciciosendpoints.controllers.dtos.PerguntaResponse;
import com.example.exerciciosendpoints.models.PerguntaEntity;
import com.example.exerciciosendpoints.repositories.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerguntaService {

    @Autowired private PerguntaRepository repository;


    public void salvarPergunta(PerguntaRequest pergunta) {
        PerguntaEntity entidade = new PerguntaEntity();
        entidade.setTexto(pergunta.getTexto());
        entidade.setTitulo(pergunta.getTitulo());
        entidade.setId_quiz(pergunta.getId_quiz());
        repository.save(entidade);
    }

    public List<PerguntaResponse> visualizarPerguntas() {
        return repository.findAll().stream().map(
                perguntaentity -> new PerguntaResponse(perguntaentity.getTitulo(), perguntaentity.getTexto()))
                .collect(Collectors.toList());
    }

    public PerguntaResponse visualizarPergunta(Long id) {
        PerguntaEntity entidade = repository.findById(id).orElse(null);
        return new PerguntaResponse(entidade.getTitulo(), entidade.getTexto());
    }
    public List<PerguntaResponse> pegarPerguntasQuiz(Long id) {
        return repository.findAllById_quiz(id).stream().map(
                        perguntaentity -> new PerguntaResponse(perguntaentity.getTitulo(), perguntaentity.getTexto()))
                .collect(Collectors.toList());

    }

}
