package com.example.pcstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pcstore.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	
	
}
