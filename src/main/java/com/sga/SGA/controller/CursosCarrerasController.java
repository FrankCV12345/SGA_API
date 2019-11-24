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

import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.service.CursoCarrerasService;

@RestController
@RequestMapping("CrusosCarreras")
public class CursosCarrerasController {
	
	@Autowired
	private CursoCarrerasService servceCurso;
	
	
	@GetMapping
	public ResponseEntity<List<CursosCarreras>> listar(){
		List<CursosCarreras> lista = servceCurso.lista();
		return new  ResponseEntity<List<CursosCarreras>>(lista,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<CursosCarreras> registrar(@RequestBody CursosCarreras cursoCarrera ){
		CursosCarreras curso = servceCurso.Registrar(cursoCarrera);
		
		if(curso != null) {
			return new ResponseEntity<CursosCarreras>(curso,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<CursosCarreras>(HttpStatus.BAD_REQUEST);

		}
	}
	

}
