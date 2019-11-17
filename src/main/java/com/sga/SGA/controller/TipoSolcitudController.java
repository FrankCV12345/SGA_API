package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.service.TipoSolicitudService;
import com.sga.SGA.models.TiposSolicitud;
import java.util.List;

@RestController
@RequestMapping("/TipoSolicitud")
public class TipoSolcitudController {
	@Autowired
	private TipoSolicitudService tipoSolcitudService;
	
	@GetMapping
	public ResponseEntity<List<TiposSolicitud>> listar(){
		List<TiposSolicitud> listatiposSoclicitud = tipoSolcitudService.listar();
		return new ResponseEntity<List<TiposSolicitud>>(listatiposSoclicitud,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<TiposSolicitud> registrar(@RequestBody TiposSolicitud newTipoSolicitud){
		
		TiposSolicitud newTipoSol = tipoSolcitudService.registrar(newTipoSolicitud);
		return new ResponseEntity<TiposSolicitud> (newTipoSol,HttpStatus.CREATED);
		
	}
}
