package com.example.exerciciosendpoints.controllers;

import com.example.exerciciosendpoints.controllers.dtos.PerguntaResponse;
import com.example.exerciciosendpoints.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

    @Autowired private PerguntaService servico;

    /*@PostMapping
    public void salvarPergunta(@RequestBody PerguntaDTO pergunta) {

    }*/

    @GetMapping
    public List<PerguntaResponse> visualizaPerguntas() {
        return servico.visualizarPerguntas();
    }

    @GetMapping("/{id}")
    public PerguntaResponse visualizaPergunta(@PathVariable Long id) {
        return servico.visualizarPergunta(id);
    }

}
