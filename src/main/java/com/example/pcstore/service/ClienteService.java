package com.example.pcstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pcstore.model.Cliente;
import com.example.pcstore.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cr;

	public List<Cliente> listarProdutos() {
		return cr.findAll();
	}

	public void salvar( Cliente cliente) {
		cr.save(cliente);
		
	}

	public Optional<Cliente> buscarPorId( Integer id) {
		return cr.findById(id);
	}

	public void excluir( Integer id) {
		cr.deleteById(id);
	}

	public void alterar(Cliente cliente) {
		cr.save(cliente);
	}
}
