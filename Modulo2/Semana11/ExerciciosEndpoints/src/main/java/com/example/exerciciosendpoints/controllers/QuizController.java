package com.example.exerciciosendpoints.controllers;

import com.example.exerciciosendpoints.controllers.dtos.QuizRequest;
import com.example.exerciciosendpoints.controllers.dtos.QuizResponse;
import com.example.exerciciosendpoints.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService servico;

    @PostMapping
    public void salvarQuiz(@RequestBody QuizRequest quiz) {
        servico.salvarQuiz(quiz);
    }
    @GetMapping
    public List<QuizResponse> visualizaQuizes() {
        return servico.visualizarQuizes();
    }

    @GetMapping("/{id}")
    public QuizResponse visualizaQuiz(@PathVariable Long id) {
        return servico.visualizarQuiz(id);
    }

    @PutMapping("/{id}")
    public void atualizaQuiz(@PathVariable Long id, @RequestBody QuizRequest quiz) {
        servico.atualizaQuiz(id, quiz);
    }
}
