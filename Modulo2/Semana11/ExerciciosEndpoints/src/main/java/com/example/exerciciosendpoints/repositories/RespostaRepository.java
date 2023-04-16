package com.example.exerciciosendpoints.repositories;

import com.example.exerciciosendpoints.models.PerguntaEntity;
import com.example.exerciciosendpoints.models.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RespostaRepository extends JpaRepository<RespostaEntity, Long> {

    @Query("SELECT r FROM RespostaEntity r WHERE r.id_pergunta.id = :id")
    List<RespostaEntity> findAllById_pergunta(@Param("id") Long id);
}
