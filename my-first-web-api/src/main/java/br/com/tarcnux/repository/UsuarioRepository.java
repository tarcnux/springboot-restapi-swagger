package br.com.tarcnux.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tarcnux.model.Usuario;

@Repository
public class UsuarioRepository {
	
	//Repositório Mocado
	
	public void save(Usuario usuario) {
		System.out.println("SAVE - Recebendo o usuário na camada de reposotório");
		System.out.println(usuario);
	}
	
	public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    
    public List<Usuario> listAll() {
    	System.out.println("LIST - Listando usuários do sistema");
    	List<Usuario> usuarios = new ArrayList<>();
    	
    	usuarios.add(new Usuario("Tatá", "senha123"));
    	usuarios.add(new Usuario("Tarcnux", "qwerty"));
    	usuarios.add(new Usuario("Zen S.A.", "qwerty"));
    	
    	return usuarios;
    }
    
    public Usuario findById(Integer id) {
    	System.out.println(String.format("FIND/id - recebendo o id: %d para localizar um usuário.", id));
    	return new Usuario("Tatá", "senha123");
    }
	
	
}
