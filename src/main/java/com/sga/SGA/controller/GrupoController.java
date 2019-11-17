package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.sga.SGA.models.Grupo;
import java.util.List;

import com.sga.SGA.service.GrupoService;

@RestController
@RequestMapping("/Grupo")
public class GrupoController {
	@Autowired
	private GrupoService grupoService;
	
	@GetMapping
	public ResponseEntity<List<Grupo>> lista(){
		List<Grupo> listaGrupos =  grupoService.listar();
		return new ResponseEntity<List<Grupo>>(listaGrupos,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Grupo> registra(@RequestBody Grupo grupo ){
		Grupo newGrupo = grupoService.registrar(grupo);
		return new ResponseEntity<Grupo>(newGrupo,HttpStatus.CREATED);
	}
}
