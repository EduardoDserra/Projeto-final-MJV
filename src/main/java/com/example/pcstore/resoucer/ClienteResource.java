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

import com.example.pcstore.model.Cliente;
import com.example.pcstore.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService cs;

	@GetMapping
	public List<Cliente> listarProdutos() {
		return cs.listarProdutos();
	}

	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		cs.salvar(cliente);
	}

	@GetMapping(value = "/{id}")
	public Optional<Cliente> buscar(@PathVariable("id") Integer id) {
		return cs.buscarPorId(id);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		cs.excluir(id);
	}
	
	@PutMapping
	public void alterar(@RequestBody Cliente cliente) {
		cs.alterar(cliente);
	}
}
