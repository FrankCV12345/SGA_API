package com.sga.SGA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.service.CursoCarrerasService;

@RestController
@RequestMapping("CrusosCarreras")
public class CursosCarrerasController {
	
	@Autowired
	private CursoCarrerasService servceCurso;
	
	
	@GetMapping
	public ResponseEntity<List<CursosCarreras>> listar(){
		List<CursosCarreras> lista = servceCurso.lista();
		return new  ResponseEntity<List<CursosCarreras>>(lista,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<CursosCarreras> registrar(@RequestBody CursosCarreras cursoCarrera ){
		CursosCarreras curso = servceCurso.Registrar(cursoCarrera);
		
		if(curso != null) {
			return new ResponseEntity<CursosCarreras>(curso,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<CursosCarreras>(HttpStatus.BAD_REQUEST);

		}
	}
	
	@PostMapping("/registraCursos")
	public ResponseEntity<CursosCarreras> registrarListaCursos(@RequestBody List<CursosCarreras> cursosCarrera ){
		boolean estado = servceCurso.RegistraCursosParaGrupo(cursosCarrera);
		if(estado) {
			return new ResponseEntity<CursosCarreras>(HttpStatus.CREATED);
		}else {
			return new ResponseEntity<CursosCarreras>(HttpStatus.BAD_REQUEST);

		}
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<List<CursosCarreras>> listarCursosPorGrupo(@PathVariable("id") long idGrupo){
		List<CursosCarreras> lista = servceCurso.ListarCursosPorGrupo(idGrupo);
		return new  ResponseEntity<List<CursosCarreras>>(lista,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> eliminaSuaveCurso(@PathVariable("id") long id){
		Boolean estado =  servceCurso.delete(id);
		if(estado) {
			return new ResponseEntity<Boolean>(estado,HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(estado,HttpStatus.BAD_REQUEST);
		}
		
	}

	
	
}
