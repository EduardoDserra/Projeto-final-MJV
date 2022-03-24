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

import com.example.pcstore.model.Endereco;
import com.example.pcstore.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService es;

	@GetMapping
	public List<Endereco> listarEndereco() {
		return es.listarEndereco();
	}

	@PostMapping
	public void salvar(@RequestBody Endereco endereco) {
		es.salvar(endereco);
	}

	@GetMapping(value = "/{id}")
	public Optional<Endereco> buscar(@PathVariable("id") Integer id) {
		return es.buscarPorId(id);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		es.excluir(id);
	}
	
	@PutMapping
	public void alterar(@RequestBody Endereco endereco) {
		es.alterar(endereco);
	}
}
