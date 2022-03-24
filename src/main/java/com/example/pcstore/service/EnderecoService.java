package com.example.pcstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pcstore.model.Endereco;
import com.example.pcstore.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository er;

	public List<Endereco> listarEndereco() {
		return er.findAll();
	}

	public void salvar( Endereco endereco) {
		er.save(endereco);
		
	}

	public Optional<Endereco> buscarPorId( Integer id) {
		return er.findById(id);
	}

	public void excluir( Integer id) {
		er.deleteById(id);
	}

	public void alterar(Endereco endereco) {
		er.save(endereco);
	}
}
