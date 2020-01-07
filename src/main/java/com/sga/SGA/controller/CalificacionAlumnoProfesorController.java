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
import com.sga.SGA.models.ProfesorPromedio;
import com.sga.SGA.models.Usuario;

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
	
	
	@GetMapping("/{idProfesor}/calificacion/{idAlumno}")
	public ResponseEntity<CalificacionAlumnoProfesor> BuscaCalificacionPorProfesorYalumno(@PathVariable("idProfesor") long idProfesor ,@PathVariable("idAlumno") long idAlumno   ){
		CalificacionAlumnoProfesor Calificacion = calificacionesProfesorService.BuscarPorProfesoryAlumno(idProfesor, idAlumno);
		if(Calificacion == null) {
			return  new ResponseEntity<CalificacionAlumnoProfesor>(Calificacion,HttpStatus.NOT_FOUND);
		}else {
			return  new ResponseEntity<CalificacionAlumnoProfesor>(Calificacion,HttpStatus.OK);
		}
	}
	
	
	@PostMapping
	public ResponseEntity<CalificacionAlumnoProfesor> registraCalificacion(@RequestBody CalificacionAlumnoProfesor calificacion){
		CalificacionAlumnoProfesor newCalificacion = calificacionesProfesorService.registraCalificacion(calificacion);
		return  new ResponseEntity<CalificacionAlumnoProfesor>(newCalificacion,HttpStatus.CREATED);
	
	}
	@GetMapping("/grupo/{id}")
	public ResponseEntity<List<Usuario>> profesoporGrupor(@PathVariable("id") long id){
		
		List<Usuario> profesoresPorGrupo = calificacionesProfesorService.ListaProfesoresPorGrupo(id);
		
		if(profesoresPorGrupo != null) {
			return new ResponseEntity<List<Usuario>>(profesoresPorGrupo,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Usuario>>(HttpStatus.NOT_FOUND);
		}
	
	}
	
	
	@GetMapping("/profesoresPromedio")
	public ResponseEntity<List<ProfesorPromedio> > profesoresPromedio(){
		
		List<ProfesorPromedio> profesoresPromedios = calificacionesProfesorService.ListaProfesoresPromedio();
		
		if(profesoresPromedios != null) {
			return new ResponseEntity<List<ProfesorPromedio>>(profesoresPromedios,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<ProfesorPromedio>>(HttpStatus.NOT_FOUND);
		}
	
	}

}
