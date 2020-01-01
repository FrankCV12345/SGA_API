package com.sga.SGA.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sga.SGA.models.ReporteEstadoSolicitud;
import com.sga.SGA.models.Solcitud_alumno;
import com.sga.SGA.service.Solicitud_alumnoService;

@RestController
@RequestMapping("/SolicitudesAlumno")
public class SolicitudesAlumnoController {
	@Autowired
	private Solicitud_alumnoService solicitudAlumnoService;
	@GetMapping
	public ResponseEntity<List<Solcitud_alumno>> listar(){
	
		List<Solcitud_alumno> lstaAlumno = solicitudAlumnoService.listar();
		
		return new ResponseEntity<List<Solcitud_alumno>>(lstaAlumno,HttpStatus.OK);
		
	}
	@PostMapping
	public ResponseEntity<Solcitud_alumno> registrar(@RequestBody Solcitud_alumno newSolicAlumno ){
		
		Solcitud_alumno newSolicitudAlumno  = solicitudAlumnoService.registrar(newSolicAlumno);
		return new ResponseEntity<Solcitud_alumno>(newSolicitudAlumno,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/reportesolicitudes")
	public ResponseEntity<List<ReporteEstadoSolicitud>> listarReporteEstadoSolicitudes(){
	
		List<ReporteEstadoSolicitud> lstaReporte = solicitudAlumnoService.ReportePorEstadoSolicitud();
		
		return new ResponseEntity<List<ReporteEstadoSolicitud>>(lstaReporte,HttpStatus.OK);
	
	}
	
	
	@GetMapping("/Responsable/{id}")
	public ResponseEntity<List<Solcitud_alumno>> listarPorResponsable( @PathVariable("id") long idresponsable){
	
		List<Solcitud_alumno> lsta = solicitudAlumnoService.listarPorResponsable(idresponsable);
		
		return new ResponseEntity<List<Solcitud_alumno>>(lsta,HttpStatus.OK);
	
	}
	
	@PutMapping
	public ResponseEntity<Solcitud_alumno> ActualizaEstadoSolicitud( @RequestBody Solcitud_alumno solicitud ){
		Solcitud_alumno sol = solicitudAlumnoService.modificarEstadoSecretaria(solicitud);
		return new ResponseEntity<Solcitud_alumno>(sol,HttpStatus.OK);
		
	}
	
	
	
}
