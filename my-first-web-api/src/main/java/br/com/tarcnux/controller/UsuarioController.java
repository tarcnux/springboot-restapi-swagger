package br.com.tarcnux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarcnux.model.Usuario;
import br.com.tarcnux.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> getUsers() {
		return repository.listAll();
	}
	
	@GetMapping("/{id}")
	public Usuario getOne(@PathVariable("id") Integer userId) {
		return repository.findById(userId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Integer userId) {
		repository.remove(userId);
	}
	
	@PostMapping
	public void cadastraUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	
	@PutMapping
	public void atualizaUser(@RequestBody Usuario usuario) {
		repository.update(usuario);
	}

}
