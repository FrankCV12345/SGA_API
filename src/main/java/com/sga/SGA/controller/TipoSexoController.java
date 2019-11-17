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

import com.sga.SGA.models.TipoSexo;
import com.sga.SGA.service.TipoSexoService;

@RestController
@RequestMapping("/TipoSexo")
public class TipoSexoController {
	@Autowired 
	private TipoSexoService serviceTipoSexo;
	
	@GetMapping
	public ResponseEntity<List<TipoSexo>> listaSexo(){
		return new ResponseEntity<List<TipoSexo>>(serviceTipoSexo.listar(),HttpStatus.OK);
	}
	
	@PostMapping
	public  ResponseEntity<TipoSexo> RegistraTipoSexo(@RequestBody TipoSexo tiposexo){
		
		
		 TipoSexo  tipoSexo =    serviceTipoSexo.resgistrar(tiposexo);
		
		return new  ResponseEntity<TipoSexo>(tiposexo,HttpStatus.CREATED);
		
	}

}
