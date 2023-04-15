package com.example.exerciciosendpoints.controllers;

import com.example.exerciciosendpoints.controllers.dtos.RespostaResponse;
import com.example.exerciciosendpoints.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resposta")
public class RespostaController {
    @Autowired
    private RespostaService servico;

    @GetMapping
    public List<RespostaResponse> visualizaRespostas() {
        return servico.visualizarRespostas();
    }

    @GetMapping("/{id}")
    public RespostaResponse visualizaResposta(@PathVariable Long id) {
        return servico.visualizarResposta(id);
    }
}
