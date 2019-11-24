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

import com.sga.SGA.models.TurnosCarreras;
import com.sga.SGA.service.ITurnosService;

@RestController
@RequestMapping("/Turno")
public class TurnoController {
	
	@Autowired
	private ITurnosService serviceTurno;
	
	
	@GetMapping
	public ResponseEntity<List<TurnosCarreras>> listar(){
		
		List<TurnosCarreras> lista =  serviceTurno.listar();
		return new ResponseEntity<List<TurnosCarreras>> (lista,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<TurnosCarreras> registrar(@RequestBody TurnosCarreras newTurno ){
		TurnosCarreras turno = serviceTurno.registrar(newTurno);
		
		if(turno != null) {
			return  new  ResponseEntity<TurnosCarreras>(turno,HttpStatus.CREATED);
		}else {
			return  new  ResponseEntity<TurnosCarreras>(HttpStatus.BAD_REQUEST);
		}
		
	}

}
