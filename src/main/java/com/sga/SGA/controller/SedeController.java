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

import com.sga.SGA.models.Sede;
import com.sga.SGA.service.SedeService;

@RestController
@RequestMapping("/Sede")
public class SedeController {
	@Autowired
	private SedeService sedeService;
	
	@GetMapping
	public ResponseEntity<List<Sede>> lista(){
		
			List<Sede> listaSedes = sedeService.listar();
			return new ResponseEntity<List<Sede>>(listaSedes,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Sede> Registra(@RequestBody  Sede sede){
		Sede newSede = sedeService.registrar(sede);
		return new ResponseEntity<Sede>(newSede,HttpStatus.CREATED);
	}
}
