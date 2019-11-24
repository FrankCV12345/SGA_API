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

import com.sga.SGA.models.CiclosCarreras;
import com.sga.SGA.service.CiclosCarreraService;

@RestController
@RequestMapping("/CiclosParaCarreras")
public class CiclosController {
	
	@Autowired
	private CiclosCarreraService serviceCiclos;
	
	
	@GetMapping
	public ResponseEntity<List<CiclosCarreras>> listar() {
		List<CiclosCarreras> listaCiclos = serviceCiclos.listar();
		return new ResponseEntity<List<CiclosCarreras>>(listaCiclos, HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<CiclosCarreras> registrar(@RequestBody CiclosCarreras ciclo){
		
		CiclosCarreras ciclonuevo =    serviceCiclos.Registrar(ciclo);
		
		if( ciclonuevo != null ) {
			return new ResponseEntity<CiclosCarreras>(ciclonuevo,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<CiclosCarreras>(HttpStatus.BAD_REQUEST);
		}
		
	}

}
