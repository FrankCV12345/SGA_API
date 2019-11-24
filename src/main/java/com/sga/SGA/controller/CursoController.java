package com.sga.SGA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
			return new ResponseEntity<Curso>(HttpStatus.OK);
		}
		
	}

}
