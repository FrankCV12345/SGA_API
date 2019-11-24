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

import com.sga.SGA.models.Carreras;
import com.sga.SGA.service.CarrerasService;

@RestController
@RequestMapping("/Carreras")
public class CarrerasController {
	@Autowired
	private CarrerasService servciceCArreras;

	@GetMapping
	public ResponseEntity<List<Carreras>> listar(){
		
		List<Carreras> listaCarreras = servciceCArreras.lista();
		return new ResponseEntity<List<Carreras>>(listaCarreras,HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Carreras> registra(@RequestBody Carreras newcarrera){
		
		Carreras NuevaCarrera = servciceCArreras.Registra(newcarrera);
		
		if(NuevaCarrera != null) {
			return  new ResponseEntity<Carreras>(NuevaCarrera,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Carreras>(HttpStatus.BAD_REQUEST);
		}
		
	}
}
