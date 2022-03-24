package com.example.pcstore.resoucer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcstore.model.Produto;
import com.example.pcstore.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService ps;

	@GetMapping
	public List<Produto> listarProdutos() {
		return ps.listarProdutos();
	}

	@PostMapping
	public void salvar(@RequestBody Produto produto) {
		ps.salvar(produto);
	}

	@GetMapping(value = "/{id}")
	public Optional<Produto> buscar(@PathVariable("id") Integer id) {
		return ps.buscarPorId(id);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		ps.excluir(id);
	}
	
	@PutMapping
	public void alterar(@RequestBody Produto produto) {
		ps.alterar(produto);
	}
	
	
	
}
