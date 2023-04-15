package com.example.exerciciosendpoints.controllers.dtos;

import com.example.exerciciosendpoints.models.QuizEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerguntaResponse {
    private String titulo;
    private String texto;
}
