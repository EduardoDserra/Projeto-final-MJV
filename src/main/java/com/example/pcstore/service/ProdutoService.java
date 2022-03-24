package com.example.pcstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pcstore.model.Produto;
import com.example.pcstore.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository pr;

	public List<Produto> listarProdutos() {
		return pr.findAll();
	}

	public void salvar(Produto produto) {
		pr.save(produto);
	}

	public Optional<Produto> buscarPorId(Integer id) {
		return pr.findById(id);
	}
	
	
	public void excluir(Integer id) {
		pr.deleteById(id);
	}

	public void alterar(Produto produto) {
		pr.save(produto);
	}
	
	
}
