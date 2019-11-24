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

import com.sga.SGA.models.modalida;
import com.sga.SGA.service.IModalidadService;

@RestController
@RequestMapping("/Modalidad")
public class ModalidadController {
	
	@Autowired
	private IModalidadService serviceModalidad;

	@GetMapping
	public ResponseEntity<List<modalida>> listar(){
	
		List<modalida> listar = serviceModalidad.listar();
		return new ResponseEntity<List<modalida>>(listar,HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<modalida> registrar(@RequestBody modalida modalidad){
		
		modalida newModalidad = serviceModalidad.registrar(modalidad);
		
		if(newModalidad != null) {
			return new ResponseEntity<modalida>(newModalidad,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<modalida>(HttpStatus.BAD_REQUEST);
			
		}
		
	}
}
