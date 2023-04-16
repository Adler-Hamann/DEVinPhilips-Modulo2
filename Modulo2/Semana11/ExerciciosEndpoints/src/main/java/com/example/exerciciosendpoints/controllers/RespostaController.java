package com.example.exerciciosendpoints.controllers;


import com.example.exerciciosendpoints.controllers.dtos.RespostaRequest;
import com.example.exerciciosendpoints.controllers.dtos.RespostaResponse;
import com.example.exerciciosendpoints.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resposta")
public class RespostaController {
    @Autowired
    private RespostaService servico;

    @PostMapping
    public void salvarResposta(@RequestBody RespostaRequest resposta) {
        servico.salvarResposta(resposta);
    }
    @GetMapping
    public List<RespostaResponse> visualizaRespostas() {
        return servico.visualizarRespostas();
    }

    @GetMapping("/{id}")
    public RespostaResponse visualizaResposta(@PathVariable Long id) {
        return servico.visualizarResposta(id);
    }

    @GetMapping("/porpergunta/{id}")
    public List<RespostaResponse> pegarRespostasQuiz(@PathVariable Long id) {
        return servico.pegarRespostasQuiz(id);
    }

    @PutMapping("/{id}")
    public void atualizaResposta(@PathVariable Long id, @RequestBody RespostaRequest resposta) {
        servico.atualizaResposta(id, resposta);
    }
}
