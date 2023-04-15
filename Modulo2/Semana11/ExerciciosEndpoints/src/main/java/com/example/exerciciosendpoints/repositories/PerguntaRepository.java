package com.example.exerciciosendpoints.repositories;

import com.example.exerciciosendpoints.models.PerguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PerguntaRepository extends JpaRepository<PerguntaEntity, Long> {
    @Query("SELECT p FROM PerguntaEntity p WHERE p.id_quiz.id = :id")
    List<PerguntaEntity> findAllById_quiz(@Param("id") Long id);

}
