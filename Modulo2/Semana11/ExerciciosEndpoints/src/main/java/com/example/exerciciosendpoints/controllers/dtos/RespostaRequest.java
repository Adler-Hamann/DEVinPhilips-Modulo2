package com.example.exerciciosendpoints.controllers.dtos;

import com.example.exerciciosendpoints.models.PerguntaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespostaRequest {
    private String texto;
    private PerguntaEntity id_pergunta;
}
