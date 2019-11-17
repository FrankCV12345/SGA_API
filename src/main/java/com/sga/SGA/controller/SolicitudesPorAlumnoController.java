package com.sga.SGA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.models.Solcitud_alumno;
import com.sga.SGA.service.Solicitud_alumnoService;

@RestController
@RequestMapping("/Alumno")
public class SolicitudesPorAlumnoController {

	@Autowired
	private Solicitud_alumnoService solicitudAlumnoService;
	@GetMapping(path="{id}/Solicitudes")
	public ResponseEntity<List<Solcitud_alumno>> listarSolicitudesPorAlumno(@PathVariable("id") long idUser){
		
		List<Solcitud_alumno> ListaSolicitudAlumno  = solicitudAlumnoService.buscaPorIdAlumno(idUser);
		
		if(ListaSolicitudAlumno.size() > 0  ) {
			return new ResponseEntity<List<Solcitud_alumno>>(ListaSolicitudAlumno,HttpStatus.OK);
			
		}else {
			return new ResponseEntity<List<Solcitud_alumno>>(HttpStatus.NOT_FOUND);
			
		}
	}
}
