package com.example.exerciciosendpoints.services;

import com.example.exerciciosendpoints.controllers.dtos.QuizRequest;
import com.example.exerciciosendpoints.controllers.dtos.QuizResponse;
import com.example.exerciciosendpoints.models.QuizEntity;
import com.example.exerciciosendpoints.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {
    @Autowired
    private QuizRepository repository;

    public void salvarQuiz(QuizRequest quiz) {
        QuizEntity entidade = new QuizEntity();
        entidade.setNome(quiz.getNome());
        entidade.setDescricao(quiz.getDescricao());
        repository.save(entidade);
    }

    public List<QuizResponse> visualizarQuizes() {
        return repository.findAll().stream().map(
                        quizentity -> new QuizResponse(quizentity.getNome(), quizentity.getDescricao()))
                .collect(Collectors.toList());
    }

    public QuizResponse visualizarQuiz(Long id) {
        QuizEntity entidade = repository.findById(id).orElse(null);
        return new QuizResponse(entidade.getNome(), entidade.getDescricao());
    }
    public void atualizaQuiz(Long id, QuizRequest quiz) {
        QuizEntity entidade = repository.findById(id).orElse(null);
        entidade.setNome(quiz.getNome());
        entidade.setDescricao(quiz.getDescricao());
        repository.save(entidade);
    }

    public void deletaQuiz(Long id) {
        QuizEntity entidade = repository.findById(id).orElse(null);
        repository.delete(entidade);
    }
}
