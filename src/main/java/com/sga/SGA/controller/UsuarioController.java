package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import com.sga.SGA.service.UsuarioService;

import com.sga.SGA.models.Usuario;;
@RestController
@RequestMapping("/usuario")
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
	public ResponseEntity<Usuario> Registra( @RequestBody Usuario user ){
		if( user.getRol().getId() != 1 ) {
			user.setSede(null);
			user.setGrupo(null);
		}
		
		Usuario u =  usuarioServicio.registrar(user);
		if(u != null) {
			return  new ResponseEntity<Usuario>(u,HttpStatus.CREATED);
		}else {
			return  new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	@GetMapping("updatePassword/{idUser}/oldpass={oldpass}&newpass={newpass}")
	public ResponseEntity<Boolean> ActualizaPass( @PathVariable("idUser") long idUser,@PathVariable("oldpass") String oldpass,@PathVariable("newpass") String newpass   ){
		Boolean estado = usuarioServicio.ModificaPassword(idUser, oldpass,newpass );
		System.out.println("old "+oldpass+" newpass "+newpass);
		if(estado) {
			return new ResponseEntity<Boolean>(estado,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(estado,HttpStatus.BAD_REQUEST);
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
	@GetMapping("/profesores")
	public ResponseEntity<List<Usuario>> listarProfesores() {
		List<Usuario> listaProfesores = usuarioServicio.ListaUsuarioProfesor();
		return new ResponseEntity<List<Usuario>>(listaProfesores,HttpStatus.OK);
	}
	
	
	@GetMapping("/Alumnos")
	public ResponseEntity<List<Usuario>> listarAlumnos() {
		List<Usuario> listaProfesores = usuarioServicio.ListaUsuarioAlumno();
		return new ResponseEntity<List<Usuario>>(listaProfesores,HttpStatus.OK);
	}
	
	@GetMapping("/AlumnosPorGrupo/{idGrupo}")
	public ResponseEntity<List<Usuario>> listarAlumnosPorGrupo(@PathVariable("idGrupo") long idGrupo) {
		List<Usuario> listaAlumnosPorGrupo = usuarioServicio.ListaAlumnosPorGrupo(idGrupo);
		return new ResponseEntity<List<Usuario>>(listaAlumnosPorGrupo,HttpStatus.OK);
	}
	
	@DeleteMapping("/{idUsu}")
	public ResponseEntity<Boolean> EliminaUsuario(@PathVariable("idUsu") long idUsu) {
		boolean estado = usuarioServicio.Eliminar(idUsu);
		if(estado) {

			return new ResponseEntity<Boolean>(estado,HttpStatus.OK);
			
		}else {

			return new ResponseEntity<Boolean>(estado,HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/HabilitarUsuario/{idUsu}")
	public ResponseEntity<Boolean> Habilitausuario(@PathVariable("idUsu") long idUsu) {
		boolean estado = usuarioServicio.Habilitar(idUsu);
		if(estado) {
			return new ResponseEntity<Boolean>(estado,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(estado,HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
}
