package com.example.exerciciosendpoints.repositories;

import com.example.exerciciosendpoints.models.QuizEntity;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<QuizEntity, Long> {
}
