package com.example.mercadinho.repositories;

import com.example.mercadinho.models.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
