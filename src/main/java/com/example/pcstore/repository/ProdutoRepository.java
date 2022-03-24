package com.example.pcstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pcstore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
