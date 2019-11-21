package com.sga.SGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.service.CalificaAlumnoProfesorService;

import java.util.List;
import com.sga.SGA.models.CalificacionAlumnoProfesor;
import com.sga.SGA.models.PerfiCalificafionProfesor;

@RestController
@RequestMapping("/calificacionProfesor")
public class CalificacionAlumnoProfesorController {
	
	
	@Autowired
	private CalificaAlumnoProfesorService calificacionesProfesorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<PerfiCalificafionProfesor> perfilprofesor(@PathVariable("id") long id){
		
		PerfiCalificafionProfesor Calificaciones = calificacionesProfesorService.perfilCalificacion(id);
		
		if(Calificaciones != null) {
			return new ResponseEntity<PerfiCalificafionProfesor>(Calificaciones,HttpStatus.OK);
		}else {
			return new ResponseEntity<PerfiCalificafionProfesor>(HttpStatus.NOT_FOUND);
		}
	
	}
	
	@PostMapping
	public ResponseEntity<CalificacionAlumnoProfesor> registraCalificacion(@RequestBody CalificacionAlumnoProfesor calificacion){
		CalificacionAlumnoProfesor newCalificacion = calificacionesProfesorService.registraCalificacion(calificacion);
		return  new ResponseEntity<CalificacionAlumnoProfesor>(newCalificacion,HttpStatus.CREATED);
	
	}
	

}
