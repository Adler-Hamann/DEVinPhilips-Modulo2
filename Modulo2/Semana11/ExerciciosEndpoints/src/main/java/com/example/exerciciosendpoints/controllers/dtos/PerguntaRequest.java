package com.example.exerciciosendpoints.controllers.dtos;

import com.example.exerciciosendpoints.models.QuizEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerguntaRequest {
    private String titulo;
    private String texto;
    private QuizEntity id_quiz;
}
