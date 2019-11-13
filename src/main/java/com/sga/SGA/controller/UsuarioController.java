package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import com.sga.SGA.service.UsuarioService;

import com.sga.SGA.models.Usuario;;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioServicio ;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> listaUsuario = usuarioServicio.listar();
		return new ResponseEntity<List<Usuario>>(listaUsuario,HttpStatus.OK);
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Usuario> BuscaPorId( @PathVariable("id") long idUser) {
		Usuario usuario = (Usuario) usuarioServicio.listarPorId(idUser);
			if(usuario != null) {
				return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
			}else {
				usuario.setNombre("none");
				return new ResponseEntity<Usuario>(usuario,HttpStatus.NOT_FOUND);
			}
		
	}
	@PostMapping
	public ResponseEntity<Usuario> Registra(@Valid @RequestBody Usuario user ){
		Usuario u =  usuarioServicio.registrar(user);
		if(u != null) {
			return  new ResponseEntity<Usuario>(u,HttpStatus.CREATED);
		}else {
			return  new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Usuario>AztualizaDatosUser(@PathVariable("id") Long id , @Valid @RequestBody  Usuario user){
		if( id == null || user  == null ) {
			return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST); 
		}else  {
			Usuario UserUpdated =  usuarioServicio.Modificar(id, user);
			return new ResponseEntity<Usuario>(UserUpdated,HttpStatus.ACCEPTED);
		}
	}
}
