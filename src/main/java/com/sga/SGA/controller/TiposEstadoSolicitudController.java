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

import com.sga.SGA.service.EstadoSolicitudService;
import com.sga.SGA.models.EstadoSolicitud;

@RestController
@RequestMapping("/TiposEstadoSolicitud")
public class TiposEstadoSolicitudController {
	
	
	@Autowired
	private EstadoSolicitudService TiposEstaSolicitudService;
	
	@GetMapping
	public ResponseEntity<List<EstadoSolicitud>> listar(){
		
		List<EstadoSolicitud> lstEstadosSoli = TiposEstaSolicitudService.listar();
		return new ResponseEntity<List<EstadoSolicitud>>(lstEstadosSoli ,HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<EstadoSolicitud> registra(@RequestBody EstadoSolicitud newEstadoSolicitud){
		
		EstadoSolicitud newEstadoSol = TiposEstaSolicitudService.registrar(newEstadoSolicitud);
		return new ResponseEntity<EstadoSolicitud>(newEstadoSol,HttpStatus.CREATED);
		
	}
	

}
