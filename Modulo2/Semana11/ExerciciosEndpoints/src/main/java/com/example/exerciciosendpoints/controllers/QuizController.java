package com.example.exerciciosendpoints.controllers;

import com.example.exerciciosendpoints.controllers.dtos.QuizResponse;
import com.example.exerciciosendpoints.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService servico;

    @GetMapping
    public List<QuizResponse> visualizaQuizes() {
        return servico.visualizarQuizes();
    }

    @GetMapping("/{id}")
    public QuizResponse visualizaQuiz(@PathVariable Long id) {
        return servico.visualizarQuiz(id);
    }
}
