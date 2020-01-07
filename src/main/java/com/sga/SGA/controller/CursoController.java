package com.sga.SGA.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.sga.SGA.models.Curso;
import com.sga.SGA.service.ICursoService;

@RestController
@RequestMapping("Curso")
public class CursoController {
	
	
	@Autowired
	private ICursoService serviseCuros;
	
	
	@GetMapping
	public ResponseEntity<List<Curso>> listar(){
		List<Curso> listaCuros = serviseCuros.lista();
	return new  ResponseEntity<List<Curso>>(listaCuros, HttpStatus.OK);	
	}
	
	@PostMapping
	public ResponseEntity<Curso> registrar(@RequestBody Curso curso){
		Curso newCurso = serviseCuros.registra(curso);
		
		if(newCurso != null) {
			return new ResponseEntity<Curso>(newCurso,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Curso>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PutMapping
	public ResponseEntity<Curso> Actualizar(@RequestBody Curso curso){
			Curso newCurso = serviseCuros.update(curso);
		if(newCurso != null) {
			return new ResponseEntity<Curso>(newCurso,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Curso>(HttpStatus.OK);
		}
		
	}
	@DeleteMapping("/{idCurso}")
	public ResponseEntity<Curso> Actualizar(@PathVariable("idCurso") long idcurso){
		boolean estado = serviseCuros.delete(idcurso);
		if(estado) {
			return new ResponseEntity<Curso>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Curso>(HttpStatus.BAD_REQUEST);
		}
		
	}

}
