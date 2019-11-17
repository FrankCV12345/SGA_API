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

import com.sga.SGA.models.TipoDNI;
import com.sga.SGA.service.TipoDNIService;

@RestController
@RequestMapping("/TipoDNI")
public class TipoDNIController {
	@Autowired 
	private TipoDNIService serviceTipoDNI;
	
	
	@GetMapping
	public ResponseEntity<List<TipoDNI>>lisar(){
		List<TipoDNI> listaTIpoDNI = serviceTipoDNI.listar();
		return new ResponseEntity<List<TipoDNI>>(listaTIpoDNI,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<TipoDNI> registro(@RequestBody TipoDNI tipoDni){
		TipoDNI newTipoDNI = serviceTipoDNI.registrar(tipoDni);
		
		return new ResponseEntity<TipoDNI>(newTipoDNI,HttpStatus.CREATED);
		
		
	}
}
