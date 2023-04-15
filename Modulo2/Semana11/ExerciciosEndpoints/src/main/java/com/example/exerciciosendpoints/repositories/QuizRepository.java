package com.example.exerciciosendpoints.repositories;

import com.example.exerciciosendpoints.models.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends JpaRepository<QuizEntity, Long> {
}
