package com.example.exerciciosendpoints.controllers;

import com.example.exerciciosendpoints.controllers.dtos.PerguntaRequest;
import com.example.exerciciosendpoints.controllers.dtos.PerguntaResponse;
import com.example.exerciciosendpoints.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

    @Autowired private PerguntaService servico;

    @PostMapping
    public void salvarPergunta(@RequestBody PerguntaRequest pergunta) {
        servico.salvarPergunta(pergunta);
    }

    @GetMapping
    public List<PerguntaResponse> visualizaPerguntas() {
        return servico.visualizarPerguntas();
    }

    @GetMapping("/porquiz/{id}")
    public List<PerguntaResponse> pegarPerguntasQuiz(@PathVariable Long id) {
        return servico.pegarPerguntasQuiz(id);
    }

    @GetMapping("/{id}")
    public PerguntaResponse visualizaPergunta(@PathVariable Long id) {
        return servico.visualizarPergunta(id);
    }
    @PutMapping("/{id}")
    public void atualizaPergunta(@PathVariable Long id, @RequestBody PerguntaRequest pergunta) {
        servico.atualizaPergunta(id, pergunta);
    }

}
