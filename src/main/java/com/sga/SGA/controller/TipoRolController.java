package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.sga.SGA.models.TipoRol;
import com.sga.SGA.service.TeipoRolService;

@RestController
@RequestMapping("/TipoRol")
public class TipoRolController {
	@Autowired 
	private TeipoRolService rolService;
	
	
	@GetMapping
	public ResponseEntity<List<TipoRol>> lista(){
		
		List<TipoRol> listaRoles = rolService.listar();
		return new ResponseEntity<List<TipoRol>>(listaRoles,HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<TipoRol> registra(@RequestBody TipoRol tipoRol){
		
		TipoRol newRol = rolService.registrar(tipoRol);
		return new ResponseEntity<TipoRol>(newRol,HttpStatus.CREATED);
	}
	
}
