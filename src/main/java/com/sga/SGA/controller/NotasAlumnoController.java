package com.sga.SGA.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.models.GrupoYCursoPorProfesor;
import com.sga.SGA.models.NotasAlumno;
import com.sga.SGA.service.NotasAlumnoService;
@CrossOrigin(origins = "*", methods= {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/NotasAlumno")
public class NotasAlumnoController {
	@Autowired
	private NotasAlumnoService notasService;
	
	
	@GetMapping("/{idAlumno}/cursoCarrera/{idCursoCarrera}")
	public ResponseEntity<NotasAlumno> notasPorAlumno(@PathVariable("idAlumno") long idAlumno,@PathVariable("idCursoCarrera") long idCursoCarrera ){
		
		NotasAlumno notasPorAlumno  = notasService.NotasPorAlumnoYCuros(idAlumno, idCursoCarrera);
			if(notasPorAlumno != null ) {
				

				return new ResponseEntity<NotasAlumno>(notasPorAlumno,HttpStatus.OK);
			}else {
				

				return new ResponseEntity<NotasAlumno>(HttpStatus.NOT_FOUND);
			}
	}
	
	@PostMapping
	public ResponseEntity<NotasAlumno> registraNota(@RequestBody NotasAlumno nota){
		NotasAlumno notita =  notasService.registra(nota);
		return new ResponseEntity<NotasAlumno>(notita,HttpStatus.CREATED);
	}
	
	@GetMapping("/grupoYCursosPorGrupo/{idProfesor}")
	public ResponseEntity<List<GrupoYCursoPorProfesor>> GrupoYCurso(@PathVariable("idProfesor") long idProfesor ){
		List<GrupoYCursoPorProfesor> lst = notasService.ListaCursosPorseccionParaProfesor(idProfesor);
		return new ResponseEntity<List<GrupoYCursoPorProfesor>>(lst, HttpStatus.OK );
		
	}

}
